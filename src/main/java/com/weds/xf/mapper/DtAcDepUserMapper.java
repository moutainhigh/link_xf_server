package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.DtAcDepUserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface DtAcDepUserMapper {
    /**
     */
    int deleteByPrimaryKey(Integer xh);

    /**
     */
    int insert(DtAcDepUserEntity record);

    /**
     */
    int insertSelective(DtAcDepUserEntity record);

    /**
     */
    DtAcDepUserEntity selectByPrimaryKey(@Param("userSerial") Long userSerial, @Param("devSerial") String devSerial);

    /**
     */
    int updateByPrimaryKeySelective(DtAcDepUserEntity record);

    /**
     */
    int updateByPrimaryKey(DtAcDepUserEntity record);
}