package com.orangelala.www.dao;

import com.orangelala.www.entity.Img;

import java.util.List;

public interface ImgDao {
    List<Img> getImgsById(String id);

}
