package com.orangelala.www.dao;

import com.orangelala.www.entity.Shop;

import java.util.List;

public interface ShoppingDao {
    List<Shop> selectshoplist(String id);

}
