package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .OnlineXfAcDepMapper;
import com.weds.xf.entity .OnlineXfAcDepEntity;

/**
 * @Author
 * @Description OnlineXfAcDep管理
 * @Date 2020-03-22
 */
@Service
public class OnlineXfAcDepService extends BaseService {

	@Resource
	private OnlineXfAcDepMapper onlineXfAcDepMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(Integer depSerial, Integer acSerial) {
		return onlineXfAcDepMapper.deleteByPrimaryKey(depSerial, acSerial);
	}

	public int insert(OnlineXfAcDepEntity record) {
		return onlineXfAcDepMapper.insert(record);
	}

	public int insertSelective(OnlineXfAcDepEntity record) {
		return onlineXfAcDepMapper.insertSelective(record);
	}

	public OnlineXfAcDepEntity selectByPrimaryKey(Integer depSerial, Integer acSerial) {
		return onlineXfAcDepMapper.selectByPrimaryKey(depSerial, acSerial);
	}

	public int updateByPrimaryKeySelective(OnlineXfAcDepEntity record) {
		return onlineXfAcDepMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(OnlineXfAcDepEntity record) {
		return onlineXfAcDepMapper.updateByPrimaryKey(record);
	}

    
	

    
    }
