package com.modo.booklistserver.Test;

import com.modo.booklistserver.Beans.Book;
import com.modo.booklistserver.BookListServerApplication;
import com.modo.booklistserver.dao.BookDAO;
import com.modo.booklistserver.service.Bookservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:modoyun
 * @TIME:19:22
 * @DATE:2020/6/17 -rf
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookListServerApplication.class)
public class Testa {
    @Resource
    private BookDAO bookDAO;
    @Resource
    private Bookservice bookservice;
    @Test
    public void T() throws Exception {
        List<Book> byType = bookservice.getByType(100, 1);
        System.out.println(byType);
    }

}
