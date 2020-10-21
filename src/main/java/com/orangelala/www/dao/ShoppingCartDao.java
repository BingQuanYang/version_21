package com.orangelala.www.dao;

import com.orangelala.www.entity.ShoppingCart;

import java.util.List;
/**
 * 作者：全
 */
public interface ShoppingCartDao {
    /**
     * 根据用户id查询购物信息
     * @param id    用户id
     * @return  购物表信息
     */
    List<ShoppingCart> selectShoppingCartByUserId(String id);

    /**
     * 添加购物信息
     * @param shoppingCart  购物车信息
     * @return 影响行数
     */
    int insertShoppingCart(ShoppingCart shoppingCart);


    /**
     * 根据用户id和商品id更新购物车信息的数量
     * @param userId    用户id
     * @param commodityId 商品id
     * @param num 购物查的属性
     * @return
     */
    int upateshoppingCartNumber(String userId,String commodityId,int num);


    /**
     * 根据用户id和商品id查询购物车信息的总数
     * @param userId    用户id
     * @param commodityId 商品id
     * @return
     */
    int selectCountByUserIdAndCommodityId(String userId, String commodityId);

    /**
     * 根据用户id和商品id删除购物查信息
     * @param userId
     * @param commodity
     * @return
     */
    int deleteshoppingCart(String userId,String commodity);
}
