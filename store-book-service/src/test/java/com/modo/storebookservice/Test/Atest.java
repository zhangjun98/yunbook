package com.modo.storebookservice.Test;

import com.modo.storebookservice.Beans.Repo;
import com.modo.storebookservice.StoreBookServiceApplication;
import com.modo.storebookservice.dao.RefoDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author:modoyun
 * @TIME:19:56
 * @DATE:2020/6/18 -rf
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StoreBookServiceApplication.class)
public class Atest {
    @Resource
    private RefoDao refoDao;
    @Test
    public void T() throws Exception {
        Repo bytid = refoDao.getBytid(1);
        System.out.println(bytid);
    }
}
