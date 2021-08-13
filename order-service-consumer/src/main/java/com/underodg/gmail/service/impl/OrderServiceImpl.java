package com.underodg.gmail.service.impl;

import com.underdog.gmail.bean.UserAddress;
import com.underdog.gmail.service.OrderService;
import com.underdog.gmail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author UNDERDOG
 * @creat 2021-08-08-11:34
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    public UserService userService;

    public void initOrder(String userID) {

        //获取用户的信息
        List<UserAddress> userAddressList = userService.getUserAddressList(userID);
        System.out.println("当前接收到的userId=> "+userID);
        System.out.println("**********");
        System.out.println("查询到的所有地址为：");

        for(UserAddress userAddress : userAddressList){
            System.out.println(userAddress.getUserAddress());
        }

    }
}
