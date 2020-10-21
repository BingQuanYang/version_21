package com.orangelala.www.service.impl;

import com.orangelala.www.dao.DetailsDao;
import com.orangelala.www.dao.ImgDao;
import com.orangelala.www.dao.impl.DetailsDaoImpl;
import com.orangelala.www.dao.impl.ImgDaoImpl;
import com.orangelala.www.entity.Details;
import com.orangelala.www.service.DetailsService;
import com.orangelala.www.utils.DetailData;

public class DetailsServiceImpl implements DetailsService {
    DetailsDao detailsDao=new DetailsDaoImpl();
    ImgDao imgDao=new ImgDaoImpl();

    @Override
    public Details getDetailsById(String id) {

        Details detailsById = detailsDao.getDetailsById(id);

        return detailsById;
    }

    public DetailData getDetailDate(String id){
        DetailData detailData = new DetailData();
        Details detailsById = detailsDao.getDetailsById(id);
        detailData.setDetails(detailsById);
        detailData.setImg(imgDao.getImgsById(id));
        return detailData;
    }
}
