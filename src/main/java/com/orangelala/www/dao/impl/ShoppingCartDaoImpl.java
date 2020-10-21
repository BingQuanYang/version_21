package com.orangelala.www.dao.impl;

import com.orangelala.www.dao.ShoppingCartDao;
import com.orangelala.www.entity.ShoppingCart;
import com.orangelala.www.utils.DBManager;

import java.util.List;
/**
 * 作者：全
 */
public class ShoppingCartDaoImpl implements ShoppingCartDao {
    @Override
    public List<ShoppingCart> selectShoppingCartByUserId(String id) {
        String sql = "select id, p_id, unit_price, number, u_id, is_available  from shopping_cart where is_available=1 and u_id=?";
        return DBManager.selectList(sql,ShoppingCart.class,id);
    }

    @Override
    public int insertShoppingCart(ShoppingCart shoppingCart) {
        String sql = "insert into shopping_cart(id, p_id, unit_price, number, u_id, is_available) values(?,?,?,?,?,?)";
        return DBManager.commonUpdate(sql,shoppingCart.getId(),shoppingCart.getPId(),shoppingCart.getUnitPrice(),shoppingCart.getNumber(),shoppingCart.getUId(),shoppingCart.getIsAvailable());
    }

    @Override
    public int upateshoppingCartNumber(String userId, String commodityId, int num) {
        String sql = "update shopping_cart set number=? where is_available=1 and u_id=? and p_id=?";
        return DBManager.commonUpdate(sql,num,userId,commodityId);
    }

    @Override
    public int selectCountByUserIdAndCommodityId(String userId, String commodityId) {
        String sql ="select count(*) from shopping_cart where is_available=1 and u_id=? and p_id=?";
        return DBManager.selectCount(sql,userId,commodityId);
    }

    @Override
    public int deleteshoppingCart(String userId, String commodity) {
        String sql = "update shopping_cart set is_available=0 where is_available=1 and u_id=? and p_id=?";
        return DBManager.commonUpdate(sql,userId,commodity);
    }
}
