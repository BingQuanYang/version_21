package com.orangelala.www.dao;
import com.orangelala.www.entity.Classification;

import java.util.List;

/**
 * kun
 */
public interface ClassDao {
    /**
     * 查询分类信息
     * @return 分类信息
     */
    List<Classification> selectClassInformation();
}
