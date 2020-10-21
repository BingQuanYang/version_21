package com.orangelala.www.dao.impl;

import com.orangelala.www.dao.ClassDao;
import com.orangelala.www.entity.Category;
import com.orangelala.www.entity.Classification;
import com.orangelala.www.entity.Headlines;
import com.orangelala.www.entity.Information;
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
    @Override
    public List<Headlines> selectHeadlinesInformation() {
        String sql = "select h_id,headlines from headlines limit 0,7";
        Class<Headlines> headlinesClass = Headlines.class;
        List<Headlines> headlines = DBManager.selectList(sql, headlinesClass, null);
        return headlines;
    }

    @Override
    public List<Information> selectInformation() {
        int id = 1;
        String sql = "select * from information where c_id=?";
        Class<Information> informationClass = Information.class;
        List<Information> information = DBManager.selectList(sql, informationClass, id);
        return information;
    }

    @Override
    public List<Category> selectCategory() {
        int id = 1;
        String sql = "select * from Category where id=?";
        Class<Category> categoryClass = Category.class;
        List<Category> categories = DBManager.selectList(sql, categoryClass, id);
        return categories;
    }

}
