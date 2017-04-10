/*
 * AtomicTest.java
 *
 * created at Mar 28, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

import org.apache.log4j.Logger;

public class AtomicTest
{
    private final static Logger log = Logger.getLogger(AtomicTest.class);
    private AtomicInteger count = new AtomicInteger(20);
    private AtomicLong count1 = new AtomicLong(0);

    private List<String> list = new ArrayList<String>();
    AtomicReference<List> at = new AtomicReference<List>();


    int [] arr = {10,20,30};
    private AtomicIntegerArray atomarr = new AtomicIntegerArray(arr);

    public void myCount(){


        log.debug(count.incrementAndGet() + "\n");
        //log.debug(atomarr.incrementAndGet(1) + "\n");
    }
}



