package com.orangelala.www.service.impl;

import com.orangelala.www.dao.InformationDao;
import com.orangelala.www.dao.ShoppingCartDao;
import com.orangelala.www.dao.impl.InformationDaoImpl;
import com.orangelala.www.dao.impl.ShoppingCartDaoImpl;
import com.orangelala.www.entity.Information;
import com.orangelala.www.entity.ShoppingCart;
import com.orangelala.www.service.ShoppingCartService;
import com.orangelala.www.utils.ShoppingCartData;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 * 作者：全
 */
public class ShoppingCartServiceImpl implements ShoppingCartService {
    ShoppingCartDao shoppingCartDao = new ShoppingCartDaoImpl();
    InformationDao informationDao = new InformationDaoImpl();

    /**
     * 根据用户id获取购物车数据
     * @param id 用户id
     * @return  购物车数据
     */
    @Override
    public ShoppingCartData getShoppingCartDataByUserId(String id) {
        ShoppingCartData shoppingCartData = new ShoppingCartData();
        //获取指定用户的购物车信息
        List<ShoppingCart> shoppingCarts = shoppingCartDao.selectShoppingCartByUserId(id);
        shoppingCartData.setShoppingCarts(shoppingCarts);
        //获取购物车信息的商品详细信息
        List<Information> informations = new ArrayList<>();
        for (ShoppingCart shoppingCart : shoppingCarts) {
            String pId = shoppingCart.getPId();
            Information info = informationDao.getIntroductionById(pId);
            informations.add(info);
        }
        shoppingCartData.setInformations(informations);
        return shoppingCartData;
    }

    /**
     * 根据用户id和商品id修改购物车指定商品的数量
     * @param userId
     * @param commodityId
     * @param num
     * @return
     */
    @Override
    public ShoppingCartData updateShoppingCartNumber(String userId, String commodityId, int num) {
        //判断该商品存不存在
        int flag = shoppingCartDao.selectCountByUserIdAndCommodityId(userId, commodityId);
        if (flag == 0){
            //如果不存在则添加
            ShoppingCart shoppingCart = new ShoppingCart();
            shoppingCart.setId(UUID.randomUUID().toString());
            shoppingCart.setPId(commodityId);
            shoppingCart.setIsAvailable(1);
            shoppingCart.setUId(userId);
            shoppingCart.setNumber(num);
            int i = shoppingCartDao.insertShoppingCart(shoppingCart);
            return getShoppingCartDataByUserId(userId);
        }
        int number = shoppingCartDao.selectNumberByUserIdAndCommodityId(userId, commodityId);
        number += num;
        if(number<=0){
            int i = shoppingCartDao.deleteshoppingCart(userId, commodityId);
        }else {
            shoppingCartDao.upateshoppingCartNumber(userId,commodityId,number);
        }
        return getShoppingCartDataByUserId(userId);
    }

    /**
     * 根据用户id和商品id删除购物车
     * @param userId    用户id
     * @param commodityIds 商品id的集合
     * @return
     */
    @Override
    public ShoppingCartData clearShoppingCartByUserId(String userId, List<String> commodityIds) {
        if(commodityIds != null){
            for (String commodityId : commodityIds) {
                shoppingCartDao.deleteshoppingCart(userId,commodityId);
            }
        }
        return getShoppingCartDataByUserId(userId);
    }

    /**
     * 根据用户id和商品id添加购物车信息
     * @param userId 用户id
     * @param commodityId
     * @return
     */
    @Override
    public ShoppingCartData addShoppingCart(String userId, String commodityId) {
        return null;
    }
}
