package com.modo.booklistserver.service.Impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.modo.booklistserver.Beans.Book;
import com.modo.booklistserver.Utils.RedisUtils;
import com.modo.booklistserver.dao.BookDAO;
import com.modo.booklistserver.service.Bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @Author:modoyun
 * @TIME:19:33
 * @DATE:2020/6/17 -rf
 */
@Service
public class BookserviceImpl implements Bookservice {
    @Resource
    private BookDAO bookDAO;
    @Autowired
    private RedisUtils redisUtils;
    private final Integer PAGE_SIZE = 6;
    /**
     * 通过传递过来的类别。进行搜索
     * @param pid
     * @param pageNum
     * @return
     * @throws Exception
     */
    @Override
    public List<Book> getByType(Integer pid, Integer pageNum) throws Exception {
        // 首先通过Redis进行
        // 首先通过这个拿到一个
        ObjectMapper objectMapper = new ObjectMapper();
        Object hget = redisUtils.hget("pid-" + pid, "page-" + pageNum);
        if (hget==null){
            // 如果Redis里面没有
            int start = (pageNum-1)*PAGE_SIZE;
            List<Book> byType = bookDAO.getByType(pid, start, PAGE_SIZE);
            boolean hset = redisUtils.hset("pid-" + pid, "page-" + pageNum, objectMapper.writeValueAsString(byType));
            return byType;
        }else {
            // Redis里面有
            List<Book> books = objectMapper.readValue(hget.toString(), new TypeReference<List<Book>>() {

            });
            return books;
        }
    }
}
