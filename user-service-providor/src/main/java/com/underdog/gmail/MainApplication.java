package com.underdog.gmail;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author UNDERDOG
 * @creat 2021-08-08-12:26
 */
public class MainApplication {

    public static void main(String[] args)  {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("providor.xml");
        ioc.start();

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
