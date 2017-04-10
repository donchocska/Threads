/*
 * InterruptTest.java
 *
 * created at Mar 29, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.waitnotify;


public class InterruptTest
{

    public static void main(String[] args)
    {
        Thread t = new Thread()
        {

            public void run()
            {

                try
                {

                    Thread.sleep(2000);        //Thread is sleeping for 10 seconds
                    System.out.println("Thread is start");
                }
                catch (InterruptedException e)
                {
                    //Thread.currentThread().interrupt();
                    System.out.println("Thread is interrupted");
                }
            }
        };

        t.start();

        try
        {
            Thread.sleep(2000);      //Main thread is sleeping for 3 seconds
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

       t.interrupt();         //main thread is

    }

}



