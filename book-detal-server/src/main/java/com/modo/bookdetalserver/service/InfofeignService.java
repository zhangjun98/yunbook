package com.modo.bookdetalserver.service;

import com.modo.bookdetalserver.Beans.Repo;
import com.modo.bookdetalserver.Beans.ResultVo;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author:modoyun
 * @TIME:21:59
 * @DATE:2020/6/18 -rf
 */
@FeignClient("store-book-serv")
public interface InfofeignService {
    @RequestMapping("/refo/{tid}")
    public List<Repo> getByTid(@PathVariable("tid") Integer tid);
}
