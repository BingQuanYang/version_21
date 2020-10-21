package com.orangelala.www.dao;

import com.orangelala.www.dao.impl.ClassDaoImpl;
import com.orangelala.www.entity.Category;
import com.orangelala.www.entity.Classification;
import com.orangelala.www.entity.Headlines;
import com.orangelala.www.entity.Information;
import org.junit.Test;

import java.util.List;

public class ClassDaoImplTest {
    ClassDaoImpl classDao = new ClassDaoImpl();
    @Test
    public void selectClassInformation(){
        List<Classification> classifications = classDao.selectClassInformation();
        System.out.println(classifications);
    }
    @Test
    public void selectHeadlinesInformation(){
        List<Headlines> headlines = classDao.selectHeadlinesInformation();
        System.out.println(headlines);
    }
    @Test
    public void selectInformation(){
        List<Information> information = classDao.selectInformation();
        System.out.println(information);
    }
    @Test
    public void selectCategory(){
        List<Category> categories = classDao.selectCategory();
        System.out.println(categories);
    }
    @Test
    public void selectInformation2(){
        List<Information> information = classDao.selectInformation();
        System.out.println(information);
    }
    @Test
    public void selectCategory2(){
        List<Category> categories = classDao.selectCategory();
        System.out.println(categories);
    }
}
