package com.modo.typeprovider.service.Impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.modo.typeprovider.Utils.RedisUtils;
import com.modo.typeprovider.beans.Type;
import com.modo.typeprovider.dao.TypeDao;
import com.modo.typeprovider.service.Typeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:modoyun
 * @TIME:10:52
 * @DATE:2020/6/17 -rf
 * typeservice的实现类
 */
@Service
public class TypeserviceImpl implements Typeservice {
    @Autowired
    private RedisUtils redisUtils;
    @Resource
    private TypeDao typeDao;


    /**
     * 查询所有的目录
     * @return
     * @throws Exception
     */
    @Override
    public List<Type> getAll() throws Exception {
       // 首先访问Redis看是否有对应的值
        Object typeall = redisUtils.hget("s", "typeall");
        List<Type> list = null;
        ObjectMapper objectMapper = new ObjectMapper();
        if (typeall==null){
            // 如果没有找到。去数据库里面查除放入
            List<Type> alltype = typeDao.getAll();
            list = alltype;
            String s = objectMapper.writeValueAsString(alltype);
            boolean typeset = redisUtils.hset("s", "typeall", s);
            System.out.println("Redis插入" + typeset);
        }else {
            // 查找到了
            //new ObjectMapper().readValue()
            System.out.println("Redis拿到的数据:" + typeall);

            List<Type> list2 = objectMapper.readValue(typeall.toString(), new TypeReference<List<Type>>() {
            });
            list = list2;
        }
        return list;
    }
}
