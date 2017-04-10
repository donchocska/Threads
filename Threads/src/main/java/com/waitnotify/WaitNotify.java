/*
 * WaitNotify.java
 *
 * created at Mar 29, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.waitnotify;


import org.apache.log4j.Logger;


public class WaitNotify
{
    private final static Logger log = Logger.getLogger(WaitNotify.class);


    public synchronized void methodOne()
    {

        Thread t = Thread.currentThread();

        log.debug(t.getName() + " Това ще бъде...\n");
        try
        {
            Thread.sleep(3000);
            wait(); // Освобождава ключа за този обект и чака

        }
        catch (InterruptedException e)
        {

            e.printStackTrace();
        }

        log.debug(t.getName() + " ...Легендарно\n");
    }


    public synchronized void methodTwo()
    {
        Thread t = Thread.currentThread();

        try
        {
            log.debug(" изчакайте... " + t.getName() + "\n");
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        notify(); // Събужда една нишка (на рандом принцип), която чака за събуждане

       // log.debug("Нишка която чака за придобиване на ключ от този обект получи известие от " + t.getName() + "\n");
    }


    public synchronized void methodThree()
    {
        Thread t = Thread.currentThread();
        try
        {
            Thread.sleep(3000);
            log.debug("Метод достъпен от " + t.getName() + "\n");
            wait();
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
