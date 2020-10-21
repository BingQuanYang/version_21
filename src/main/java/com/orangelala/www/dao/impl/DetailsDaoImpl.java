package com.orangelala.www.dao.impl;

import com.orangelala.www.dao.DetailsDao;
import com.orangelala.www.entity.Details;
import com.orangelala.www.utils.DBManager;

public class DetailsDaoImpl implements DetailsDao {
    //通过id获取数据库中的宝贝详情
    @Override
    public Details getDetailsById(String id) {
//        String sql="select id,productType,producingArea,area,burdenSheet,productSpecifications,shelfLife,psCode,plNumber,storages,eatMethod,image,isDelete from details where id=?";
        String sql="select * from details where id=?";
        Details details = DBManager.selectOne(sql, Details.class, id);

        return details;
    }

}
