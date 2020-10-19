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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者：全
 */
@WebServlet("/EmailRegisterController")
public class EmailRegisterController extends HttpServlet {
    LoginAndRegisterService service = new LoginAndRegisterServiceImpl();
    //编码
    private final String CHARACTER_ENCODING = "utf-8";
    //前端发送过来邮箱的key
    private final String EMAIL = "email";
    //前端发送过来的密码的key
    private final String PASSWORD = "password";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding(CHARACTER_ENCODING);
        //获取邮箱
        String  email= request.getParameter(EMAIL);
        //获取密码
        String password = request.getParameter(PASSWORD);
        User user = new User();
        user.setEmail(email);
        user.setLoginPassword(password);
        //注册操作
        boolean flag = service.emailRegister(user);
        ResponseEntity entity = new ResponseEntity();
        if(flag){
            //注册成功
            entity.setStatus(Status.SUCCESS);
            entity.setMsg(Message.SUCCESS);
        }else {
            //注册失败
            entity.setStatus(Status.ERROR);
            entity.setMsg(Message.ERROR);
        }
        ResponseUtils.responseToJson(response,entity);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
