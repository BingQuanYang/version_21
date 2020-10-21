package com.orangelala.www.service;

import com.orangelala.www.entity.User;

public interface UserService {

    /**
     * 根据用户Id查询用户信息、
     */

    public User getUser(String uid);
}
