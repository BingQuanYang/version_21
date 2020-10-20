package com.orangelala.www.dao;

import com.orangelala.www.dao.impl.SeckillDaoImpl;
import com.orangelala.www.entity.Seckill;
import org.junit.Test;

import java.util.List;

public class SeckillDaoTest {
    SeckillDao seckillDao = new SeckillDaoImpl();
    @Test
    public void ss(){
        List<Seckill> seckills = seckillDao.selectList();
        for (Seckill seckill : seckills) {
            System.out.println(seckill);
        }
    }
}
