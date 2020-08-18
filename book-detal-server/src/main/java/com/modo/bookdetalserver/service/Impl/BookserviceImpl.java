package com.modo.bookdetalserver.service.Impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.modo.bookdetalserver.Beans.Book;
import com.modo.bookdetalserver.Utils.RedisUtils;
import com.modo.bookdetalserver.dao.bookDao;
import com.modo.bookdetalserver.service.Bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.Type;

/**
 * @Author:modoyun
 * @TIME:17:32
 * @DATE:2020/6/17 -rf
 */
@Service
public class BookserviceImpl implements Bookservice {
    @Autowired
    private RedisUtils redisUtils;
    @Resource
    private bookDao bookdao;

    /**
     * 通过id 来获取详情
     * @param bookId
     * @return
     * @throws Exception
     */
    @Override
    public Book getBytid(Integer bookId) throws Exception {
        // 首先通过id去Redis里面查询。
        ObjectMapper objectMapper = new ObjectMapper();
        Object hgetdtail = redisUtils.hget("detalbook", ""+bookId);
        if (hgetdtail == null){
            // 如果Redis里面没有

            Book detalbytid = bookdao.getById(bookId);
            redisUtils.hset("detalbook",""+bookId,objectMapper.writeValueAsString(detalbytid));
            System.out.println("数据库里面拿值：" + detalbytid);
          return detalbytid;
        }else {
            // 把拿出来的数据返回
            System.out.println("Rddis:"+ hgetdtail);
            Book book = objectMapper.readValue(hgetdtail.toString(), new TypeReference<Book>() {

            });
            return book;
        }
    }
}
