/*
 * Main.java
 *
 * created at Apr 3, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.threadpool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Main
{
    private static final Logger log = Logger.getLogger(WorkForMe.class);

    public static void main(String[] args)
    {
        PropertyConfigurator.configure("log4j.properties");

        ExecutorService ex = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++)
        {

            Thread t1 = new Thread(new WorkForMe(Integer.toString(i)), Thread.currentThread().getName());
            ex.execute(t1);

        }
        ex.shutdown();

    }

}
