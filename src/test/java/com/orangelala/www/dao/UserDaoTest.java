package com.orangelala.www.dao;

import com.orangelala.www.dao.impl.UserDaoImpl;
import com.orangelala.www.entity.User;
import org.junit.Test;

import java.sql.Date;

public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();
    @Test
    public void selectUserById(){
        User user = userDao.selectUserById("1");
        System.out.println(user);
    }
    @Test
    public void selectUserByEmailAndLoginPassword(){
        User u = new User();
        u.setEmail("2606211206@qq.com");
        u.setLoginPassword("123456");
        User user = userDao.selectUserByEmailAndLoginPassword(u);
        System.out.println(user);
    }
    @Test
    public void selectUserByPhoneAndLoginPassword(){
        User u = new User();
        u.setTelephoneNumber("19877989772");
        u.setLoginPassword("123456");
        User user = userDao.selectUserByPhoneAndLoginPassword(u);
        System.out.println(user);
    }
    @Test
    public void updateUserById(){
        User u = new User();
        u.setId("1");
        u.setNickName("zzhzzh");
        u.setUsername("张家辉");
        u.setTelephoneNumber("19877989771");
        u.setSex("女");
        u.setBirthday(new Date(new java.util.Date().getTime()));
        u.setEmail("2606211206@qq.com");
        int i = userDao.updateUserById(u);
        System.out.println(i);
    }
    @Test
    public void updateLoginPasswordById(){
        int i = userDao.updateLoginPasswordById("1","111111");
        System.out.println(i);
    }
    @Test
    public void updatePaymentPasswordById(){
        int i = userDao.updatePaymentPasswordById("1","123456");
        System.out.println(i);
    }
}
