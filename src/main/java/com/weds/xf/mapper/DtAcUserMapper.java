package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.DtAcUserEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface DtAcUserMapper {
    /**
     */
    int deleteByPrimaryKey(Long userSerial);

    /**
     */
    int insert(DtAcUserEntity record);

    /**
     */
    int insertSelective(DtAcUserEntity record);

    /**
     */
    DtAcUserEntity selectByPrimaryKey(Long userSerial);

    /**
     */
    int updateByPrimaryKeySelective(DtAcUserEntity record);

    /**
     */
    int updateByPrimaryKey(DtAcUserEntity record);
}