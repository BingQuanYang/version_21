package com.orangelala.www.service.impl;

import com.orangelala.www.dao.InformationDao;
import com.orangelala.www.dao.impl.InformationDaoImpl;
import com.orangelala.www.entity.Information;
import com.orangelala.www.service.InformationService;

public class InformationServiceImpl implements InformationService {
    InformationDao informationDao=new InformationDaoImpl();
    @Override
    public Information getIntroductionById(String id) {
        return informationDao.getIntroductionById(id);
    }
}
