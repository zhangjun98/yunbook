package com.modo.bookdetalserver.Test;

import com.modo.bookdetalserver.Beans.Book;
import com.modo.bookdetalserver.BookDetalServerApplication;
import com.modo.bookdetalserver.dao.bookDao;
import com.modo.bookdetalserver.service.Bookservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author:modoyun
 * @TIME:17:21
 * @DATE:2020/6/17 -rf
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookDetalServerApplication.class)
public class Atest {
    @Resource
    private bookDao bookDao;
    @Resource
    private Bookservice bookservice;
    @Test
    public void getbyId() throws Exception {
        System.out.println(bookservice.getBytid(798));
    }
}
