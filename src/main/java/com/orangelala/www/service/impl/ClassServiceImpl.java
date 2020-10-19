package com.orangelala.www.service.impl;

import com.orangelala.www.dao.impl.ClassDaoImpl;
import com.orangelala.www.entity.Classification;
import com.orangelala.www.service.ClassService;
import com.orangelala.www.utils.InterData;

import java.util.List;

/**
 * kun
 */
public class ClassServiceImpl implements ClassService {
    private ClassDaoImpl classDao = new ClassDaoImpl();
    @Override
    public InterData obtainClass() {
        InterData interData = new InterData();
        List<Classification> classes = classDao.selectClassInformation();
        interData.setClasses(classes);
        return interData;
    }
}
