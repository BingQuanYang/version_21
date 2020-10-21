package com.orangelala.www.service;

import com.orangelala.www.entity.Information;
import com.orangelala.www.utils.DetailData;

public interface InformationService {
    //通过id获取商品的详细信息（一条）
    DetailData getIntroductionById(String id);
    //通过id获取商品的推荐信息（集合）
    DetailData getIntroductions(String id);
}
