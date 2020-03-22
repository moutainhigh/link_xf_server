package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.DtAcTypeEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface DtAcTypeMapper {
    /**
     */
    int deleteByPrimaryKey(String acBh);

    /**
     */
    int insert(DtAcTypeEntity record);

    /**
     */
    int insertSelective(DtAcTypeEntity record);

    /**
     */
    DtAcTypeEntity selectByPrimaryKey(String acBh);

    /**
     */
    int updateByPrimaryKeySelective(DtAcTypeEntity record);

    /**
     */
    int updateByPrimaryKey(DtAcTypeEntity record);
}