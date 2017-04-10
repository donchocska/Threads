/*
 * Main.java
 *
 * created at Mar 27, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.thread;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Main
{
    private final static Logger log = Logger.getLogger(Main.class);


    public static void main(String[] args)
    {
        PropertyConfigurator.configure("log4j.properties");

        // if (args.length == 0)
        // new MyThread ().start ();
        // else
        // {
        // MyThread mt = new MyThread ();
        // mt.setDaemon (true);
        // mt.start ();
        // }
        // try
        // {
        // Thread.sleep (100);
        // }
        // catch (InterruptedException e)
        // {
        // }

        final NonThreadSafe non = new NonThreadSafe();

        final AtomicTest a = new AtomicTest();
        final Worker w = new Worker();

        Thread t1 = new Thread("t1")
        {

            @Override
            public void run()
            {
                // log.debug(non.getNext() + "\n");
                // non.myNextValue();
                a.myCount();
            }
        };

        Thread t2 = new Thread("t2")
        {

            @Override
            public void run()
            {
                // log.debug(non.getNext()+"\n");
                // non.myNextValue();
                a.myCount();
            }
        };

        Thread t3 = new Thread("t3")
        {

            @Override
            public void run()
            {
                // log.debug(non.getNext()+"\n");
                // non.myNextValue();
                a.myCount();
            }
        };

        t1.setPriority(1);

        t2.setPriority(t1.getPriority());

        t3.setPriority(10);


        t1.start();
        t2.start();
        t3.start();

       // log.debug("Т1 Приоритет: " + t1.getPriority() + "\n");
      //  log.debug("Т2 Приоритет: " + t2.getPriority() + "\n");

        Thread t4 = new Thread(w, "Нишка 1");
        Thread t5 = new Thread(w, "Нишка 2");
        Thread t6 = new Thread(w, "Нишка 3");

//        t4.start();
//        t5.start();
//        t6.start();

    }

}
