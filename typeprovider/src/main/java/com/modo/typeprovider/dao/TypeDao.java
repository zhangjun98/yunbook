package com.modo.typeprovider.dao;

import com.modo.typeprovider.beans.Type;

import java.util.List;

/**
 * @Author:modoyun
 * @TIME:20:56
 * @DATE:2020/6/16 -rf
 */
public interface TypeDao {
    /**
     * 通过tid去获取Type
     * @param tid
     * @return
     * @throws Exception
     */
    public Type getByTid(Integer tid) throws Exception;

    /**
     * 废除 该
     * 通过pid去获取Type
     * @param pid
     * @return
     * @throws Exception
     */
    public List<Type> getByPid(Integer pid) throws Exception;

    /**
     *
     * 查询出所有的。老师的方法之后
     * @return
     * @throws Exception
     */
    public List<Type> getAll() throws Exception;


}
