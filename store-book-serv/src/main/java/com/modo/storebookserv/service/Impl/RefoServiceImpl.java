package com.modo.storebookserv.service.Impl;

import com.modo.storebookserv.Beans.Repo;
import com.modo.storebookserv.dao.RefoDao;
import com.modo.storebookserv.service.RefoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:modoyun
 * @TIME:21:06
 * @DATE:2020/6/18 -rf
 */
@Service
public class RefoServiceImpl implements RefoService {
    @Resource
    private RefoDao refoDao;
    @Override
    public List<Repo> getBytid(Integer tid) throws Exception {
        return refoDao.getBytid(tid);
    }
}
