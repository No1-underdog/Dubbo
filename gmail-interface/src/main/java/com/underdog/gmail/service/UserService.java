package com.underdog.gmail.service;

import com.underdog.gmail.bean.UserAddress;

import java.util.List;

/**
 * @author UNDERDOG
 * @creat 2021-08-08-11:23
 */
public interface UserService {

    //用户服务

    /**
     * 按照用户id返回所有的收货地址
     *
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);


    void getUserAddressList();
}
