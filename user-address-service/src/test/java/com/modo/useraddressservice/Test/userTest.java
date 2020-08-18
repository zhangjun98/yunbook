package com.modo.useraddressservice.Test;

import com.modo.useraddressservice.UserAddressServiceApplication;

import com.modo.useraddressservice.bean.Address;
import com.modo.useraddressservice.dao.AddressDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:modoyun
 * @TIME:17:43
 * @DATE:2020/6/19 -rf
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserAddressServiceApplication.class)
public class userTest {
    @Resource
    private AddressDao addressDao;
    @Test
    public void test() throws Exception {
        List<Address> byuid = addressDao.getByuid(1);
        for (int i = 0; i < byuid.size(); i++) {
            System.out.println(byuid.get(i));
        }
     /*   System.out.println(addressDao.getBytype(1, 1));*/
    }
}
