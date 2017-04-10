/*
 * Main.java
 *
 * created at Apr 10, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.lambdaexpresion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
/*        Owner owner = new Owner();

        owner.addStateListener(new StateChangeListener()
        {

            @Override
            public void onStateChange(String oldState, String newState)
            {
                System.out.println("Това е state" + oldState);
            }
        });


        owner.addStateListener((oldState, newState) -> System.out.println("State changed"));*/

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);


        list.forEach(i-> System.out.println(i));


    }

}



