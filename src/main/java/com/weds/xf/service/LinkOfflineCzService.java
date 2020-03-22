package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .LinkOfflineCzMapper;
import com.weds.xf.entity .LinkOfflineCzEntity;

/**
 * @Author
 * @Description LinkOfflineCz管理
 * @Date 2020-03-22
 */
@Service
public class LinkOfflineCzService extends BaseService {

	@Resource
	private LinkOfflineCzMapper linkOfflineCzMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(Integer xh) {
		return linkOfflineCzMapper.deleteByPrimaryKey(xh);
	}

	public int insert(LinkOfflineCzEntity record) {
		return linkOfflineCzMapper.insert(record);
	}

	public int insertSelective(LinkOfflineCzEntity record) {
		return linkOfflineCzMapper.insertSelective(record);
	}

	public LinkOfflineCzEntity selectByPrimaryKey(Integer xh) {
		return linkOfflineCzMapper.selectByPrimaryKey(xh);
	}

	public int updateByPrimaryKeySelective(LinkOfflineCzEntity record) {
		return linkOfflineCzMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(LinkOfflineCzEntity record) {
		return linkOfflineCzMapper.updateByPrimaryKey(record);
	}

    
	

    
    }
