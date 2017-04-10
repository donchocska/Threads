/*
 * Main.java
 *
 * created at Mar 30, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.trylock;


import java.util.concurrent.Semaphore;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Main
{

    private final static Logger log = Logger.getLogger(Main.class);


    public static void main(String[] args) throws InterruptedException
    {
        PropertyConfigurator.configure("log4j.properties");
        Students s = new Students();

        Thread t1 = new Thread("t1")
        {
            @Override
            public void run()
            {
                try
                {
                    Thread.sleep(3000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                s.otherStudent();
            }
        };
        Thread t2 = new Thread("t2")
        {
            @Override
            public void run()
            {
                try
                {
                    Thread.sleep(5000);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                s.student();
            }
        };
        Thread t3 = new Thread("t3")
        {
            @Override
            public void run()
            {
                s.student();
            }
        };

        t1.start();
        t2.start();
        t3.start();

    }

}
