/*
 * Main.java
 *
 * created at Apr 5, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.label;


public class Main
{

    public static void main(String[] args)
    {

        int[] numbers = new int[]{100, 18, 21, 30};

        A: for (int i = 0; i < numbers.length; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println("Odd number: " + i + ", continue from OUTER label " + numbers[i]);
                continue A;
                //break A;
            }

        }

    }

}
