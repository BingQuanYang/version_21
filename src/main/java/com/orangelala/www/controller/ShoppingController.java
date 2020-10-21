package com.orangelala.www.controller;

import com.orangelala.www.service.impl.ShoppingImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ShoppingController")
public class ShoppingController extends HttpServlet {
     ShoppingImpl shopping =new ShoppingImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = (String) req.getSession().getAttribute("rand");
        shopping.getShoppingCart();
    }
}
