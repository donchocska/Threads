/*
 * Doncho.java
 *
 * created at Apr 10, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.initializationblock;


public class Doncho
{

    String name;
    static int age = 27;


    public Doncho()
    {
        System.out.println("Здравей отново " + name + " " + age + "!");
    }

    {
        name = "Дончо";
    }


    public void methodOne()
    {

    }

    static
    {
        System.out.println("Изпълни това първо");
    }

}
