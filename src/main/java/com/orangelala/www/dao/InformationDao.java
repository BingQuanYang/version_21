package com.orangelala.www.dao;

import com.orangelala.www.entity.Information;

import java.util.List;

public interface InformationDao {
    //通过id获取到产品的详细介绍
    Information getIntroductionById(String id);
    //通过id获取到产品推荐的信息
    List<Information> getRecommend(String id);
}
