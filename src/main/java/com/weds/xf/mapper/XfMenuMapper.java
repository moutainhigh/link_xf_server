package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.XfMenuEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface XfMenuMapper {
    /**
     */
    int deleteByPrimaryKey(Integer xh);

    /**
     */
    int insert(XfMenuEntity record);

    /**
     */
    int insertSelective(XfMenuEntity record);

    /**
     */
    XfMenuEntity selectByPrimaryKey(Integer xh);

    /**
     */
    int updateByPrimaryKeySelective(XfMenuEntity record);

    /**
     */
    int updateByPrimaryKey(XfMenuEntity record);
}