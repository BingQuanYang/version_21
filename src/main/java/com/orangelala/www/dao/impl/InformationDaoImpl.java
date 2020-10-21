package com.orangelala.www.dao.impl;

import com.orangelala.www.dao.InformationDao;
import com.orangelala.www.entity.Information;
import com.orangelala.www.utils.DBManager;

import java.util.List;

public class InformationDaoImpl implements InformationDao {
    //通过id获取到产品的详细介绍
    @Override
    public Information getIntroductionById(String id) {
        String sql="select * from information where id=?";
        Information information = DBManager.selectOne(sql, Information.class, id);
        return information;
    }

    @Override
    public List<Information> getRecommend(String id) {
        Integer integer = Integer.valueOf(id);
        Integer num=integer+6;
        String sql=" select * from information limit "+integer+","+num+"  ";
        List<Information> informations = DBManager.selectList(sql, Information.class);
        return informations;
    }

}
