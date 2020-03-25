package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.XfAcTimeEntity;
import org.apache.ibatis.annotations.Param;

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
    XfAcTimeEntity selectByAcTypeAndTimeNo(@Param("acType") String acType,@Param("timeNo") String timeNo);

    /**
     */
    XfAcTimeEntity selectByAcDepAndTimeNo(@Param("acDep") Long acDep,@Param("timeNo") String timeNo);

    /**
     */
    int updateByPrimaryKeySelective(XfAcTimeEntity record);

    /**
     */
    int updateByPrimaryKey(XfAcTimeEntity record);

}