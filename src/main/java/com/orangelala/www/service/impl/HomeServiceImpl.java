package com.orangelala.www.service.impl;

import com.orangelala.www.dao.InformationDao;
import com.orangelala.www.dao.SeckillDao;
import com.orangelala.www.dao.impl.ClassDaoImpl;
import com.orangelala.www.dao.impl.InformationDaoImpl;
import com.orangelala.www.dao.impl.SeckillDaoImpl;
import com.orangelala.www.entity.*;
import com.orangelala.www.service.HomeService;
import com.orangelala.www.utils.HomeData;

import java.util.ArrayList;
import java.util.List;

public class HomeServiceImpl implements HomeService {
    private ClassDaoImpl classDao = new ClassDaoImpl();
    private SeckillDao seckillDao = new SeckillDaoImpl();
    private InformationDao informationDao = new InformationDaoImpl();

    @Override
    public HomeData getHomeDate() {
        HomeData homeData = new HomeData();
        /**
         * 作者：kun
         * 获取分类信息
         */
        List<Classification> classes = classDao.selectClassInformation();
        List<Headlines> headlines = classDao.selectHeadlinesInformation();
        List<Information> information = classDao.selectInformation();
        List<Category> categories = classDao.selectCategory();
        List<Information> information1 = classDao.selectInformation2();
        List<Category> categories1 = classDao.selectCategory2();
        homeData.setCategories1(categories1);
        homeData.setInformation1(information1);
        homeData.setCategories(categories);
        homeData.setInformation(information);
        homeData.setHeadlines(headlines);
        homeData.setClasses(classes);

        /**
         * 作者：全
         */
        List<Information> list = new ArrayList<>();
        List<Seckill> seckills = seckillDao.selectList();
        for (Seckill seckill : seckills) {
            Information temp = informationDao.getIntroductionById(seckill.getPId());
            list.add(temp);
        }
        homeData.setSeckill(list);
        return homeData;
    }
}
