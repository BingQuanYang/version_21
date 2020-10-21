package com.orangelala.www.controller;

import com.orangelala.www.resp.Message;
import com.orangelala.www.resp.ResponseEntity;
import com.orangelala.www.resp.Status;
import com.orangelala.www.service.ShoppingCartService;
import com.orangelala.www.service.impl.ShoppingCartServiceImpl;
import com.orangelala.www.utils.ResponseUtils;
import com.orangelala.www.utils.ShoppingCartData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/ShoppingCartController")
public class ShoppingCartController extends HttpServlet {
    ShoppingCartService service = new ShoppingCartServiceImpl();
    private final String CHARACTER_ENCODING = "utf-8";
    //作为操作的一个标识
    public final String ANCTION = "anction";
    public final String GET_DATA = "getData";
    public final String UPDATE_DATA = "updateData";
    public final String DELETE_DATA = "deleteData";
    public final String USER_ID = "userId";
    public final String COMMODITY_ID_LIST = "commodityIdList";
    public final String COMMODITY_ID = "commodityId";
    public final String NUMBER = "number";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding(CHARACTER_ENCODING);
        ResponseEntity entity = new ResponseEntity();
        try {
            ShoppingCartData data = null;
            String userId = null;
            String commodityId = null;
            int number = 0;
            String[] commodityIdList = null;
            String anction = request.getParameter(ANCTION);
            switch (anction){
                case GET_DATA:
                    userId = request.getParameter(USER_ID);
                    data = service.getShoppingCartDataByUserId(userId);
                    entity.setData(data);
                    entity.setMsg(Message.SUCCESS);
                    entity.setStatus(Status.SUCCESS);
                    break;
                case UPDATE_DATA:
                    userId = request.getParameter(USER_ID);
                    commodityId = request.getParameter(COMMODITY_ID);
                    number = Integer.parseInt(request.getParameter(NUMBER));
                    data = service.updateShoppingCartNumber(userId,commodityId,number);
                    entity.setData(data);
                    entity.setMsg(Message.SUCCESS);
                    entity.setStatus(Status.SUCCESS);
                    break;
                case DELETE_DATA:
                    userId = request.getParameter(USER_ID);
                    commodityIdList = request.getParameterValues(COMMODITY_ID_LIST);
                    if(commodityIdList != null){
                        List<String> list = new ArrayList<String>(Arrays.asList(commodityIdList));
                        data = service.clearShoppingCartByUserId(userId,list);
                        entity.setData(data);
                        entity.setMsg(Message.SUCCESS);
                        entity.setStatus(Status.SUCCESS);
                    }
                    break;
                default:
                    entity.setMsg(Message.ERROR);
                    entity.setStatus(Status.ERROR);
            }
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
