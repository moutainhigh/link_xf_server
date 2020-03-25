package com.weds.xf.service;

import javax.annotation.Resource;

import com.weds.core.resp.JsonResult;
import com.weds.xf.entity.DtAcLinkEntity;
import com.weds.xf.entity.TradEntity;
import com.weds.xf.entity.TradReqEntity;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper.DtAcUserMapper;
import com.weds.xf.entity.DtAcUserEntity;

/**
 * @Author
 * @Description DtAcUser管理
 * @Date 2020-03-22
 */
@Service
public class DtAcUserService extends BaseService {

    @Resource
    private DtAcUserMapper dtAcUserMapper;

    private Logger log = LogManager.getLogger();

    public int deleteByPrimaryKey(Long userSerial) {
        return dtAcUserMapper.deleteByPrimaryKey(userSerial);
    }

    public int insert(DtAcUserEntity record) {
        return dtAcUserMapper.insert(record);
    }

    public int insertSelective(DtAcUserEntity record) {
        return dtAcUserMapper.insertSelective(record);
    }

    public DtAcUserEntity selectByPrimaryKey(Long userSerial) {
        return dtAcUserMapper.selectByPrimaryKey(userSerial);
    }

    public int updateByPrimaryKeySelective(DtAcUserEntity record) {
        return dtAcUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(DtAcUserEntity record) {
        return dtAcUserMapper.updateByPrimaryKey(record);
    }

    public JsonResult<TradEntity> updateByTradEntity(TradReqEntity tradReqEntity,TradEntity tradEntity) {
        DtAcUserEntity dtAcUserEntity = selectByPrimaryKey(tradEntity.getUserSerial());
        dtAcUserEntity.setAcMoney(dtAcUserEntity.getAcMoney().add(tradEntity.getDaySubAmt()).add(tradEntity.getMealSubAmt()));
        dtAcUserEntity.setAcAddm(dtAcUserEntity.getAcAddm().add(tradEntity.getChargeCash()));
        dtAcUserEntity.setAcAddo(tradEntity.getCashAmt().intValue());
        dtAcUserEntity.setAcSubm(dtAcUserEntity.getAcSubo().intValue() + tradEntity.getDaySubAmt().intValue() + tradEntity.getMealSubAmt().intValue());
        dtAcUserEntity.setAcSubo(tradEntity.getSubAmt().intValue()+tradEntity.getDaySubAmt().intValue()+ tradEntity.getMealSubAmt().intValue());
        dtAcUserEntity.setAcEachm(tradReqEntity.getTradType() == 41 ? dtAcUserEntity.getAcEachm() + 1 : dtAcUserEntity.getAcEachm());
        dtAcUserEntity.setAcEacho(tradReqEntity.getTradType() == 41 ? dtAcUserEntity.getAcEacho() + 1 : dtAcUserEntity.getAcEacho());
        dtAcUserEntity.setAcRegm(0);
        dtAcUserEntity.setAcMake(0);
        return succMsgData(tradEntity);
    }
}
