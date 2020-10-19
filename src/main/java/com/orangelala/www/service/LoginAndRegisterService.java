package com.orangelala.www.service;

import com.orangelala.www.entity.User;

/**
 * 作者：全
 */

public interface LoginAndRegisterService {
    /**
     * 登录
     * @param user
     * @return
     */
    User login(User user);

    /**
     *  邮箱注册
     * @param user
     * @return
     */
    boolean emailRegister(User user);

    /**
     * 手机号码注册
     * @param user
     * @return
     */
    boolean telephoneNumberRegister(User user);
}
