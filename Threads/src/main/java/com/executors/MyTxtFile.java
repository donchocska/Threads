/*
 * MyTxtFile.java
 *
 * created at Apr 11, 2017 by d.balamdzhiev <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.executors;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MyTxtFile implements Runnable
{
    File file;
    InputStream in;


    @Override
    public void run()
    {

        file = new File("test.txt");
        try
        {
            in = new FileInputStream(file);
            int i = -1;

            byte[] buffer = new byte[1024];

            List<Character> list = new ArrayList<Character>();

            while ((i = in.read()) != -1)
            {
                list.add((char)i);

            }

            Character[] chara = list.toArray(new Character[0]);

            Character[] ordered = Arrays.copyOfRange(chara, 0, 15);

            for (Character c : ordered)
            {
                System.out.print(c);
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (in != null)
            {
                try
                {
                    in.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }

    }

}
