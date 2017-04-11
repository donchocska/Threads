/*
 * ForkJoinExample.java
 *
 * created at Apr 11, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.executors;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinExample
{

    public static void main(String[] args)
    {
        ForkJoinPool fjp = new ForkJoinPool(4);
    }

}