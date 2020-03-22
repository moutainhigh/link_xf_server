package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper.DtAcDepUserMapper;
import com.weds.xf.entity.DtAcDepUserEntity;

/**
 * @Author
 * @Description DtAcDepUser管理
 * @Date 2020-03-22
 */
@Service
public class DtAcDepUserService extends BaseService {

	@Resource
	private DtAcDepUserMapper dtAcDepUserMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(Integer xh) {
		return dtAcDepUserMapper.deleteByPrimaryKey(xh);
	}

	public int insert(DtAcDepUserEntity record) {
		return dtAcDepUserMapper.insert(record);
	}

	public int insertSelective(DtAcDepUserEntity record) {
		return dtAcDepUserMapper.insertSelective(record);
	}

	public DtAcDepUserEntity selectByPrimaryKey(Integer xh) {
		return dtAcDepUserMapper.selectByPrimaryKey(xh);
	}

	public int updateByPrimaryKeySelective(DtAcDepUserEntity record) {
		return dtAcDepUserMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(DtAcDepUserEntity record) {
		return dtAcDepUserMapper.updateByPrimaryKey(record);
	}

    
	

    
    }
