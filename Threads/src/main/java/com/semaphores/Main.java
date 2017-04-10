/*
 * Main.java
 *
 * created at Mar 30, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.semaphores;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.semaphores.MySemaphore.MySemaphorePermits;


public class Main
{

    private final static Logger log = Logger.getLogger(Main.class);


    public static void main(String[] args) throws InterruptedException
    {
        PropertyConfigurator.configure("log4j.properties");

        Thread t1 = new Thread()
        {

            @Override
            public void run()
            {
                log.debug("Това е user thread");
            }

        };

        Thread t2 = new Thread()
        {

            @Override
            public void run()
            {
                log.debug("Това е daemon thread");
            }

        };

        t1.start();

        t2.setDaemon(true);
        t2.start();

        MySemaphore ms = new MySemaphore();

        Thread t15 = new Thread("SemaphoreOne")
        {
            @Override
            public void run()
            {
                ms.counter();
            }
        };
        Thread t16 = new Thread("SemaphoreTwo")
        {
            @Override
            public void run()
            {
                ms.counter();
            }
        };
        Thread t17 = new Thread("SemaphoreThree")
        {
            @Override
            public void run()
            {
                ms.counter();
            }
        };
        Thread t18 = new Thread("SemaphoreFour")
        {
            @Override
            public void run()
            {
                ms.counter();
            }
        };
        Thread t19 = new Thread("SemaphoreFive")
        {
            @Override
            public void run()
            {
                ms.counter();
            }
        };


        // Thread t8 = new Thread(new MySemaphore(), "SemaphoreSix");
        // Thread t9 = new Thread(new MySemaphore(), "SemaphoreSeven");
        // Thread t10 = new Thread(new MySemaphore(), "SemaphoreEigth");
        // Thread t11 = new Thread(new MySemaphore(), "SemaphoreNine");
        // Thread t12 = new Thread(new MySemaphore(), "SemaphoreTen");
        // Thread t13 = new Thread(new MySemaphore(), "SemaphoreEleven");
        // Thread t14 = new Thread(new MySemaphore(), "SemaphoreTwelve");

        MySemaphorePermits t3 = new MySemaphorePermits();
        MySemaphorePermits t4 = new MySemaphorePermits();
        MySemaphorePermits t5 = new MySemaphorePermits();
        MySemaphorePermits t6 = new MySemaphorePermits();
        MySemaphorePermits t7 = new MySemaphorePermits();
        MySemaphorePermits t8 = new MySemaphorePermits();
        MySemaphorePermits t9 = new MySemaphorePermits();
        MySemaphorePermits t10 = new MySemaphorePermits();
        MySemaphorePermits t11 = new MySemaphorePermits();
        MySemaphorePermits t12 = new MySemaphorePermits();
        MySemaphorePermits t13 = new MySemaphorePermits();
        MySemaphorePermits t14 = new MySemaphorePermits();

//        t3.start();
//        t4.start();
//        t5.start();
//        t6.start();
//        t7.start();
//        t8.start();
//        t9.start();
//        t10.start();
//        t11.start();
//        t12.start();
//        t13.start();
//        t14.start();

        t15.start();
        t16.start();
        t17.start();
        t18.start();

    }
}
