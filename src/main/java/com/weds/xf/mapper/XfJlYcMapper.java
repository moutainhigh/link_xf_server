package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.XfJlYcEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface XfJlYcMapper {
    /**
     */
    int deleteByPrimaryKey(Integer xh);

    /**
     */
    int insert(XfJlYcEntity record);

    /**
     */
    int insertSelective(XfJlYcEntity record);

    /**
     */
    XfJlYcEntity selectByPrimaryKey(String devSerial);

    /**
     */
    int updateByPrimaryKeySelective(XfJlYcEntity record);

    /**
     */
    int updateByPrimaryKey(XfJlYcEntity record);
}