package com.orangelala.www.controller;

import com.alibaba.fastjson.JSONObject;
import com.orangelala.www.service.DetailsService;
import com.orangelala.www.service.impl.DetailsServiceImpl;
import com.orangelala.www.utils.DetailData;
import com.orangelala.www.utils.ResponeEntiry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/details")
public class DetailsController extends HttpServlet {
    private DetailsService detailsService=new DetailsServiceImpl();
    private ResponeEntiry<DetailData> entiry=new ResponeEntiry<>();
    public static final String CONTENT_TYPE_JSON = "application/json; charset=utf-8";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       try {
           String id = req.getParameter("details_id");
           DetailData detailDate = detailsService.getDetailDate(id);
           entiry.setData(detailDate);
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
