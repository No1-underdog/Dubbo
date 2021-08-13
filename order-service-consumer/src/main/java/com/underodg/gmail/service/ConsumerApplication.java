package com.underodg.gmail.service;

import com.underdog.gmail.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author UNDERDOG
 * @creat 2021-08-13-15:10
 */
public class ConsumerApplication {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");

        OrderService orderService = applicationContext.getBean(OrderService.class);
        orderService.initOrder("1");
        System.out.println("完成对orderService 的调用");


        System.in.read();
    }

}
