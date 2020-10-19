package com.orangelala.www.dao.impl;

import com.orangelala.www.dao.ClassDao;
import com.orangelala.www.entity.Classification;
import com.orangelala.www.utils.DBManager;
import java.util.List;

/**
 * kun
 */
public class ClassDaoImpl implements ClassDao {

    @Override
    public List<Classification> selectClassInformation() {
        String sql = "select c_id,classification,image from classification";
        Class<Classification> aClass = Classification.class;
        List<Classification> classes = DBManager.selectList(sql, aClass, null);
        return classes;
    }
}
