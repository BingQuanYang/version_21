package com.orangelala.www.dao;

import com.orangelala.www.dao.impl.ClassDaoImpl;
import com.orangelala.www.entity.Classification;
import com.orangelala.www.entity.Headlines;
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
}
