package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .XfJlMapper;
import com.weds.xf.entity .XfJlEntity;

/**
 * @Author
 * @Description XfJl管理
 * @Date 2020-03-22
 */
@Service
public class XfJlService extends BaseService {

	@Resource
	private XfJlMapper xfJlMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(Integer xh) {
		return xfJlMapper.deleteByPrimaryKey(xh);
	}

	public int insert(XfJlEntity record) {
		return xfJlMapper.insert(record);
	}

	public int insertSelective(XfJlEntity record) {
		return xfJlMapper.insertSelective(record);
	}

	public XfJlEntity selectByPrimaryKey(Integer xh) {
		return xfJlMapper.selectByPrimaryKey(xh);
	}

	public XfJlEntity selectMaxByUser(Long userSerial) {
		return xfJlMapper.selectMaxByUser(userSerial);
	}

	public int updateByPrimaryKeySelective(XfJlEntity record) {
		return xfJlMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(XfJlEntity record) {
		return xfJlMapper.updateByPrimaryKey(record);
	}

    
    }
