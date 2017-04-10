/*
 * Main.java
 *
 * created at Apr 6, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.readwrite;


import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Main
{

    private static final Logger log = Logger.getLogger(Main.class);

    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    private static String message = "a";


    public static void main(String[] args) throws InterruptedException
    {
        PropertyConfigurator.configure("log4j.properties");

        Thread t1 = new Thread(new ReadExample(), "Ничка ReadExample");
        Thread t2 = new Thread(new WriteX(), "Ничка WriteX");
        Thread t3 = new Thread(new WriteY(), "Ничка WriteY");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

    }

    static class ReadExample implements Runnable
    {

        @Override
        public void run()
        {

            for (int i = 0; i <= 10; i++)
            {
                if (lock.isWriteLocked())
                {
                    log.debug("Изчаквам ключ");
                }
                try
                {
                    lock.readLock().lock();

                    log.debug("Нишка за четене " + Thread.currentThread().getName() + " ---> Съобщението е: " + message + "\n");

                }
                finally
                {
                    lock.readLock().unlock();
                }

            }

        }
    }

    static class WriteX implements Runnable
    {

        @Override
        public void run()
        {
            for (int i = 0; i <= 5; i++)
            {

                try
                {
                    lock.writeLock().lock();
                    message = message.concat("x");

                }
                finally
                {
                    lock.writeLock().unlock();
                }

            }
        }

    }

    static class WriteY implements Runnable
    {

        @Override
        public void run()
        {
            for (int i = 0; i <= 5; i++)
            {

                try
                {
                    lock.writeLock().lock();
                    message = message.concat("y");

                }
                finally
                {
                    lock.writeLock().unlock();
                }

            }

        }

    }

}
