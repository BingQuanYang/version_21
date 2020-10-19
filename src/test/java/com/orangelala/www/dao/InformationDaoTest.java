package com.orangelala.www.dao;

import com.orangelala.www.dao.impl.InformationDaoImpl;
import com.orangelala.www.entity.Information;
import org.junit.Test;

public class InformationDaoTest {
    @Test
    public  void main() {
        InformationDaoImpl informationDao = new InformationDaoImpl();
        Information introduction = informationDao.getIntroductionById("1");
        System.out.println(introduction);
    }
}
