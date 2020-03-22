package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .DtAcTypeMapper;
import com.weds.xf.entity .DtAcTypeEntity;

/**
 * @Author
 * @Description DtAcType管理
 * @Date 2020-03-22
 */
@Service
public class DtAcTypeService extends BaseService {

	@Resource
	private DtAcTypeMapper dtAcTypeMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(String acBh) {
		return dtAcTypeMapper.deleteByPrimaryKey(acBh);
	}

	public int insert(DtAcTypeEntity record) {
		return dtAcTypeMapper.insert(record);
	}

	public int insertSelective(DtAcTypeEntity record) {
		return dtAcTypeMapper.insertSelective(record);
	}

	public DtAcTypeEntity selectByPrimaryKey(String acBh) {
		return dtAcTypeMapper.selectByPrimaryKey(acBh);
	}

	public int updateByPrimaryKeySelective(DtAcTypeEntity record) {
		return dtAcTypeMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(DtAcTypeEntity record) {
		return dtAcTypeMapper.updateByPrimaryKey(record);
	}

    
	

    
    }
