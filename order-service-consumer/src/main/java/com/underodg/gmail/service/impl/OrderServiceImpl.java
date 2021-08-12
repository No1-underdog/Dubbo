package com.underodg.gmail.service.impl;

import com.underdog.gmail.bean.UserAddress;
import com.underdog.gmail.service.OrderService;
import com.underdog.gmail.service.UserService;

import java.util.List;

/**
 * @author UNDERDOG
 * @creat 2021-08-08-11:34
 */
public class OrderServiceImpl implements OrderService {

    UserService userService;

    public void initOrder(String userID) {

        //获取用户的信息
        List<UserAddress> userAddressList = userService.getUserAddressList(userID);

        System.out.println(userAddressList);
    }
}
