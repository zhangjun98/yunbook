package com.modo.userloginservice.service.Impl;

import com.modo.userloginservice.bean.User;
import com.modo.userloginservice.dao.userDao;
import com.modo.userloginservice.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:modoyun
 * @TIME:18:01
 * @DATE:2020/6/19 -rf
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private userDao userdao;
    @Override
    public User checkLogin(String username, String password) throws Exception {
        return userdao.checkLogin(username,password);
    }
}
