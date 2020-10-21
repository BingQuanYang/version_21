package com.orangelala.www.service;

import com.orangelala.www.entity.Details;
import com.orangelala.www.utils.DetailData;

public interface DetailsService {
    //通过id获取商品详情
    Details getDetailsById(String id);

    DetailData getDetailDate(String id);
}
