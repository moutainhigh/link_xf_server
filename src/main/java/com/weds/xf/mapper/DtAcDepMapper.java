package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.DtAcDepEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface DtAcDepMapper {
    /**
     */
    int deleteByPrimaryKey(Integer depSerial);

    /**
     */
    int insert(DtAcDepEntity record);

    /**
     */
    int insertSelective(DtAcDepEntity record);

    /**
     */
    DtAcDepEntity selectByPrimaryKey(Integer depSerial);

    /**
     */
    int updateByPrimaryKeySelective(DtAcDepEntity record);

    /**
     */
    int updateByPrimaryKey(DtAcDepEntity record);
}