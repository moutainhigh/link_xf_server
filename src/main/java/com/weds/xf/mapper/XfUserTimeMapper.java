package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.XfUserTimeEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface XfUserTimeMapper {
    /**
     */
    int deleteByPrimaryKey(Integer xh);

    /**
     */
    int insert(XfUserTimeEntity record);

    /**
     */
    int insertSelective(XfUserTimeEntity record);

    /**
     */
    XfUserTimeEntity selectByPrimaryKey(Integer xh);

    /**
     */
    int updateByPrimaryKeySelective(XfUserTimeEntity record);

    /**
     */
    int updateByPrimaryKey(XfUserTimeEntity record);
}