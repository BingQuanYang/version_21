package com.orangelala.www.dao.impl;

import com.orangelala.www.dao.UserDao;
import com.orangelala.www.entity.User;

public class UserDaoImpl implements UserDao {

    @Override
    public User selectUserById(String id) {
        return null;
    }

    @Override
    public User selectUserByEmailAndLoginPassword(User user) {
        return null;
    }

    @Override
    public User selectUserByPhoneAndLoginPassword(User user) {
        return null;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }


}
