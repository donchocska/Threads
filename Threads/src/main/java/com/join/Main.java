/*
 * Main.java
 *
 * created at Mar 30, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.join;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Main
{
    private final static Logger log = Logger.getLogger(Main.class);


    public static void main(String[] args) throws InterruptedException
    {
        PropertyConfigurator.configure("log4j.properties");

        BusStation bs = new BusStation();

        Thread t1 = new Thread( new BusStation(), "t1");
        Thread t2= new Thread(new BusStation(), "t2");


        t1.start();
        t1.join();
        t2.start();

    }

}
