package com.modo.userloginservice.dao;

import com.modo.userloginservice.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author:modoyun
 * @TIME:17:38
 * @DATE:2020/6/19 -rf
 */
public interface userDao {
    public User checkLogin(@Param("username") String username, @Param("password") String password) throws Exception;
}
