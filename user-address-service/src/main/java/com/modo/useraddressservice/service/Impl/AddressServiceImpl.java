package com.modo.useraddressservice.service.Impl;

import com.modo.useraddressservice.bean.Address;
import com.modo.useraddressservice.dao.AddressDao;
import com.modo.useraddressservice.service.AdressService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:modoyun
 * @TIME:17:12
 * @DATE:2020/6/20 -rf
 */
public class AddressServiceImpl implements AdressService {
    @Resource
    private AddressDao addressDao;
    /**
     * 得到所有的地址
     * @param uid
     * @return
     * @throws Exception
     */
    @Override
    public List<Address> getByUid(Integer uid) throws Exception {
        return addressDao.getByuid(uid);
    }

    /**
     * 传递默认的地址出去
     * @param uid
     * @param type
     * @return
     * @throws Exception
     */
    @Override
    public Address getByuAt(Integer uid, Integer type) throws Exception {
        // 如果有返回  这里需要去思考一下
        Address address = null;
        Address bytype = addressDao.getBytype(uid, type);
        if (bytype==null){

        }
        return addressDao.getBytype(uid,type);
    }
}
