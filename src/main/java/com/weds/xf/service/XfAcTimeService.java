package com.weds.xf .service;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .XfAcTimeMapper;
import com.weds.xf.entity .XfAcTimeEntity;

/**
 * @Author
 * @Description XfAcTime管理
 * @Date 2020-03-22
 */
@Service
public class XfAcTimeService extends BaseService {

	@Resource
	private XfAcTimeMapper xfAcTimeMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(Integer xh) {
		return xfAcTimeMapper.deleteByPrimaryKey(xh);
	}

	public int insert(XfAcTimeEntity record) {
		return xfAcTimeMapper.insert(record);
	}

	public int insertSelective(XfAcTimeEntity record) {
		return xfAcTimeMapper.insertSelective(record);
	}

	public XfAcTimeEntity selectByPrimaryKey(Integer xh) {
		return xfAcTimeMapper.selectByPrimaryKey(xh);
	}

	public  XfAcTimeEntity selectByAcTypeAndTimeNo(String acType,String timeNo){
		return xfAcTimeMapper.selectByAcTypeAndTimeNo(acType, timeNo);
	}

	public XfAcTimeEntity selectByAcDepAndTimeNo(Integer acDep,String timeNo){
		return xfAcTimeMapper.selectByAcDepAndTimeNo(acDep, timeNo);
	}

	public int updateByPrimaryKeySelective(XfAcTimeEntity record) {
		return xfAcTimeMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(XfAcTimeEntity record) {
		return xfAcTimeMapper.updateByPrimaryKey(record);
	}

    
	

    
    }
