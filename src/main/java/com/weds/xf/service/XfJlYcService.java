package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .XfJlYcMapper;
import com.weds.xf.entity .XfJlYcEntity;

/**
 * @Author
 * @Description XfJlYc管理
 * @Date 2020-03-22
 */
@Service
public class XfJlYcService extends BaseService {

	@Resource
	private XfJlYcMapper xfJlYcMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(Integer xh) {
		return xfJlYcMapper.deleteByPrimaryKey(xh);
	}

	public int insert(XfJlYcEntity record) {
		return xfJlYcMapper.insert(record);
	}

	public int insertSelective(XfJlYcEntity record) {
		return xfJlYcMapper.insertSelective(record);
	}

	public XfJlYcEntity selectByPrimaryKey(Integer xh) {
		return xfJlYcMapper.selectByPrimaryKey(xh);
	}

	public int updateByPrimaryKeySelective(XfJlYcEntity record) {
		return xfJlYcMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(XfJlYcEntity record) {
		return xfJlYcMapper.updateByPrimaryKey(record);
	}


    
    }
