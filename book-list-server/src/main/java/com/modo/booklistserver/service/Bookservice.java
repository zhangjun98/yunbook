package com.modo.booklistserver.service;

import com.modo.booklistserver.Beans.Book;

import java.util.List;

/**
 * @Author:modoyun
 * @TIME:19:31
 * @DATE:2020/6/17 -rf
 */
public interface Bookservice {
    public List<Book> getByType(Integer pid,Integer pageNum) throws Exception;
}
