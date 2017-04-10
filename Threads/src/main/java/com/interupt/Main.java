/*
 * Main.java
 *
 * created at Mar 29, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.interupt;


public class Main
{

    public static void main(String[] args)
    {
        Thread t = new Thread()
        {
            @Override
            public void run()
            {

                while (true)
                {
                    if (Thread.currentThread().interrupted())
                    {
                        System.out.println("Спряха ме");
                        break;
                    }
                    System.out.println("Da");
                    Thread.currentThread().interrupt();
                }
            }
        };
        t.start();
        //t.interrupt();
    }

}
