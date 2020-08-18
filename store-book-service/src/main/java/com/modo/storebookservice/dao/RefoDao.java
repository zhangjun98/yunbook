package com.modo.storebookservice.dao;

import com.modo.storebookservice.Beans.Repo;

/**
 * @Author:modoyun
 * @TIME:19:46
 * @DATE:2020/6/18 -rf
 */
public interface RefoDao {
    public Repo getBytid(Integer bid) throws Exception;
}
