package com.orangelala.www.dao;

import com.orangelala.www.entity.Information;

public interface InformationDao {
    //通过id获取到产品的详细介绍
    Information getIntroductionById(String id);
}
