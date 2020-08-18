package com.modo.dshoppingcar.service.Impl;

import com.modo.dshoppingcar.beans.ShoppingCar;
import com.modo.dshoppingcar.dao.ShoppingcarDao;
import com.modo.dshoppingcar.service.ShoppingCarSercive;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:modoyun
 * @TIME:6:57
 * @DATE:2020/6/19 -rf
 */
@Service
public class ShoppingCarServiceImpl implements ShoppingCarSercive {
    @Resource
    private ShoppingcarDao shoppingcarDao;
    @Override
    public int addShoppingcar(ShoppingCar shoppingCar) throws Exception {
        return shoppingcarDao.AddShoppingcar(shoppingCar);
    }
}
