/*
 * Main.java
 *
 * created at Apr 3, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.deadlock;


import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;


public class Main
{

    public static void main(String[] args)
    {

        DeadlockTest dlt1 = new DeadlockTest();
        DeadlockTest dlt2 = new DeadlockTest();

        Thread t1 = new Thread("Нишка-1")
        {
            @Override
            public void run()
            {
                System.out.println(Thread.currentThread().getState());
                dlt1.methodOne(dlt2);

            }
        };

        Thread t2 = new Thread("Нишка-2")
        {
            @Override
            public void run()
            {
                dlt2.methodTwo(dlt1);
            }
        };

        t1.start();
        t2.start();

        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        ThreadMXBean tmx = ManagementFactory.getThreadMXBean();

        long[] deadlock = tmx.findMonitorDeadlockedThreads();

        if (deadlock != null)
        {
            ThreadInfo[] threadinfo = tmx.getThreadInfo(deadlock);

            for (ThreadInfo t : threadinfo)
            {

                System.out.println(t.getThreadId() + " е блокирана");
                System.out.println(t.getThreadState() + " е блокирана");
                System.out.println(t.getLockOwnerName() + " е блокирана");

            }
        }
        else
        {
            System.out.println(" Няма блокирани нишки");
        }

    }

}
