package com.weds.xf .service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper .DtCardMapper;
import com.weds.xf.entity .DtCardEntity;

/**
 * @Author
 * @Description DtCard管理
 * @Date 2020-03-22
 */
@Service
public class DtCardService extends BaseService {

	@Resource
	private DtCardMapper dtCardMapper;

	private Logger log = LogManager.getLogger();

	public int deleteByPrimaryKey(String cardSerial) {
		return dtCardMapper.deleteByPrimaryKey(cardSerial);
	}

	public int insert(DtCardEntity record) {
		return dtCardMapper.insert(record);
	}

	public int insertSelective(DtCardEntity record) {
		return dtCardMapper.insertSelective(record);
	}

	public DtCardEntity selectByPrimaryKey(String cardSerial) {
		return dtCardMapper.selectByPrimaryKey(cardSerial);
	}

	public int updateByPrimaryKeySelective(DtCardEntity record) {
		return dtCardMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(DtCardEntity record) {
		return dtCardMapper.updateByPrimaryKey(record);
	}

    public DtCardEntity selectByCardHao(String cardHao){
		return  dtCardMapper.selectByCardHao(cardHao);
	}
	

    
    }
