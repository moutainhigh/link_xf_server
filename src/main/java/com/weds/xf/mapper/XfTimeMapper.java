package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.XfTimeEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface XfTimeMapper {
    /**
     */
    int deleteByPrimaryKey(String bh);

    /**
     */
    int insert(XfTimeEntity record);

    /**
     */
    int insertSelective(XfTimeEntity record);

    /**
     */
    XfTimeEntity selectByPrimaryKey(String bh);

    /**
     */
    int updateByPrimaryKeySelective(XfTimeEntity record);

    /**
     */
    int updateByPrimaryKey(XfTimeEntity record);
}