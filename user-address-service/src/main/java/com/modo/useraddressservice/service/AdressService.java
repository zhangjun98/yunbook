package com.modo.useraddressservice.service;

import com.modo.useraddressservice.bean.Address;

import java.util.List;

/**
 * @Author:modoyun
 * @TIME:17:09
 * @DATE:2020/6/20 -rf
 */
public interface AdressService {
    /**
     * 得到所有的地址
     * @param uid
     * @return
     * @throws Exception
     */
    public List<Address> getByUid(Integer uid) throws Exception;
    public Address getByuAt(Integer uid,Integer type) throws Exception;
}
