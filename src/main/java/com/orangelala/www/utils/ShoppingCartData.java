package com.orangelala.www.utils;

import com.orangelala.www.entity.Information;
import com.orangelala.www.entity.ShoppingCart;

import java.util.List;

public class ShoppingCartData {
    //商品列表
    private List<Information> informations;
    //购物车列表
    private List<ShoppingCart> shoppingCarts;

    public List<Information> getInformations() {
        return informations;
    }

    public void setInformations(List<Information> informations) {
        this.informations = informations;
    }

    public List<ShoppingCart> getShoppingCarts() {
        return shoppingCarts;
    }

    public void setShoppingCarts(List<ShoppingCart> shoppingCarts) {
        this.shoppingCarts = shoppingCarts;
    }
}
