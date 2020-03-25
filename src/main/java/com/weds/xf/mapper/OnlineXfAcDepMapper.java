package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.OnlineXfAcDepEntity;
import org.apache.ibatis.annotations.Param;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface OnlineXfAcDepMapper {
    /**
     */
    int deleteByPrimaryKey(@Param("depSerial") Integer depSerial, @Param("acSerial") Integer acSerial);

    /**
     */
    int insert(OnlineXfAcDepEntity record);

    /**
     */
    int insertSelective(OnlineXfAcDepEntity record);

    /**
     */
    OnlineXfAcDepEntity selectByPrimaryKey(@Param("depSerial") Integer depSerial, @Param("acSerial") Long acSerial);

    /**
     */
    int updateByPrimaryKeySelective(OnlineXfAcDepEntity record);

    /**
     */
    int updateByPrimaryKey(OnlineXfAcDepEntity record);
}