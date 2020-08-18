package com.modo.useraddressservice.dao;

import com.modo.useraddressservice.bean.Address;

import java.util.List;

/**
 * @Author:modoyun
 * @TIME:15:28
 * @DATE:2020/6/20 -rf
 */
public interface AddressDao {
    // 通过用户id查询地址 查到的是用户所有的值
    public List<Address> getByuid(Integer uid) throws Exception;
    // 通过用户id查询用户的默认
    // 默认，查出来的第一个为系统默认。如果不存在
    public Address getBytype(Integer uid,Integer type) throws Exception;
}
