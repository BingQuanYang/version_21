package com.orangelala.www.dao.impl;

import com.orangelala.www.dao.ShoppingDao;
import com.orangelala.www.entity.Shop;
import com.orangelala.www.utils.DBManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShoppingDaolmpl implements ShoppingDao {

    @Override
    public List<Shop> selectshoplist(String id) {
        String sql ="select id,p_id,unit_price,number,u_id,is_available from shopping_cart";
        Connection conn =null;
        PreparedStatement ps =null;
        ResultSet rs =null;
        List<Shop> list=null;
        try{
            conn= DBManager.getInstance().initConnection();
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            list=new ArrayList<>();
            while (rs.next()){
                id= rs.getString(1);
                String p_id=rs.getString(2);
                double unitPricr=rs.getDouble(3);
                int number=rs.getInt(4);
                int u_id=rs.getInt(5);
                int is_available=rs.getInt(6);
                Shop shop=new Shop();
                shop.setId(id);
                shop.setP_id(p_id);
                shop.setUnit_price(unitPricr);
                shop.setNumber(number);
                shop.setU_id(u_id);
                shop.getIs_available(is_available);
                list.add(shop);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBManager.getInstance().close(conn,ps,rs);
        }
    return list;
    }

}
