package com.modo.storebookserv.dao;

import com.modo.storebookserv.Beans.Repo;

import java.util.List;

/**
 * @Author:modoyun
 * @TIME:19:46
 * @DATE:2020/6/18 -rf
 */
public interface RefoDao {
    public List<Repo> getBytid(Integer bid) throws Exception;
}
