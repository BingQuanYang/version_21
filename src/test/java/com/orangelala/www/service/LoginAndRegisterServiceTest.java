package com.orangelala.www.service;

import com.orangelala.www.entity.User;
import com.orangelala.www.service.impl.LoginAndRegisterServiceImpl;
import org.junit.Test;

public class LoginAndRegisterServiceTest {
    LoginAndRegisterService service = new LoginAndRegisterServiceImpl();
    @Test
    public void login(){
        //邮箱和手机和登录密码不正确的时候
        User user = new User();
        User login = service.login(user);
        System.out.println(login);
        //手机号码和登录密码正确的时候
        user.setTelephoneNumber("19877989771");
        user.setLoginPassword("111111");
        login = service.login(user);
        System.out.println(login);
        //邮箱和登录密码正确的时候
        User u = new User();
        u.setEmail("2242003343@qq.com");
        u.setLoginPassword("123456");
        login = service.login(u);
        System.out.println(login);
    }
    @Test
    public void emailRegister(){
        //邮箱存在的时候
        User user1 = new User();
        user1.setEmail("2606211206@qq.com");
        user1.setLoginPassword("123");
        boolean b = service.emailRegister(user1);
        System.out.println(b);
        //手机号码存在的时候
        User user2 = new User();
        user2.setEmail("896456434@qq.com");
        user2.setLoginPassword("111");
        boolean b1 = service.emailRegister(user2);
        System.out.println(b1);
    }
    @Test
    public void telephoneNumberRegister(){
        //邮箱存在的时候
        User user1 = new User();
        user1.setTelephoneNumber("19877989771");
        user1.setLoginPassword("123");
        boolean b = service.telephoneNumberRegister(user1);
        System.out.println(b);
        //手机号码存在的时候
        User user2 = new User();
        user2.setTelephoneNumber("10086");
        user2.setLoginPassword("111");
        boolean b1 = service.telephoneNumberRegister(user2);
        System.out.println(b1);
    }
}
