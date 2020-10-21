package com.orangelala.www.service.impl;

import com.orangelala.www.dao.UserDao;
import com.orangelala.www.dao.impl.UserDaoImpl;
import com.orangelala.www.entity.User;
import com.orangelala.www.service.UserService;

public class UserServiceImpl  implements UserService {
    UserDao userDao = new UserDaoImpl();
    @Override
    public User getUser(String uid) {
        //查询数据
        User user = userDao.selectUserById(uid);
        return user;
    }
}
