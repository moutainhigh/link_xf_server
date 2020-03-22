package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.DtAcDepUserEntity;

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
    DtAcDepUserEntity selectByPrimaryKey(Integer xh);

    /**
     */
    int updateByPrimaryKeySelective(DtAcDepUserEntity record);

    /**
     */
    int updateByPrimaryKey(DtAcDepUserEntity record);
}