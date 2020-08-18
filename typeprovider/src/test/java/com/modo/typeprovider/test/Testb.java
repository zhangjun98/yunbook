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
public class Testb {
    @Resource
    private TypeDao typeDao;
    @Test
    public void getTest() throws Exception {
        Type byTid = typeDao.getByTid(1);// 通过tid获得具体的
        System.out.println(byTid);
        // 准备一个int 的集合
        ArrayList<Integer> integers = new ArrayList<>();

        // 得到一个2级目录
        List<Type> byPid = typeDao.getByPid(byTid.getTid());
        System.out.println(byPid);
        //  把Tid 存起来
        for (int i = 0; i < byPid.size(); i++) {
            boolean add = integers.add(byPid.get(i).getTid());
        }

        System.out.println(integers);
        // 三级目录把存起来的数据拿出来遍历即可
        for (int i = 0; i < integers.size(); i++) {
            // 三级目录。把三级目录下的所有节点
            List<Type> byPid1 = typeDao.getByPid(integers.get(i));
            System.out.println(byPid1);
        }
    }
}
