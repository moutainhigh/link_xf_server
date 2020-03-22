package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .WtCardLogMapper;
import com.weds.xf.entity .WtCardLogEntity;

/**
 * @Author
 * @Description WtCardLog管理
 * @Date 2020-03-22
 */
@Service
public class WtCardLogService extends BaseService {

	@Resource
	private WtCardLogMapper wtCardLogMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(Integer xh) {
		return wtCardLogMapper.deleteByPrimaryKey(xh);
	}

	public int insert(WtCardLogEntity record) {
		return wtCardLogMapper.insert(record);
	}

	public int insertSelective(WtCardLogEntity record) {
		return wtCardLogMapper.insertSelective(record);
	}

	public WtCardLogEntity selectByPrimaryKey(Integer xh) {
		return wtCardLogMapper.selectByPrimaryKey(xh);
	}

	public int updateByPrimaryKeySelective(WtCardLogEntity record) {
		return wtCardLogMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(WtCardLogEntity record) {
		return wtCardLogMapper.updateByPrimaryKey(record);
	}

    
	

    
    }
