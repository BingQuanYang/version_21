package com.orangelala.www.dao;

import com.orangelala.www.entity.Details;

public interface DetailsDao {
    //通过id获取到详细信息
    Details getDetailsById(String id);

}
