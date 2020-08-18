package com.modo.userloginservice.Test;

import com.modo.userloginservice.UserLoginServiceApplication;
import com.modo.userloginservice.bean.User;
import com.modo.userloginservice.dao.userDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author:modoyun
 * @TIME:17:43
 * @DATE:2020/6/19 -rf
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserLoginServiceApplication.class)
public class userTest {
    @Resource
    private userDao userdao;
    @Test
    public void test() throws Exception {
        User user = userdao.checkLogin("yun", "yun");
        System.out.println(user);
    }
}
