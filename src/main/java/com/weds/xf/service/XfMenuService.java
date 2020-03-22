package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .XfMenuMapper;
import com.weds.xf.entity .XfMenuEntity;

/**
 * @Author
 * @Description XfMenu管理
 * @Date 2020-03-22
 */
@Service
public class XfMenuService extends BaseService {

	@Resource
	private XfMenuMapper xfMenuMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(Integer xh) {
		return xfMenuMapper.deleteByPrimaryKey(xh);
	}

	public int insert(XfMenuEntity record) {
		return xfMenuMapper.insert(record);
	}

	public int insertSelective(XfMenuEntity record) {
		return xfMenuMapper.insertSelective(record);
	}

	public XfMenuEntity selectByPrimaryKey(Integer xh) {
		return xfMenuMapper.selectByPrimaryKey(xh);
	}

	public int updateByPrimaryKeySelective(XfMenuEntity record) {
		return xfMenuMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(XfMenuEntity record) {
		return xfMenuMapper.updateByPrimaryKey(record);
	}

    
	

    
    }
