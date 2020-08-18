package com.modo.typeprovider.service;

import com.modo.typeprovider.beans.Type;

import java.util.List;

/**
 * @Author:modoyun
 * @TIME:9:08
 * @DATE:2020/6/17 -rf
 * 类型的service
 */
public interface Typeservice {

    /**
     * 查询所有的目录
     * @return
     * @throws Exception
     */
    public List<Type> getAll() throws Exception;

}
