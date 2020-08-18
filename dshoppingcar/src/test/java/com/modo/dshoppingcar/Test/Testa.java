package com.modo.dshoppingcar.Test;


import com.modo.dshoppingcar.DshoppingcarApplication;
import com.modo.dshoppingcar.beans.ShoppingCar;
import com.modo.dshoppingcar.dao.ShoppingcarDao;
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
@SpringBootTest(classes = DshoppingcarApplication.class)
public class Testa {
    @Resource
    private ShoppingcarDao shoppingcarDao;

    @Test
    public void T() throws Exception {
        ShoppingCar shoppingCar = new ShoppingCar();
        shoppingCar.setBid(195);
        shoppingCar.setRepoName("武汉仓库");
        shoppingCar.setUid(34);
        shoppingCar.setNum(3);
        int i = shoppingcarDao.AddShoppingcar(shoppingCar);
        System.out.println(i);
    }

}
