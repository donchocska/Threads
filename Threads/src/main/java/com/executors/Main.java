/*
 * Main.java
 *
 * created at Apr 11, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.executors;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main
{

    public static void main(String[] args)
    {

        ExecutorService exser = Executors.newSingleThreadExecutor();

        try
        {
            exser.execute(new Runnable()
            {

                @Override
                public void run()
                {
                    System.out.println("Нишка");
                }
            });

            exser.submit(new Runnable()
            {

                @Override
                public void run()
                {
                    System.out.println("Нишка 2");

                }
            });
        }
        finally
        {

            if (!exser.isShutdown())
            {
                exser.shutdown();
            }
        }

    }

}
