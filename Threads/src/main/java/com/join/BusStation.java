/*
 * BusStation.java
 *
 * created at Mar 30, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.join;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import sun.awt.TimedWindowEvent;


public class BusStation implements Runnable
{
    private final static Logger log = Logger.getLogger(Main.class);



    Calendar calendar = new GregorianCalendar();
    private int in = calendar.SECOND;
    private int out = calendar.SECOND + 30;


    @Override
    public void run()
    {
        log.debug("Пристигане: " + in + " часа " + Thread.currentThread().getName() + "\n");

        try
        {
            Thread.sleep(0, 10);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        log.debug("Заминаване: " + out + " часа " + Thread.currentThread().getName() + "\n");
        }

    /**
     * @return Returns value of in.
     */
    public int getIn()
    {
        return in;
    }

    /**
     * @param in New value for in.
     */
    public void setIn(int in)
    {
        this.in = in;
    }


    /**
     * @return Returns value of out.
     */
    public int getOut()
    {
        return out;
    }


    /**
     * @param out New value for out.
     */
    public void setOut(int out)
    {
        this.out = out;
    }

}
