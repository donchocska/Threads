/*
 * MyTimer.java
 *
 * created at Apr 4, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.timer;

import java.util.Date;
import java.util.TimerTask;

import org.apache.log4j.Logger;

public class MyTimer extends TimerTask
{
    private static final Logger log = Logger.getLogger(MyTimer.class);

    @Override
    public void run()
    {
        log.debug("Задачата се стартира в: " + new Date() + "\n");
        completeTask();
        log.debug("Това " + "\n");
        completeTask();
        log.debug("е " +Runtime.getRuntime().freeMemory()+ "\n");
        completeTask();
        log.debug("Таймер " +Runtime.getRuntime().freeMemory() + "\n");
        completeTask();
        log.debug("Задачата приключи " + new Date() + "\n");

    }


    private void completeTask()
    {
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}



