package com.modo.shoppinglistserver.service;

import com.modo.shoppinglistserver.beans.ShoppingCar;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:modoyun
 * @TIME:19:22
 * @DATE:2020/6/20 -rf
 */
public interface ShoppinglistService {
    /**
     * 通过用户的id查询初所有的订单
     * @param uid
     * @return
     * @throws Exception
     */
    public List<ShoppingCar> getShoppingByUid(Integer uid) throws Exception;
    public List<ShoppingCar> getShoppingBySid(Integer[] sid) throws Exception;
}
