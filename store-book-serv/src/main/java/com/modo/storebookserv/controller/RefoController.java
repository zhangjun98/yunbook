package com.modo.storebookserv.controller;

import com.modo.storebookserv.Beans.Repo;
import com.modo.storebookserv.Beans.ResultVo;
import com.modo.storebookserv.service.RefoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:modoyun
 * @TIME:21:08
 * @DATE:2020/6/18 -rf
 */
@RestController
@CrossOrigin
@RequestMapping("/refo")
public class RefoController {
    @Resource
    private RefoService refoService;
    @RequestMapping("/{tid}")
    public List<Repo> getByTid(@PathVariable("tid") Integer tid) throws Exception {
        System.out.println("获取到的tid:" + tid);
        return refoService.getBytid(tid);
    }
}
