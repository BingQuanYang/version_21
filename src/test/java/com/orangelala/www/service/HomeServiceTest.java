package com.orangelala.www.service;

import com.orangelala.www.entity.Classification;
import com.orangelala.www.entity.Headlines;
import com.orangelala.www.entity.Information;
import com.orangelala.www.service.impl.HomeServiceImpl;
import com.orangelala.www.utils.HomeData;
import org.junit.Test;

public class HomeServiceTest {
    HomeService homeService = new HomeServiceImpl();
    @Test
    public void s(){
        HomeData homeDate = homeService.getHomeDate();
        for (Classification aClass : homeDate.getClasses()) {
            System.out.println(aClass);
        }
        System.out.println("111111");
        for (Information information : homeDate.getSeckill()) {
            System.out.println(information);
        }
        System.out.println("1111");
        for (Headlines headlines : homeDate.getHeadlines()) {
            System.out.println(headlines);
        }
    }
}
