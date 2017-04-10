/*
 * Main.java
 *
 * created at Apr 5, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.gc;


public class Main
{

    public static void main(String[] args)
    {
        System.gc();

        Runtime.getRuntime().gc();

        Person p = new Person();
        p.car = new Car();
        p.car.engine = new Engine();

    }

}
