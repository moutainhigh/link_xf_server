package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.XfAddeachEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface XfAddeachMapper {
    /**
     */
    int deleteByPrimaryKey(Integer xh);

    /**
     */
    int insert(XfAddeachEntity record);

    /**
     */
    int insertSelective(XfAddeachEntity record);

    /**
     */
    XfAddeachEntity selectByPrimaryKey(Integer xh);

    /**
     */
    int updateByPrimaryKeySelective(XfAddeachEntity record);

    /**
     */
    int updateByPrimaryKey(XfAddeachEntity record);
}