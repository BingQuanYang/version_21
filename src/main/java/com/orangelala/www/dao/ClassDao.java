package com.orangelala.www.dao;
import com.orangelala.www.entity.Classification;
import com.orangelala.www.entity.Headlines;

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
    /**
     * 查询头条信息
     * @return 头条信息
     */
    List<Headlines> selectHeadlinesInformation();
}
