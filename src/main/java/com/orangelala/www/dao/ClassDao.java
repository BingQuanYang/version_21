package com.orangelala.www.dao;
import com.orangelala.www.entity.Category;
import com.orangelala.www.entity.Classification;
import com.orangelala.www.entity.Headlines;
import com.orangelala.www.entity.Information;

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

    /**
     * 查询所有信息1
     * @return  所有信息
     */
    List<Information> selectInformation();

    /**
     * 查询所有信息2
     * @return  所有信息
     */
    List<Information> selectInformation2();

    /**
     * 查询单体分类信息1
     * @return 信息
     */
    List<Category> selectCategory();

    /**
     * 查询单体分类信息2
     * @return 信息
     */
    List<Category> selectCategory2();
}
