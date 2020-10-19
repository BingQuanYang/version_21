package com.orangelala.www.controller;

import com.orangelala.www.entity.Classification;
import com.orangelala.www.resp.Message;
import com.orangelala.www.resp.ResponseEntity;
import com.orangelala.www.resp.Status;
import com.orangelala.www.service.impl.ClassServiceImpl;
import com.orangelala.www.utils.InterData;
import com.orangelala.www.utils.ResponseUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * kun
 */
@WebServlet("/home2")
public class ClassController extends HttpServlet implements Message, Status {
    private ClassServiceImpl classService  = new ClassServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ResponseEntity<InterData> responseEntity = new ResponseEntity<>();
        try {
            InterData interData = classService.obtainClass();
            responseEntity.setMsg(Message.SUCCESS);
            responseEntity.setStatus(Status.SUCCESS);
            responseEntity.setData(interData);
            ResponseUtils.responseToJson(resp,responseEntity);
        }catch (Exception e){
            responseEntity.setMsg("网络错误，请稍后再试!");
        }

    }
}
