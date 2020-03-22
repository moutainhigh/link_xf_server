package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .XfMenuJlMapper;
import com.weds.xf.entity .XfMenuJlEntity;

/**
 * @Author
 * @Description XfMenuJl管理
 * @Date 2020-03-22
 */
@Service
public class XfMenuJlService extends BaseService {

	@Resource
	private XfMenuJlMapper xfMenuJlMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(Integer xh) {
		return xfMenuJlMapper.deleteByPrimaryKey(xh);
	}

	public int insert(XfMenuJlEntity record) {
		return xfMenuJlMapper.insert(record);
	}

	public int insertSelective(XfMenuJlEntity record) {
		return xfMenuJlMapper.insertSelective(record);
	}

	public XfMenuJlEntity selectByPrimaryKey(Integer xh) {
		return xfMenuJlMapper.selectByPrimaryKey(xh);
	}

	public int updateByPrimaryKeySelective(XfMenuJlEntity record) {
		return xfMenuJlMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(XfMenuJlEntity record) {
		return xfMenuJlMapper.updateByPrimaryKey(record);
	}


    
    }
