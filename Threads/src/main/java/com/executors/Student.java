/*
 * Student.java
 *
 * created at Apr 11, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.executors;

import java.util.concurrent.Callable;

public class Student implements Callable
{

    @Override
    public Object call() throws Exception
    {
        String doncho = "Дончо";
        return doncho;
    }

}



