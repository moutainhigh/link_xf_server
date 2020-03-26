package com.weds.xf.mapper;

import com.weds.core.annotation.MyBatisDao;
import com.weds.xf.entity.XfJlEntity;
import org.apache.ibatis.annotations.Param;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-22
 */
@MyBatisDao
public interface XfJlMapper {
    /**
     */
    int deleteByPrimaryKey(Integer xh);

    /**
     */
    int insert(XfJlEntity record);

    /**
     */
    int insertSelective(XfJlEntity record);

    /**
     */
    XfJlEntity selectByPrimaryKey(Integer xh);

    /**
     */
    XfJlEntity selectMaxByUser(Long userSerial);

    /**
     */
    XfJlEntity selectByDevAndJlBh(@Param("devSerial") String devSerial,@Param("jlBh") String jlBh);

    /**
     */
    int updateByPrimaryKeySelective(XfJlEntity record);

    /**
     */
    int updateByPrimaryKey(XfJlEntity record);
}