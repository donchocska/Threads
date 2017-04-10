/*
 * Producer.java
 *
 * created at Mar 29, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.waitnotify;


import java.util.List;

import org.apache.log4j.Logger;


public class Producer implements Runnable
{
    private List<Integer> taskQueue;
    private int MAX_CAPACITY;

    private final static Logger log = Logger.getLogger(Producer.class);


    public Producer(List<Integer> taskQueue, int mAX_CAPACITY)
    {
        super();
        this.taskQueue = taskQueue;
        MAX_CAPACITY = mAX_CAPACITY;
    }


    @Override
    public void run()
    {
        int counter = 0;
        while (true)
        {
            try
            {
                produce(counter++);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }


    public void produce(int i) throws InterruptedException
    {
        synchronized (taskQueue)
        {
            while (taskQueue.size() == MAX_CAPACITY)
            {
                log.debug("Queue is full " + Thread.currentThread().getName() + " is waiting, size: ");
                taskQueue.wait();

            }
            Thread.sleep(1000);
            taskQueue.add(i);
            log.debug("Producer: " + i);
            taskQueue.notifyAll();
        }

    }

}
