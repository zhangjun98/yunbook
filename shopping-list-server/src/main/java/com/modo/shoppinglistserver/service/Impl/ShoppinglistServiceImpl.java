package com.modo.shoppinglistserver.service.Impl;

import com.modo.shoppinglistserver.beans.ShoppingCar;
import com.modo.shoppinglistserver.dao.ShoppingListDao;
import com.modo.shoppinglistserver.service.ShoppinglistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:modoyun
 * @TIME:19:24
 * @DATE:2020/6/20 -rf
 */
@Service
public class ShoppinglistServiceImpl implements ShoppinglistService {
    @Resource
    private ShoppingListDao shoppingListDao;
    @Override
    public List<ShoppingCar> getShoppingByUid(Integer uid) throws Exception {
        return shoppingListDao.getShoppingCarByUid(uid);
    }

    @Override
    public List<ShoppingCar> getShoppingBySid(Integer[] arr) throws Exception {
        List<ShoppingCar> shoppinglist = new ArrayList<>();
        //ShoppingCar shoppingCar = new ShoppingCar(1,2,3,"rrr",44,null);
        for (int i = 0; i<arr.length;i++){
            ShoppingCar shoppingCarBysAu = shoppingListDao.getShoppingCarBysAu(arr[i]);
            System.out.println("shoppingart:" + shoppingCarBysAu.getBid());
            shoppinglist.add(shoppingCarBysAu);
        }
        return shoppinglist;
    }
}
