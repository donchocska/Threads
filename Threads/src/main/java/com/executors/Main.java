/*
 * Main.java
 *
 * created at Apr 11, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.executors;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import com.initializationblock.Doncho;


public class Main
{

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException
    {

        ExecutorService exser = Executors.newSingleThreadExecutor();

        ExecutorService ex = Executors.newFixedThreadPool(10);
        Thread t1 = new Thread(new Runnable()
        {

            @Override
            public void run()
            {
                System.out.println("Нишка 1");

            }
        }, "Нишка1");
        Thread t2 = new Thread(new Runnable()
        {

            @Override
            public void run()
            {
                System.out.println("Нишка 2 до callable");

            }
        }, "Нишка2");
        Thread t3 = new Thread(new Runnable()
        {

            @Override
            public void run()
            {
                System.out.println("Нишка 3 до callable");

            }
        }, "Нишка3");

        Future don = null;

        try
        {
            exser.execute(new Runnable()
            {

                @Override
                public void run()
                {
                    System.out.println("Нишка");
                }
            });

            exser.submit(new Runnable()
            {

                @Override
                public void run()
                {
                    System.out.println("Нишка submit");

                }
            });

            Future f = exser.submit(t1);

            don = ex.submit(new Student());
            System.out.println(don.get(2000, TimeUnit.MILLISECONDS));

            Callable ct2 = Executors.callable(t2);
            ex.submit(ct2);
            Callable ct3 = Executors.callable(t3);
            t3.start();
            ex.submit(ct3);

            Callable cal = new Student();
            Future student = ex.submit(cal);
            System.out.println(student.get());

            List<Future> callableList = new ArrayList<Future>();
            callableList.add(f);
            callableList.add(student);

            System.out.println("=========Employees==========");

            Employees doncho = new Employees();
            doncho.setName("Дончо");
            doncho.setAge(27);
            Employees emi = new Employees();
            emi.setName("Емилия");
            emi.setAge(25);
            Employees vania = new Employees();
            vania.setName("Ваня");
            vania.setAge(29);

            List<Callable<String>> listEmployees = new ArrayList<Callable<String>>();
            listEmployees.add(doncho);
            listEmployees.add(emi);
            listEmployees.add(vania);

            List<Future<String>> futures = ex.invokeAll(listEmployees);

            for (Future<String> fu : futures)
            {
               fu.get();
            }

            ex.submit(new MyTxtFile());

        }
        finally
        {

            if (!exser.isShutdown())
            {
                exser.shutdown();
            }
            if (!ex.isShutdown())
            {
                ex.shutdownNow();

            }
        }

    }

}
