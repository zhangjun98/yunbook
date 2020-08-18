package com.modo.booklistserver.dao;

import com.modo.booklistserver.Beans.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:modoyun
 * @TIME:18:59
 * @DATE:2020/6/17 -rf
 */
public interface BookDAO {
    // 根据类别查询图书接口
    public List<Book> getByType(@Param("pid") Integer pid,
                                @Param("start") Integer start,
                                @Param("pageSize") Integer pageSize) throws Exception;
}
