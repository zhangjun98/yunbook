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
public class Testd {
    @Resource
    private TypeDao typeDao;
    @Test
    public void getTest() throws Exception {
       // 通过调用一个方法，传递过来的参数是当前节点的id
        // 通过当前节点可以得到一个下一级的节点
        // 递归
        // 完成的条件，出入的数字得到的数组为空。循环+递归调用
        List<Type> byPid1 = typeDao.getByPid(typeDao.getByTid(1).getTid()); // 一级目录下的子节点
        for (int i = 0; i < byPid1.size(); i++) {
            // 遍历拿到的数组，通过当前数组的tid 和别人的pid进行比较
            // 首先拿到当前的tid
            Integer tid = byPid1.get(i).getTid(); // 拿到当前的tid
            List<Type> byPid = typeDao.getByPid(tid);
            if (byPid.size()!=0){
                // 非空说明有下一个节点

            }
            
        }
    }
}
