package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.XfAcTimeEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface XfAcTimeMapper {
    /**
     */
    int deleteByPrimaryKey(Integer xh);

    /**
     */
    int insert(XfAcTimeEntity record);

    /**
     */
    int insertSelective(XfAcTimeEntity record);

    /**
     */
    XfAcTimeEntity selectByPrimaryKey(Integer xh);

    /**
     */
    int updateByPrimaryKeySelective(XfAcTimeEntity record);

    /**
     */
    int updateByPrimaryKey(XfAcTimeEntity record);
}