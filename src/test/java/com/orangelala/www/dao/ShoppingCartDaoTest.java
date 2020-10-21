package com.orangelala.www.dao;

import com.orangelala.www.dao.impl.ShoppingCartDaoImpl;
import com.orangelala.www.entity.ShoppingCart;
import org.junit.Test;


/**
 * 作者：全
 */
public class ShoppingCartDaoTest {
    ShoppingCartDao shoppingCartDao = new ShoppingCartDaoImpl();
    @Test
    public void selectShoppingCartByUserId(){
        System.out.println(shoppingCartDao.selectShoppingCartByUserId("1"));
    }

    @Test
    public void insertShoppingCart(){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setId("6");
        shoppingCart.setIsAvailable(1);
        shoppingCart.setNumber(2);
        shoppingCart.setUId("2");
        shoppingCart.setPId("6");
        shoppingCart.setUnitPrice("9.9");
        System.out.println(shoppingCartDao.insertShoppingCart(shoppingCart));
    }


    @Test
    public void upateshoppingCartNumber(){
        System.out.println(shoppingCartDao.upateshoppingCartNumber("1", "3", 2));
    }

    @Test
    public void selectCountByUserIdAndCommodityId(){
        System.out.println(shoppingCartDao.selectCountByUserIdAndCommodityId("1", "3"));
        System.out.println(shoppingCartDao.selectCountByUserIdAndCommodityId("1", "6"));
    }

    @Test
    public void deleteshoppingCart(){
        System.out.println(shoppingCartDao.deleteshoppingCart("2", "6"));
        System.out.println(shoppingCartDao.deleteshoppingCart("2", "6"));
    }
}
