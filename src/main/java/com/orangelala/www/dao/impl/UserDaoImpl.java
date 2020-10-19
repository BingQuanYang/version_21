package com.orangelala.www.dao.impl;

import com.orangelala.www.dao.UserDao;
import com.orangelala.www.entity.User;
import com.orangelala.www.utils.DBManager;

/**
 * 作者：全
 */
public class UserDaoImpl implements UserDao{
    @Override
    public User selectUserById(String id) {
        String sql = "select * from user where is_available=1 and id=?";
        return DBManager.selectOne(sql,User.class,id);
    }

    @Override
    public User selectUserByEmailAndLoginPassword(User user) {
        String sql = "select * from user where is_available=1 and email=? and login_password=?";
        return DBManager.selectOne(sql,User.class,user.getEmail(),user.getLoginPassword());
    }

    @Override
    public User selectUserByPhoneAndLoginPassword(User user) {
        String sql = "select * from user where is_available=1 and telephone_number=? and login_password=?";
        return DBManager.selectOne(sql,User.class,user.getTelephoneNumber(),user.getLoginPassword());
    }

    @Override
    public int updateUserById(User user) {
        String sql = "update user set nick_name=?,username=?,sex=?,birthday=?,telephone_number=?,email=? where is_available=1 and id=?";
        return DBManager.commonUpdate(sql,user.getNickName(),user.getUsername(),user.getSex(),user.getBirthday(),user.getTelephoneNumber(),user.getEmail(),user.getId());
    }

    @Override
    public int updateLoginPasswordById(String id, String loginPassword) {
        String sql = "update user set login_password=? where is_available=1 and id=?";
        return DBManager.commonUpdate(sql,loginPassword,id);
    }

    @Override
    public int updatePaymentPasswordById(String id, String paymentPassword) {
        String sql = "update user set payment_password=? where is_available=1 and id=?";
        return DBManager.commonUpdate(sql,paymentPassword,id);
    }

    @Override
    public User selectUserByemail(String email) {
        String sql = "select * from user where is_available=1 and email=?";
        return DBManager.selectOne(sql,User.class,email);
    }

    @Override
    public User selectUserByPhone(String phone) {
        String sql = "select * from user where is_available=1 and telephone_number=?";
        return DBManager.selectOne(sql,User.class,phone);
    }

    @Override
    public int insertEmailAndLoginPassword(User user) {
        String sql = "insert into user(id,email,login_password) values(?,?,?)";
        return DBManager.commonUpdate(sql,user.getId(),user.getEmail(),user.getLoginPassword());
    }

    @Override
    public int insertPhoneAndLoginPassword(User user) {
        String sql = "insert into user(id,telephone_number,login_password) values(?,?,?)";
        return DBManager.commonUpdate(sql,user.getId(),user.getTelephoneNumber(),user.getLoginPassword());
    }
}