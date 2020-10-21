package com.orangelala.www.service.impl;

import com.orangelala.www.dao.ShoppingDao;
import com.orangelala.www.dao.impl.ShoppingDaolmpl;
import com.orangelala.www.service.ShoppingService;

import java.util.List;

public class ShoppingImpl implements ShoppingService {
    private ShoppingDao dao = new ShoppingDaolmpl();
    @Override
    public List getShoppingCart() {
        dao.selectshoplist("1");
        return null;
    }
}
