/*
 * ProducerCustomerExample.java
 *
 * created at Mar 29, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.waitnotify;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class ProducerCustomerExample
{

    private final static Logger log = Logger.getLogger(ProducerCustomerExample.class);


    public static void main(String[] args)
    {
        PropertyConfigurator.configure("log4j.properties");

        final WaitNotify wn = new WaitNotify();

        Thread t1 = new Thread("Нишка 1"){
            @Override
            public void run()
            {
                wn.methodOne();

            }
        };
        Thread t2 = new Thread("Нишка 2"){
            @Override
            public void run()
            {
               wn.methodTwo();
            }
        };

        Thread t3 = new Thread("Нишка 3"){
            @Override
            public void run()
            {
               wn.methodOne();
            }
        };

        t1.start();
        t3.start();
      //  t2.setPriority(3);
        t2.start();

    }

}
