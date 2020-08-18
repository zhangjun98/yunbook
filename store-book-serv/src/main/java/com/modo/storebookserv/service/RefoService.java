package com.modo.storebookserv.service;

import com.modo.storebookserv.Beans.Repo;

import java.util.List;

/**
 * @Author:modoyun
 * @TIME:21:04
 * @DATE:2020/6/18 -rf
 */
public interface RefoService {
    public List<Repo> getBytid(Integer tid) throws Exception;
}
