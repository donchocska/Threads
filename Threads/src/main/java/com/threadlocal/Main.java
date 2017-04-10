/*
 * Main.java
 *
 * created at Apr 3, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.threadlocal;


import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Main
{

    private static final Logger log = Logger.getLogger(Main.class);

    private static final ThreadLocal<Map<Integer, String>> local = new ThreadLocal<Map<Integer, String>>();


    public static void main(String[] args)
    {
        PropertyConfigurator.configure("log4j.properties");

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Ива");
        map.put(2, "Дончо");

        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {

                local.set(map);

                log.debug(local.get().values() + " MAP");

            }
        };

        t1.start();

    }

}
