package com.orangelala.www.service.impl;

import com.orangelala.www.dao.ImgDao;
import com.orangelala.www.dao.impl.ImgDaoImpl;
import com.orangelala.www.entity.Img;
import com.orangelala.www.service.ImgService;
import com.orangelala.www.utils.DetailData;

import java.util.List;

public class ImgServiceImpl implements ImgService {
    ImgDao imgDao=new ImgDaoImpl();
    @Override
    public DetailData getImg(String id) {
        DetailData detailData = new DetailData();
        List<Img> imgsById = imgDao.getImgsById(id);
        detailData.setImg(imgsById);
        return detailData;

    }
}
