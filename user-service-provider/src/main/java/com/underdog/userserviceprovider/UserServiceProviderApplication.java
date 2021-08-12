package com.underdog.userserviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class UserServiceProviderApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(UserServiceProviderApplication.class, args);

        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("providor.xml");

        ioc.start();

        System.in.read();
    }

}
