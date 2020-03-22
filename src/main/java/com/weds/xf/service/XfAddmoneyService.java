package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .XfAddmoneyMapper;
import com.weds.xf.entity .XfAddmoneyEntity;

/**
 * @Author
 * @Description XfAddmoney管理
 * @Date 2020-03-22
 */
@Service
public class XfAddmoneyService extends BaseService {

	@Resource
	private XfAddmoneyMapper xfAddmoneyMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(Integer xh) {
		return xfAddmoneyMapper.deleteByPrimaryKey(xh);
	}

	public int insert(XfAddmoneyEntity record) {
		return xfAddmoneyMapper.insert(record);
	}

	public int insertSelective(XfAddmoneyEntity record) {
		return xfAddmoneyMapper.insertSelective(record);
	}

	public XfAddmoneyEntity selectByPrimaryKey(Integer xh) {
		return xfAddmoneyMapper.selectByPrimaryKey(xh);
	}

	public int updateByPrimaryKeySelective(XfAddmoneyEntity record) {
		return xfAddmoneyMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(XfAddmoneyEntity record) {
		return xfAddmoneyMapper.updateByPrimaryKey(record);
	}

    
    }
