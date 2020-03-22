package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .StDeviceMapper;
import com.weds.xf.entity .StDeviceEntity;

/**
 * @Author
 * @Description StDevice管理
 * @Date 2020-03-22
 */
@Service
public class StDeviceService extends BaseService {

	@Resource
	private StDeviceMapper stDeviceMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(String bh) {
		return stDeviceMapper.deleteByPrimaryKey(bh);
	}

	public int insert(StDeviceEntity record) {
		return stDeviceMapper.insert(record);
	}

	public int insertSelective(StDeviceEntity record) {
		return stDeviceMapper.insertSelective(record);
	}

	public StDeviceEntity selectByPrimaryKey(String bh) {
		return stDeviceMapper.selectByPrimaryKey(bh);
	}

	public int updateByPrimaryKeySelective(StDeviceEntity record) {
		return stDeviceMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(StDeviceEntity record) {
		return stDeviceMapper.updateByPrimaryKey(record);
	}

    
	

    
    }
