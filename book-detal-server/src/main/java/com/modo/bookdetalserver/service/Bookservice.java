package com.modo.bookdetalserver.service;

import com.modo.bookdetalserver.Beans.Book;
import org.springframework.stereotype.Service;

/**
 * @Author:modoyun
 * @TIME:17:30
 * @DATE:2020/6/17 -rf
 * bookservice
 */

public interface Bookservice {
    // 通过id 来获取图书详情
    public Book getBytid(Integer bookId) throws Exception;
}
