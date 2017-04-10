/*
 * Main.java
 *
 * created at Apr 4, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.timer;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Main
{
    private static final Logger log = Logger.getLogger(Main.class);


    public static void main(String[] args) throws ParseException
    {
        PropertyConfigurator.configure("log4j.properties");

        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dateFormatter.parse("2017-04-05 9:38:00");

       if (date.before(new Date()))
        {
            log.debug("Времето е изтекло " + Runtime.getRuntime().freeMemory());

            System.exit(0);
        }
        else if (date.after(new Date()))
        {

            TimerTask timerTask = new MyTimer();
            Timer timer = new Timer(true);

            timer.schedule(timerTask, date);
            // timer.scheduleAtFixedRate(timerTask, 0, 7000);

            log.debug("Задачата ще стартира\n");

            try
            {
                Thread.sleep(1000000);

            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            timer.cancel();
            log.debug("Таймера е спрян\n");

        }

    }

}
