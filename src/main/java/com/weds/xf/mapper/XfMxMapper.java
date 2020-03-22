package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.XfMxEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface XfMxMapper {
    /**
     */
    int deleteByPrimaryKey(Integer xh);

    /**
     */
    int insert(XfMxEntity record);

    /**
     */
    int insertSelective(XfMxEntity record);

    /**
     */
    XfMxEntity selectByPrimaryKey(Integer xh);

    /**
     */
    int updateByPrimaryKeySelective(XfMxEntity record);

    /**
     */
    int updateByPrimaryKey(XfMxEntity record);
}