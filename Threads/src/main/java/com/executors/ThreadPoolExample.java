/*
 * ThreadPoolExample.java
 *
 * created at Apr 11, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample
{

    public static void main(String[] args)
    {

        ExecutorService tpes = new ThreadPoolExecutor(5, 10, 5, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());

        Thread t1 = new Thread(new Runnable()
        {

            @Override
            public void run()
            {
               System.out.println("Нова нишка");

            }
        });

        tpes.submit(t1);

        tpes.shutdown();
    }

}