package com.weds.xf.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper.DtAcDepMapper;
import com.weds.xf.entity.DtAcDepEntity;

/**
 * @Author
 * @Description DtAcDep管理
 * @Date 2020-03-22
 */
@Service
public class DtAcDepService extends BaseService {

	@Resource
	private DtAcDepMapper dtAcDepMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(Integer depSerial) {
		return dtAcDepMapper.deleteByPrimaryKey(depSerial);
	}

	public int insert(DtAcDepEntity record) {
		return dtAcDepMapper.insert(record);
	}

	public int insertSelective(DtAcDepEntity record) {
		return dtAcDepMapper.insertSelective(record);
	}

	public DtAcDepEntity selectByPrimaryKey(Integer depSerial) {
		return dtAcDepMapper.selectByPrimaryKey(depSerial);
	}

	public int updateByPrimaryKeySelective(DtAcDepEntity record) {
		return dtAcDepMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(DtAcDepEntity record) {
		return dtAcDepMapper.updateByPrimaryKey(record);
	}

    
	

    
    }
