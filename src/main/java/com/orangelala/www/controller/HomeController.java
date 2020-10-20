package com.orangelala.www.controller;

import com.orangelala.www.resp.Message;
import com.orangelala.www.resp.ResponseEntity;
import com.orangelala.www.resp.Status;
import com.orangelala.www.service.HomeService;
import com.orangelala.www.service.impl.HomeServiceImpl;
import com.orangelala.www.utils.HomeData;
import com.orangelala.www.utils.InterData;
import com.orangelala.www.utils.ResponseUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
    HomeService homeService = new HomeServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ResponseEntity entity = new ResponseEntity<>();
        try {
            HomeData homeData = homeService.getHomeDate();
            entity.setMsg(Message.SUCCESS);
            entity.setStatus(Status.SUCCESS);
            entity.setData(homeData);
        }catch (Exception e){
            entity.setMsg(Message.ERROR);
            entity.setStatus(Status.ERROR);
        }
        ResponseUtils.responseToJson(response,entity);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
