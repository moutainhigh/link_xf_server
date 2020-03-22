package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .XfTimeMapper;
import com.weds.xf.entity .XfTimeEntity;

/**
 * @Author
 * @Description XfTime管理
 * @Date 2020-03-22
 */
@Service
public class XfTimeService extends BaseService {

	@Resource
	private XfTimeMapper xfTimeMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(String bh) {
		return xfTimeMapper.deleteByPrimaryKey(bh);
	}

	public int insert(XfTimeEntity record) {
		return xfTimeMapper.insert(record);
	}

	public int insertSelective(XfTimeEntity record) {
		return xfTimeMapper.insertSelective(record);
	}

	public XfTimeEntity selectByPrimaryKey(String bh) {
		return xfTimeMapper.selectByPrimaryKey(bh);
	}

	public int updateByPrimaryKeySelective(XfTimeEntity record) {
		return xfTimeMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(XfTimeEntity record) {
		return xfTimeMapper.updateByPrimaryKey(record);
	}

    
	

    
    }
