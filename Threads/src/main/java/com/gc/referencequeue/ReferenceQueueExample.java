/*
 * ReferenceQueueExample.java
 *
 * created at Apr 6, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.gc.referencequeue;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class ReferenceQueueExample
{

    public static void main(String[] args) throws InterruptedException
    {

        String s = new String("Doncho");

        ReferenceQueue<String> ref = new ReferenceQueue<>();

        PhantomReference<String> phantom = new PhantomReference<String>(s, ref);


        s=null;


        new Thread(new Runnable()
        {

            @Override
            public void run()
            {

                try
                {
                    PhantomReference pref = (PhantomReference)ref.remove();
                    System.out.println(" обекта е рециклиран");
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        }).start();

        Thread.sleep(2000);

        System.out.println("Извикване на GC");
        System.gc();

    }

}



