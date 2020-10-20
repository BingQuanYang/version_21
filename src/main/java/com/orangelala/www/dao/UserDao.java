package com.orangelala.www.dao;

import com.orangelala.www.entity.User;

/**
 * 作者：全
 *
 *
 *
 * 
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

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int updateUserById(User user);

    /**
     * 根据用户id修改登录密码
     * @param id id
     * @param loginPassword 登录密码需要更新的
     * @return
     */
    int updateLoginPasswordById(String id,String loginPassword);

    /**
     *根据用户id修改支付密码
     * @param id
     * @param paymentPassword
     * @return
     */
    int updatePaymentPasswordById(String id,String paymentPassword);

    /**
     * 根据邮箱查用户信息
     * @param email
     * @return
     */
    User selectUserByemail(String email);

    /**
     * 根据电话号码查用户信息
     * @param phone
     * @return
     */
    User selectUserByPhone(String phone);

    /**
     * 根据邮箱和登录密码添加用户
     * @param user
     * @return
     */
    int insertEmailAndLoginPassword(User user);

    /**
     *根据电话号码和登录密码添加用户
     * @param user
     * @return
     */
    int insertPhoneAndLoginPassword(User user);
}
