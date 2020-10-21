package com.orangelala.www.service;

import com.orangelala.www.entity.ShoppingCart;
import com.orangelala.www.utils.ShoppingCartData;


public interface ShoppingCartService {

    /**
     * 根据用户id获取购物车数据
     * @param id 用户id
     * @return  购物车数据
     */
    ShoppingCartData getShoppingCartDataByUserId(String id);

    /**
     * 根据用户id和商品id修改购物车指定商品的数量
     * @param userId
     * @param commodityId
     * @param num
     * @return
     */
    ShoppingCartData updateShoppingCartNumber(String userId,String commodityId,int num);

    /**
     * 根据用户id清楚购物车
     * @param id
     * @return
     */
    ShoppingCartData clearShoppingCartByUserId(String id);

    /**
     * 根据用户id和商品id添加购物车信息
     * @param userId 用户id
     * @param commodityId
     * @return
     */
    ShoppingCartData addShoppingCart(String userId,String commodityId);
}
