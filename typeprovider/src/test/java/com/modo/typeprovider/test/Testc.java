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
public class Testc {
    @Resource
    private TypeDao typeDao;
    @Test
    public void getTest() throws Exception {
        Type byTid = typeDao.getByTid(2);// 通过tid获得具体的
        ArrayList<Type> types = new ArrayList<>();
        types.add(byTid);
        System.out.println("一级模板:" + byTid);

        // 得到一个2级目录
        List<Type> byPid = typeDao.getByPid(byTid.getTid());
        System.out.println("二级模板：" + byPid);

        for (int i = 0; i < byPid.size(); i++) {
            List<Type> byPid1 = typeDao.getByPid(byPid.get(i).getTid());
            Type type = byPid.get(i);
            type.setList(byPid1);
            byPid.set(i,type);
            System.out.println(byPid1);
        }

        System.out.println("2级模板：result:" + byPid);
        byTid.setList(byPid);
        System.out.println("result:" + byTid);
    }
}
