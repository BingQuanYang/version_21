package com.orangelala.www.dao.impl;

import com.orangelala.www.dao.SeckillDao;
import com.orangelala.www.entity.Seckill;
import com.orangelala.www.utils.DBManager;

import java.util.List;

public class SeckillDaoImpl implements SeckillDao {
    @Override
    public List<Seckill> selectList() {
        String sql = "select * from seckill";
        return DBManager.selectList(sql,Seckill.class);
    }
}
