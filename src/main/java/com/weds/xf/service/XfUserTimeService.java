package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .XfUserTimeMapper;
import com.weds.xf.entity .XfUserTimeEntity;

/**
 * @Author
 * @Description XfUserTime管理
 * @Date 2020-03-22
 */
@Service
public class XfUserTimeService extends BaseService {

	@Resource
	private XfUserTimeMapper xfUserTimeMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(Integer xh) {
		return xfUserTimeMapper.deleteByPrimaryKey(xh);
	}

	public int insert(XfUserTimeEntity record) {
		return xfUserTimeMapper.insert(record);
	}

	public int insertSelective(XfUserTimeEntity record) {
		return xfUserTimeMapper.insertSelective(record);
	}

	public XfUserTimeEntity selectByPrimaryKey(Integer xh) {
		return xfUserTimeMapper.selectByPrimaryKey(xh);
	}

	public int updateByPrimaryKeySelective(XfUserTimeEntity record) {
		return xfUserTimeMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(XfUserTimeEntity record) {
		return xfUserTimeMapper.updateByPrimaryKey(record);
	}

    
    }
