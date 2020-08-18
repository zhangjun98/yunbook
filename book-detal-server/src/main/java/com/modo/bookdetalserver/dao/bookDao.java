package com.modo.bookdetalserver.dao;

import com.modo.bookdetalserver.Beans.Book;

/**
 * @Author:modoyun
 * @TIME:15:52
 * @DATE:2020/6/17 -rf
 */
public interface bookDao {
    public Book getById(Integer bookId) throws Exception;
}
