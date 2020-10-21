package com.orangelala.www.controller;

import com.alibaba.fastjson.JSONObject;
import com.orangelala.www.entity.User;
import com.orangelala.www.resp.ResponseEntity;
import com.orangelala.www.service.UserService;
import com.orangelala.www.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
    UserService userService = new UserServiceImpl();
    /**
     * 根据用户id查询用户信息
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uid = req.getParameter("uid");
        User user = userService.getUser(uid);
        //响应json格式数据   通用的结果集
        ResponseEntity<User> entity = new ResponseEntity<>();
        //user是查询的结果
        //向entity中添加查询的结果
        entity.setData(user);
        //提示信息
        entity.setMsg("success");
        //码
        entity.setStatus(200);
        //编码格式
        resp.setContentType("application/json;charset=utf-8");
        // 讲对象转化json字符串
        resp.getWriter().print(JSONObject.toJSONString(entity));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
