package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.XfMenuJlEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface XfMenuJlMapper {
    /**
     */
    int deleteByPrimaryKey(Integer xh);

    /**
     */
    int insert(XfMenuJlEntity record);

    /**
     */
    int insertSelective(XfMenuJlEntity record);

    /**
     */
    XfMenuJlEntity selectByPrimaryKey(Integer xh);

    /**
     */
    int updateByPrimaryKeySelective(XfMenuJlEntity record);

    /**
     */
    int updateByPrimaryKey(XfMenuJlEntity record);
}