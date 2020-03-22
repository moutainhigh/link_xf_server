package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.StDeviceEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface StDeviceMapper {
    /**
     */
    int deleteByPrimaryKey(String bh);

    /**
     */
    int insert(StDeviceEntity record);

    /**
     */
    int insertSelective(StDeviceEntity record);

    /**
     */
    StDeviceEntity selectByPrimaryKey(String bh);

    /**
     */
    int updateByPrimaryKeySelective(StDeviceEntity record);

    /**
     */
    int updateByPrimaryKeyWithBLOBs(StDeviceEntity record);

    /**
     */
    int updateByPrimaryKey(StDeviceEntity record);
}