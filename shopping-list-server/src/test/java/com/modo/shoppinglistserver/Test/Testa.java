package com.modo.shoppinglistserver.Test;


import com.modo.shoppinglistserver.ShoppingListServerApplication;
import com.modo.shoppinglistserver.beans.Book;
import com.modo.shoppinglistserver.beans.ShoppingCar;
import com.modo.shoppinglistserver.dao.ShoppingListDao;
import com.modo.shoppinglistserver.service.ShoppinglistService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:modoyun
 * @TIME:19:22
 * @DATE:2020/6/17 -rf
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShoppingListServerApplication.class)
public class Testa {
    @Resource
    private ShoppingListDao shoppingListDao;
    @Resource
    private ShoppinglistService shoppinglistService;
    @Test
    public void T() throws Exception {
      /*  Book bookById = shoppingListDao.getBookById(799);
        System.out.println(bookById);*/
        /*System.out.println(shoppingListDao.getShoppingCarByUid(1));*/
        //System.out.println(shoppingListDao.getShoppingCarBysAu( 1));
        Integer[] arr = {2,3};
        List<ShoppingCar> shoppingBySid = shoppinglistService.getShoppingBySid(arr);
        System.out.println(shoppingBySid);
    }

}
