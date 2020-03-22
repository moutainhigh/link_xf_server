package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.WtCardLogEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface WtCardLogMapper {
    /**
     */
    int deleteByPrimaryKey(Integer xh);

    /**
     */
    int insert(WtCardLogEntity record);

    /**
     */
    int insertSelective(WtCardLogEntity record);

    /**
     */
    WtCardLogEntity selectByPrimaryKey(Integer xh);

    /**
     */
    int updateByPrimaryKeySelective(WtCardLogEntity record);

    /**
     */
    int updateByPrimaryKey(WtCardLogEntity record);
}