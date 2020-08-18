package com.modo.typeprovider.test;

import com.modo.typeprovider.TypeproviderApplication;
import com.modo.typeprovider.Utils.RedisUtils;
import com.modo.typeprovider.beans.Type;
import com.modo.typeprovider.dao.TypeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:modoyun
 * @TIME:10:26
 * @DATE:2020/6/17 -rf
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TypeproviderApplication.class)
public class Typetest {
    @Resource
    private TypeDao typeDao;
    @Autowired
    private RedisUtils redisUtils;
    @Test
    public void te() throws Exception {
        Object typeall = redisUtils.hget("s", "typeall");
        System.out.println(typeall);
    }
}
