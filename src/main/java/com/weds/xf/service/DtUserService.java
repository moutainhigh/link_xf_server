package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .DtUserMapper;
import com.weds.xf.entity .DtUserEntity;

/**
 * @Author
 * @Description DtUser管理
 * @Date 2020-03-22
 */
@Service
public class DtUserService extends BaseService {

	@Resource
	private DtUserMapper dtUserMapper;

	private Logger log = LogManager.getLogger();


	public DtUserEntity selectByPrimaryKey(Long userSerial) {
		return dtUserMapper.selectByPrimaryKey(userSerial);
	}

	

    
    }
