package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .XfMxMapper;
import com.weds.xf.entity .XfMxEntity;

/**
 * @Author
 * @Description XfMx管理
 * @Date 2020-03-22
 */
@Service
public class XfMxService extends BaseService {

	@Resource
	private XfMxMapper xfMxMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(Integer xh) {
		return xfMxMapper.deleteByPrimaryKey(xh);
	}

	public int insert(XfMxEntity record) {
		return xfMxMapper.insert(record);
	}

	public int insertSelective(XfMxEntity record) {
		return xfMxMapper.insertSelective(record);
	}

	public XfMxEntity selectByPrimaryKey(Integer xh) {
		return xfMxMapper.selectByPrimaryKey(xh);
	}

	public int updateByPrimaryKeySelective(XfMxEntity record) {
		return xfMxMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(XfMxEntity record) {
		return xfMxMapper.updateByPrimaryKey(record);
	}


    
    }
