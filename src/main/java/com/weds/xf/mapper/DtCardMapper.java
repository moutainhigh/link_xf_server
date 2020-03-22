package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.DtCardEntity;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface DtCardMapper {
    /**
     */
    int deleteByPrimaryKey(String cardSerial);

    /**
     */
    int insert(DtCardEntity record);

    /**
     */
    int insertSelective(DtCardEntity record);

    /**
     */
    DtCardEntity selectByPrimaryKey(String cardSerial);

    /**
     */
    int updateByPrimaryKeySelective(DtCardEntity record);

    /**
     */
    int updateByPrimaryKey(DtCardEntity record);


    /**
     */
    DtCardEntity selectByCardHao(String cardHao);

}