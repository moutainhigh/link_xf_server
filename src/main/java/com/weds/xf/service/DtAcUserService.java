package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .DtAcUserMapper;
import com.weds.xf.entity .DtAcUserEntity;

/**
 * @Author
 * @Description DtAcUser管理
 * @Date 2020-03-22
 */
@Service
public class DtAcUserService extends BaseService {

	@Resource
	private DtAcUserMapper dtAcUserMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(Long userSerial) {
		return dtAcUserMapper.deleteByPrimaryKey(userSerial);
	}

	public int insert(DtAcUserEntity record) {
		return dtAcUserMapper.insert(record);
	}

	public int insertSelective(DtAcUserEntity record) {
		return dtAcUserMapper.insertSelective(record);
	}

	public DtAcUserEntity selectByPrimaryKey(Long userSerial) {
		return dtAcUserMapper.selectByPrimaryKey(userSerial);
	}

	public int updateByPrimaryKeySelective(DtAcUserEntity record) {
		return dtAcUserMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(DtAcUserEntity record) {
		return dtAcUserMapper.updateByPrimaryKey(record);
	}

    
	

    
    }
