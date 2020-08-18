package com.modo.storebookserv;

import com.modo.storebookserv.Beans.Repo;
import com.modo.storebookserv.dao.RefoDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:modoyun
 * @TIME:19:56
 * @DATE:2020/6/18 -rf
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StoreBookServApplication.class)
public class Atest {
    @Resource
    private RefoDao refoDao;
    @Test
    public void T() throws Exception {
        List<Repo> bytid = refoDao.getBytid(795);
        System.out.println(bytid);
    }
}
