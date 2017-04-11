/*
 * Employees.java
 *
 * created at Apr 11, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.executors;


import java.util.concurrent.Callable;


public class Employees implements Callable
{

    private String name;
    private int age;


    public Employees()
    {

    }


    public Employees(String name, int age)
    {
        super();
        this.name = name;
        this.age = age;

        System.out.println("Име: " + name + " Години: " + age);
    }


    /**
     * @return Returns value of name.
     */
    public String getName()
    {
        return name;
    }


    /**
     * @param name New value for name.
     */
    public void setName(String name)
    {
        this.name = name;
    }


    /**
     * @return Returns value of age.
     */
    public int getAge()
    {
        return age;
    }


    /**
     * @param age New value for age.
     */
    public void setAge(int age)
    {
        this.age = age;
    }


    @Override
    public Object call() throws Exception
    {

        return new Employees(name, age);
    }


    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Employees [name=" + name + ", age=" + age + "]";
    }

}
