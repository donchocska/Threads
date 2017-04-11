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
        /*
         * Owner owner = new Owner(); owner.addStateListener(new StateChangeListener() {
         * @Override public void onStateChange(String oldState, String newState) { System.out.println("Това е state" + oldState); } });
         * owner.addStateListener((oldState, newState) -> System.out.println("State changed"));
         */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        list.forEach(i -> System.out.println(i));

        int x = 5;

        Runnable task2 = () -> {
            System.out.println("Task #2 is running");
        };

        new Thread(task2).start();

        List<String> players = new ArrayList<String>();
        players.add("Джоката");
        players.add("Гришо");
        players.add("Надал");
        players.add("Кей");
        players.add("Федерер");

        players.forEach((player) -> System.out.println(player));
        System.out.println("=============");
        players.forEach(System.out::println);

    }

}
