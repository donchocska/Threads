/*
 * NonThreadSafe.java
 *
 * created at Mar 27, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.thread;

import org.apache.log4j.Logger;

public class NonThreadSafe
{
    private final static Logger log = Logger.getLogger(MyThread.class);
    private volatile int value;
    public volatile long l;


    /** Returns a unique value. */
    public int getNext()
    {
        return value++;
    }


    public void myNextValue(){

        value = 10;
        log.debug(value + "\n");
        value = 20;
        log.debug(value + "\n");
        value = 30;
        log.debug(value + "\n");
    }

}
