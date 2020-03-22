package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.XfAddmoneyEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface XfAddmoneyMapper {
    /**
     */
    int deleteByPrimaryKey(Integer xh);

    /**
     */
    int insert(XfAddmoneyEntity record);

    /**
     */
    int insertSelective(XfAddmoneyEntity record);

    /**
     */
    XfAddmoneyEntity selectByPrimaryKey(Integer xh);

    /**
     */
    int updateByPrimaryKeySelective(XfAddmoneyEntity record);

    /**
     */
    int updateByPrimaryKey(XfAddmoneyEntity record);
}