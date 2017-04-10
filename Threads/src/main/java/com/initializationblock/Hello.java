/*
 * Hello.java
 *
 * created at Apr 7, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.initializationblock;


public class Hello extends Doncho
{

    static String name = "Дончо";


    public Hello()
    {
        super();
        System.out.println("Изпълнявам след Някакъв instance block");

    }

    static
    {
        name = "Петранка";
        System.out.println("Здравей " + name);
        new Doncho("Хисаря");

    }

    {
        System.out.println("Някакъв instance block");
    }

}
