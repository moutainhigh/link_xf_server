package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.DtAcLinkEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface DtAcLinkMapper {
    /**
     */
    int deleteByPrimaryKey(Long userSerial);

    /**
     */
    int insert(DtAcLinkEntity record);

    /**
     */
    int insertSelective(DtAcLinkEntity record);

    /**
     */
    DtAcLinkEntity selectByPrimaryKey(Long userSerial);

    /**
     */
    int updateByPrimaryKeySelective(DtAcLinkEntity record);

    /**
     */
    int updateByPrimaryKey(DtAcLinkEntity record);
}