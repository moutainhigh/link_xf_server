package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .XfAddeachMapper;
import com.weds.xf.entity .XfAddeachEntity;

/**
 * @Author
 * @Description XfAddeach管理
 * @Date 2020-03-22
 */
@Service
public class XfAddeachService extends BaseService {

	@Resource
	private XfAddeachMapper xfAddeachMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(Integer xh) {
		return xfAddeachMapper.deleteByPrimaryKey(xh);
	}

	public int insert(XfAddeachEntity record) {
		return xfAddeachMapper.insert(record);
	}

	public int insertSelective(XfAddeachEntity record) {
		return xfAddeachMapper.insertSelective(record);
	}

	public XfAddeachEntity selectByPrimaryKey(Integer xh) {
		return xfAddeachMapper.selectByPrimaryKey(xh);
	}

	public int updateByPrimaryKeySelective(XfAddeachEntity record) {
		return xfAddeachMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(XfAddeachEntity record) {
		return xfAddeachMapper.updateByPrimaryKey(record);
	}


    
    }
