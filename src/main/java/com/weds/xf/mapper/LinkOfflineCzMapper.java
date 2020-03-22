package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.LinkOfflineCzEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface LinkOfflineCzMapper {
    /**
     */
    int deleteByPrimaryKey(Integer xh);

    /**
     */
    int insert(LinkOfflineCzEntity record);

    /**
     */
    int insertSelective(LinkOfflineCzEntity record);

    /**
     */
    LinkOfflineCzEntity selectByPrimaryKey(Integer xh);

    /**
     */
    int updateByPrimaryKeySelective(LinkOfflineCzEntity record);

    /**
     */
    int updateByPrimaryKey(LinkOfflineCzEntity record);
}