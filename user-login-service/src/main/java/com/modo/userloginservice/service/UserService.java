package com.modo.userloginservice.service;

import com.modo.userloginservice.bean.User;

/**
 * @Author:modoyun
 * @TIME:18:00
 * @DATE:2020/6/19 -rf
 */
public interface UserService {
    public User checkLogin(String username, String password) throws Exception;
}
