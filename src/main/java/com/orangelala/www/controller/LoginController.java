package com.orangelala.www.controller;

import com.orangelala.www.entity.User;
import com.orangelala.www.resp.Message;
import com.orangelala.www.resp.ResponseEntity;
import com.orangelala.www.resp.Status;
import com.orangelala.www.service.LoginAndRegisterService;
import com.orangelala.www.service.impl.LoginAndRegisterServiceImpl;
import com.orangelala.www.utils.ResponseUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/***
 * 作者：全
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
    LoginAndRegisterService service = new LoginAndRegisterServiceImpl();
    //编码
    private final String CHARACTER_ENCODING = "utf-8";
    //前端发送过来邮箱或者电话号码的key
    private final String USERNAME = "username";
    //前端发送过来的密码的key
    private final String PASSWORD = "password";
    //前端发送过来的是否勾选记住密码的key
    private final String REMEMBER = "remember";
    private final String USER_ID = "user_id";


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding(CHARACTER_ENCODING);
        //获取邮箱或者电话号码
        String username = request.getParameter(USERNAME);
        //获取密码
        String password = request.getParameter(PASSWORD);
        User user = new User();
        user.setEmail(username);
        user.setTelephoneNumber(username);
        user.setLoginPassword(password);
        //登录验证
        User flag = service.login(user);
        ResponseEntity entity = new ResponseEntity();
        if(flag!=null){
            entity.setStatus(Status.SUCCESS);
            entity.setMsg(Message.SUCCESS);
            entity.setData(flag);
            //如果验证通过
            //把用户的id存放到session域中
            request.getSession().setAttribute(USER_ID,flag.getId());
            //获取是否勾选记住密码进行判断
            String remember = request.getParameter(REMEMBER);
            if(remember !=null){
                //如果勾选
                //把用户名和密码存放到cookie中
                Cookie cookie = new Cookie(USERNAME, username);
                cookie.setMaxAge(60*60);
                response.addCookie(cookie);
                Cookie cookie1 = new Cookie(PASSWORD, password);
                cookie.setMaxAge(60*60);
                response.addCookie(cookie1);
            }else {
                //否则删除cookie
                Cookie cookie = new Cookie(USERNAME, "");
                cookie.setMaxAge(0);
                response.addCookie(cookie);
                Cookie cookie1 = new Cookie(PASSWORD, "");
                cookie.setMaxAge(0);
                response.addCookie(cookie1);
            }
        }else {
            entity.setStatus(Status.ERROR);
            entity.setMsg(Message.ERROR);
        }
        ResponseUtils.responseToJson(response,entity);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
