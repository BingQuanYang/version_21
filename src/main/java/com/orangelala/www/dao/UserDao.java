package com.orangelala.www.dao;

import com.orangelala.www.entity.User;

/**
 * 作者：全
 */
public interface UserDao {
    /**
     * 根据用户id查用户信息
     * @param id   id
     * @return     用户信息
     */
    User selectUserById(String id);

    /**
     * 根据邮箱和登录密码查询用户信息
     * @param user  封装邮箱和登录密码
     * @return      用户信息
     */
    User selectUserByEmailAndLoginPassword(User user);

    /**
     * 根据电话和登录密码查询用户信息
     * @param user  电话和登录密码
     * @return      用户信息
     */
    User selectUserByPhoneAndLoginPassword(User user);


    int updateUser(User user);
}
