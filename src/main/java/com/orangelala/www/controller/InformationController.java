package com.orangelala.www.controller;

import com.alibaba.fastjson.JSONObject;
import com.orangelala.www.entity.Information;
import com.orangelala.www.service.InformationService;
import com.orangelala.www.service.impl.InformationServiceImpl;
import com.orangelala.www.utils.ResponeEntiry;
import com.orangelala.www.utils.ResponseUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/introduction")
public class InformationController extends HttpServlet {
    private InformationService informationService=new InformationServiceImpl();
    private ResponseUtils responseUtils=new ResponseUtils();
    public static final String CONTENT_TYPE_JSON = "application/json; charset=utf-8";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ResponeEntiry<Information>entiry=new ResponeEntiry<>();
        try {
            String id = req.getParameter("commodity_id");
            Information introductionById = informationService.getIntroductionById(id);
            entiry.setData(introductionById);
            entiry.setStatus(200);
            entiry.setMsg("success");
            resp.setContentType(CONTENT_TYPE_JSON);
        }catch (Exception e){
            entiry.setStatus(404);
            entiry.setMsg("error");
        }
        resp.getWriter().println(JSONObject.toJSONString(entiry));
    }
}
