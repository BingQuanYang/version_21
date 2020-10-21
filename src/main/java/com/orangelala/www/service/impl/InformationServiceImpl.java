package com.orangelala.www.service.impl;

import com.orangelala.www.dao.DetailsDao;
import com.orangelala.www.dao.ImgDao;
import com.orangelala.www.dao.InformationDao;
import com.orangelala.www.dao.impl.DetailsDaoImpl;
import com.orangelala.www.dao.impl.ImgDaoImpl;
import com.orangelala.www.dao.impl.InformationDaoImpl;
import com.orangelala.www.entity.Details;
import com.orangelala.www.entity.Information;
import com.orangelala.www.service.InformationService;
import com.orangelala.www.utils.DetailData;

public class InformationServiceImpl implements InformationService {
    InformationDao informationDao=new InformationDaoImpl();
    DetailsDao detailsDao=new DetailsDaoImpl();
    ImgDao imgDao=new ImgDaoImpl();

    /**
     * 根据商品id获取商品信息
     * @param id  商品id
     * @return
     */
    @Override
    public DetailData getIntroductionById(String id) {
        DetailData detailData = new DetailData();
        Information info = informationDao.getIntroductionById(id);
        detailData.setInfor(info);
        Details detailsById = detailsDao.getDetailsById(id);
        detailData.setDetails(detailsById);
        detailData.setImg(imgDao.getImgsById(id));
        return detailData;
    }
}
