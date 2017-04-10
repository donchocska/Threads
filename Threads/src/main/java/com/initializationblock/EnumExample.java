/*
 * EnumExample.java
 *
 * created at Apr 10, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.initializationblock;


public class EnumExample
{

    public enum Season
    {
        WINTER, FALL, SPRING, SUMMER
    }


    public void getSeason(Season s)
    {
        System.out.println(s);
    }

}
