/*
 * WorkForMe.java
 *
 * created at Apr 3, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.threadpool;


import org.apache.log4j.Logger;


public class WorkForMe implements Runnable
{

    private static final Logger log = Logger.getLogger(WorkForMe.class);

    private String s;


    public WorkForMe(String s)
    {
        super();
        this.s = s;
    }


    @Override
    public void run()
    {
        log.debug("Нишката на име: " + Thread.currentThread().getName() + " стартира. Номер на команда: " + s + "\n");
        processSleap();
        log.debug("Нишката на име: " + Thread.currentThread().getName() + " приключи. Номер на команда: " + s + "\n");

    }


    private void processSleap()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }


    /**
     * @return Returns value of s.
     */
    public String getS()
    {
        return s;
    }


    /**
     * @param s New value for s.
     */
    public void setS(String s)
    {
        this.s = s;
    }

}
