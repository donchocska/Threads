/*
 * DeadlockTest.java
 *
 * created at Apr 3, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.deadlock;


public class DeadlockTest extends Thread
{

    synchronized void methodOne(DeadlockTest s)
    {


        System.out.println(Thread.currentThread().getName()+"is executing methodOne..." + Thread.currentThread().getState());

        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+"is calling methodTwo...");

        s.methodTwo(this);

        System.out.println(Thread.currentThread().getName()+"is finished executing methodOne...");
    }

    synchronized void methodTwo(DeadlockTest s)
    {

        System.out.println(Thread.currentThread().getName()+"is executing methodTwo...");

        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+"is calling methodOne...");

        s.methodOne(this);

        System.out.println(Thread.currentThread().getName()+"is finished executing methodTwo...");
    }

}



