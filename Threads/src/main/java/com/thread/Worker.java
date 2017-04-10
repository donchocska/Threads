/*
 * Worker.java
 *
 * created at Mar 28, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.log4j.Logger;

public class Worker implements Runnable
{
    private final static Logger log = Logger.getLogger(Worker.class);
    private final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run()
    {
        try
        {

            lock.lockInterruptibly();

            log.debug(Thread.currentThread().getName() + " - 1\n");

            log.debug(Thread.currentThread().getName() + " - 2\n");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }finally {
           lock.unlock();
        }


       // lock.unlock();
       // log.debug(Thread.currentThread().getName() + " - 3\n");


    }
}



