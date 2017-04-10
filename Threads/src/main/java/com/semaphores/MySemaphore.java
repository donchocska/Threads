/*
 * MySemaphore.java
 *
 * created at Apr 3, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.semaphores;


import java.util.concurrent.Semaphore;

import org.apache.log4j.Logger;


public class MySemaphore
{
    private final static Logger log = Logger.getLogger(MySemaphore.class);

    static Semaphore semaphore = new Semaphore(1, true);

    volatile int counter = 0;


    public void counter()
    {
        try
        {
            semaphore.acquire();
            counter++;
            log.debug(counter + " ");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        finally
        {
            semaphore.release();
        }
    }

    static class MySemaphorePermits extends Thread
    {

        volatile int count = 0;


        @Override
        public void run()
        {
            try
            {
                log.debug(Thread.currentThread().getName() + " : очаква ключ...\n");
                log.debug(Thread.currentThread().getName() + " : свободни ключове в момента " + semaphore.availablePermits() + "\n");

                semaphore.acquire();
                Thread.sleep(1000);
                log.debug(Thread.currentThread().getName() + " : получи достъп\n");
                Thread.sleep(1000);
                try
                {
                    for (int i = 1; i <= 1; i++)
                    {

                        log.debug(Thread.currentThread().getName() + " Влезе в логиката и Изпълнява необходимата операция + брояч= " + count + ", свободни ключове в момента " + semaphore.availablePermits() + "\n");

                        Thread.sleep(1000);
                    }
                }
                finally
                {
                    log.debug(Thread.currentThread().getName() + " освобождава ключа... " + "\n");
                    Thread.sleep(2000);
                    semaphore.release();
                    log.debug(Thread.currentThread().getName() + " Свободни ключове в момента: " + semaphore.availablePermits() + "\n");
                    count++;
                }

            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }

}
