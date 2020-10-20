package com.orangelala.www.dao.impl;

import com.orangelala.www.dao.ImgDao;
import com.orangelala.www.entity.Img;
import com.orangelala.www.utils.DBManager;

import java.util.List;

public class ImgDaoImpl implements ImgDao {
    //通过id获取到图片的集合
    @Override
    public List<Img> getImgsById(String id) {
        String sql="select * from img where p_id=?";
        List<Img> detailsList = DBManager.selectList(sql,Img.class, id);
        return detailsList;
    }
}
