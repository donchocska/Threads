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

    String name, city;
    static int age = 27;


    public Doncho()
    {
        System.out.println("Здравей отново " + name + " " + age + "!");
    }


    public Doncho(String city)
    {

        this.city = city;
        System.out.println(city);
    }

//    {
//        name = "Дончо";
//    }
//
//
//    public void methodOne()
//    {
//        System.out.println("Метод 1");
//    }
//
    static
    {
        age = 15;
        System.out.println("Изпълни това първо(От класа Doncho)");
    }
    {
        System.out.println("Инстанс блок от Doncho.java");
    }
//
//
//    public static String myName()
//    {
//
//        String name = "Христо";
//
//        return name;
//
//    }
//
//    {
//        this.name = "Деси";
//        System.out.println(name + " Това Име");
//    }

}
