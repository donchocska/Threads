/*
 * MyThread.java
 *
 * created at Mar 27, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.thread;

import org.apache.log4j.Logger;

public class MyThread extends Thread
{
    private final static Logger log = Logger.getLogger(MyThread.class);

        public synchronized void run()
        {
           log.debug("Daemon is " + isDaemon());
           while(true);

        }



}



