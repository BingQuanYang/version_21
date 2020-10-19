package com.orangelala.www.service.impl;

import com.orangelala.www.dao.UserDao;
import com.orangelala.www.dao.impl.UserDaoImpl;
import com.orangelala.www.entity.User;
import com.orangelala.www.service.LoginAndRegisterService;

import java.util.UUID;

/**
 * 作者：全
 */

public class LoginAndRegisterServiceImpl implements LoginAndRegisterService {
    UserDao userDao = new UserDaoImpl();
    @Override
    public User login(User user) {
        User u = null;
        u = userDao.selectUserByEmailAndLoginPassword(user);
        if(u!=null){
            return u;
        }
        u = userDao.selectUserByPhoneAndLoginPassword(user);
        if(u!=null){
            return u;
        }
        return null;
    }

    @Override
    public boolean emailRegister(User user) {
        User temp = userDao.selectUserByemail(user.getEmail());
        if(temp == null){
            UUID uuid = UUID.randomUUID();
            String id = uuid.toString();
            user.setId(id);
            int i = userDao.insertEmailAndLoginPassword(user);
            if(i>0){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean telephoneNumberRegister(User user) {
        User temp = userDao.selectUserByPhone(user.getTelephoneNumber());
        if(temp == null){
            UUID uuid = UUID.randomUUID();
            String id = uuid.toString();
            user.setId(id);
            int i = userDao.insertPhoneAndLoginPassword(user);
            if(i>0){
                return true;
            }
        }
        return false;
    }
}
