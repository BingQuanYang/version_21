package com.orangelala.www.dao.impl;

import com.orangelala.www.dao.InformationDao;
import com.orangelala.www.entity.Information;
import com.orangelala.www.utils.DBManager;

public class InformationDaoImpl implements InformationDao {
    //通过id获取到产品的详细介绍
    @Override
    public Information getIntroductionById(String id) {
        String sql="select * from information where id=?";
        Information information = DBManager.selectOne(sql, Information.class, id);
        return information;
    }

}
