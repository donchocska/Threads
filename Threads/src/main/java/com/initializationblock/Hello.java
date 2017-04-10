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


    public Hello(){
        super();
    }

    static
    {
        System.out.println("Здравей " + name);
    }

}
