package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .XfYcMapper;
import com.weds.xf.entity .XfYcEntity;

/**
 * @Author
 * @Description XfYc管理
 * @Date 2020-03-22
 */
@Service
public class XfYcService extends BaseService {

	@Resource
	private XfYcMapper xfYcMapper;

	private Logger log = LogManager.getLogger();


	public int insert(XfYcEntity record) {
		return xfYcMapper.insert(record);
	}

	public int insertSelective(XfYcEntity record) {
		return xfYcMapper.insertSelective(record);
	}

    
    }
