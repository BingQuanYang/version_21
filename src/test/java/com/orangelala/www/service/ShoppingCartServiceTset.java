package com.orangelala.www.service;

import com.orangelala.www.service.impl.ShoppingCartServiceImpl;
import com.orangelala.www.utils.ShoppingCartData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartServiceTset {
    private ShoppingCartService shoppingCartService = new ShoppingCartServiceImpl();
    @Test
    public void getShoppingCartDataByUserId(){
        ShoppingCartData shoppingCartData = shoppingCartService.getShoppingCartDataByUserId("1");
        System.out.println(shoppingCartData);
    }
    @Test
    public void s(){
        ShoppingCartData s1 = shoppingCartService.updateShoppingCartNumber("1", "3", 2);
        System.out.println(s1);
        ShoppingCartData s2 = shoppingCartService.updateShoppingCartNumber("1", "3", -1);
        System.out.println(s2);
        ShoppingCartData s3 = shoppingCartService.updateShoppingCartNumber("1", "7", 1);
        System.out.println(s3);
        ShoppingCartData s4 = shoppingCartService.updateShoppingCartNumber("1", "7", -2);
        System.out.println(s4);
    }

    @Test
    public void clearShoppingCartByUserId(){
        List<String> list = new ArrayList<>();
        list.add("3");
        list.add("4");
        list.add("8");
        ShoppingCartData shoppingCartData = shoppingCartService.clearShoppingCartByUserId("1", list);
        System.out.println(shoppingCartData);
    }
}
