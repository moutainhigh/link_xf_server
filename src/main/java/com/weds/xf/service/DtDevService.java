package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .DtDevMapper;
import com.weds.xf.entity .DtDevEntity;

/**
 * @Author
 * @Description DtDev管理
 * @Date 2020-03-22
 */
@Service
public class DtDevService extends BaseService {

	@Resource
	private DtDevMapper dtDevMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(Integer xh) {
		return dtDevMapper.deleteByPrimaryKey(xh);
	}

	public int insert(DtDevEntity record) {
		return dtDevMapper.insert(record);
	}

	public int insertSelective(DtDevEntity record) {
		return dtDevMapper.insertSelective(record);
	}

	public DtDevEntity selectByPrimaryKey(Integer xh) {
		return dtDevMapper.selectByPrimaryKey(xh);
	}

	public int updateByPrimaryKeySelective(DtDevEntity record) {
		return dtDevMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(DtDevEntity record) {
		return dtDevMapper.updateByPrimaryKey(record);
	}

    
	

    
    }
