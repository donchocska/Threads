/*
 * Main.java
 *
 * created at Apr 7, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.initializationblock;


import javax.swing.JComboBox;

import com.initializationblock.EnumExample.Season;


public class Main
{

    public static void main(String[] args) throws InstantiationException, IllegalAccessException
    {
        // Main m = new Main();
        // Hello doncho = new Hello();

        // System.out.println("Искам първо това");
        // try
        // {
        // Main.class.newInstance();
        // }
        // catch (InstantiationException | IllegalAccessException e)
        // {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        //
        // new Doncho();
        // new Doncho();
        // new Hello();

        new Hello();
        EnumExample e = new EnumExample();

        JComboBox combo = new JComboBox(Season.values());

        System.out.println(combo.getItemAt(3));

    }

    {
        int number = 99;
        System.out.println("супер Якооо " + number);
    }

    {
        int number = 100;
        System.out.println("супер Якооо " + number);
    }

    static
    {

        int age = 28;
        System.out.println("Якооо " + age);
    }

    static
    {
        int age = 27;
        System.out.println("Якооо " + age);
        Thread t1 = new Thread(new Runnable()
        {

            @Override
            public void run()
            {
                System.out.println("Резултат от Нишка 1");
            }
        }, "Нишка-1");

        t1.start();
    }

}
