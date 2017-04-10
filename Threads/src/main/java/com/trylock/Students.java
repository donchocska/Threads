/*
 * Students.java
 *
 * created at Mar 30, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.trylock;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.log4j.Logger;


public class Students
{
    private final static Logger log = Logger.getLogger(Students.class);

    final ReentrantLock reenrant = new ReentrantLock();


    public synchronized void student()
    {
        try
        {
            boolean flag = reenrant.tryLock(1000, TimeUnit.MILLISECONDS);

            if (flag)
            {

                log.debug("Получих достъп до учениците: " + Thread.currentThread().getName() + "\n");

            }
            else
            {
                log.debug("Нямам достъп до учениците: " + Thread.currentThread().getName() + "\n");
            }
            notify();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            reenrant.unlock();
        }
    }


    public synchronized void otherStudent()
    {

        try
        {
            wait();
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        log.debug("Получих достъп до друг ученик и пращам известие: " + Thread.currentThread().getName() + "\n");

    }

}
