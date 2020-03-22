package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.XfYcEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface XfYcMapper {
    /**
     */
    int insert(XfYcEntity record);

    /**
     */
    int insertSelective(XfYcEntity record);
}