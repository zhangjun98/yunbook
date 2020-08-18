package com.modo.booklistserver.controller;

import com.modo.booklistserver.Beans.Book;
import com.modo.booklistserver.Beans.ResultVo;
import com.modo.booklistserver.service.Bookservice;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:modoyun
 * @TIME:19:52
 * @DATE:2020/6/17 -rf
 */
@RestController
@RequestMapping("/book")
@CrossOrigin
public class BooklistController {
    @Resource
    private Bookservice bookservice;
    @RequestMapping(value = "/{pid}/{pageNum}",method = RequestMethod.GET)
    public ResultVo getByPid(@PathVariable("pid") Integer pid,@PathVariable("pageNum") Integer pageNum) throws Exception {
        List<Book> byType = bookservice.getByType(pid, pageNum);
        return new ResultVo(0,"success",byType);
    }
}
