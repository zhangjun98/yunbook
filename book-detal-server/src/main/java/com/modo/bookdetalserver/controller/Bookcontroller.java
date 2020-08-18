package com.modo.bookdetalserver.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.modo.bookdetalserver.Beans.Book;
import com.modo.bookdetalserver.Beans.Repo;
import com.modo.bookdetalserver.Beans.ResultVo;
import com.modo.bookdetalserver.service.Bookservice;
import com.modo.bookdetalserver.service.InfofeignService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @Author:modoyun
 * @TIME:17:45
 * @DATE:2020/6/17 -rf
 */
@RestController
@CrossOrigin
@RequestMapping("/book")
public class Bookcontroller {
    @Resource
    private InfofeignService infofeignService;
    @RequestMapping(value = "/testfeign",method = RequestMethod.GET)
    public ResultVo gettest(){
        List<Repo> byTid = infofeignService.getByTid(795);
        System.out.println(byTid);
        return new ResultVo(1,"MST",byTid);
    }
    @Resource
    private Bookservice bookservice;
    @RequestMapping(value = "/{bookId}",method = RequestMethod.GET)
    public ResultVo getbookById(@PathVariable("bookId") Integer bookId) throws Exception {
        Book bytid = bookservice.getBytid(bookId);
        List<Repo> byTidrefo = infofeignService.getByTid(bookId);


        HashMap<Object, Object> map = new HashMap<>();
        map.put("book",bytid);
        map.put("repo",byTidrefo);
        System.out.println("map得到的值是：" + map);
        return new ResultVo(0,"successful",map);
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ResultVo getbookById() throws Exception {
        Book bytid = bookservice.getBytid(888);
        return new ResultVo(0,"successful",bytid);
    }
}
