package com.modo.typeprovider.test;

import com.modo.typeprovider.TypeproviderApplication;
import com.modo.typeprovider.beans.Type;
import com.modo.typeprovider.dao.TypeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:modoyun
 * @TIME:21:12
 * @DATE:2020/6/16 -rf
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TypeproviderApplication.class)
public class Testa {
    @Resource
    private TypeDao typeDao;
    @Test
    public void getTest() throws Exception {
       /* Type byTid = typeDao.getByTid(1);
        System.out.println(byTid);*/
       // 查询出所有的一级目录

        List<Type> byPid = typeDao.getByPid(0);
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for (int i = 0; i < byPid.size(); i++) {
            System.out.println(byPid.get(i));
            boolean add = ints.add(byPid.get(i).getTid());
        }
        for (int i = 0; i < ints.size(); i++) {
            // 这里拿到一级目录查询的
            System.out.print("  " + ints.get(i) + "  ");
            List<Type> byPid1 = typeDao.getByPid(ints.get(i));
            // 这里是二级目录的
            System.out.println(byPid1);
        }
    }
}
