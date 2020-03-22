package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.DtDevEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface DtDevMapper {
    /**
     */
    int deleteByPrimaryKey(Integer xh);

    /**
     */
    int insert(DtDevEntity record);

    /**
     */
    int insertSelective(DtDevEntity record);

    /**
     */
    DtDevEntity selectByPrimaryKey(Integer xh);

    /**
     */
    int updateByPrimaryKeySelective(DtDevEntity record);

    /**
     */
    int updateByPrimaryKey(DtDevEntity record);
}