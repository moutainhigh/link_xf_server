package com.weds.xf.service;

import javax.annotation.Resource;

import com.weds.core.resp.JsonResult;
import com.weds.xf.entity.TradEntity;
import com.weds.xf.entity.TradReqEntity;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper.DtAcLinkMapper;
import com.weds.xf.entity.DtAcLinkEntity;

/**
 * @Author
 * @Description DtAcLink管理
 * @Date 2020-03-22
 */
@Service
public class DtAcLinkService extends BaseService {

    @Resource
    private DtAcLinkMapper dtAcLinkMapper;

    private Logger log = LogManager.getLogger();

    public int deleteByPrimaryKey(Long userSerial) {
        return dtAcLinkMapper.deleteByPrimaryKey(userSerial);
    }

    public int insert(DtAcLinkEntity record) {
        return dtAcLinkMapper.insert(record);
    }

    public int insertSelective(DtAcLinkEntity record) {
        return dtAcLinkMapper.insertSelective(record);
    }

    public DtAcLinkEntity selectByPrimaryKey(Long userSerial) {
        return dtAcLinkMapper.selectByPrimaryKey(userSerial);
    }

    public int updateByPrimaryKeySelective(DtAcLinkEntity record) {
        return dtAcLinkMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(DtAcLinkEntity record) {
        return dtAcLinkMapper.updateByPrimaryKey(record);
    }

    public JsonResult<TradEntity> updateByTradEntity( TradReqEntity tradReqEntity,TradEntity tradEntity) {
        DtAcLinkEntity dtAcLinkEntity = selectByPrimaryKey(tradEntity.getUserSerial());
        dtAcLinkEntity.setAcMoney(dtAcLinkEntity.getAcMoney().add(tradEntity.getDaySubAmt()).add(tradEntity.getMealSubAmt()));
        dtAcLinkEntity.setAcAddm(dtAcLinkEntity.getAcAddm().add(tradEntity.getChargeCash()));
        dtAcLinkEntity.setAcAddo(tradEntity.getCashAmt());
        dtAcLinkEntity.setAcSubm(dtAcLinkEntity.getAcSubo().add(tradEntity.getDaySubAmt()).add(tradEntity.getMealSubAmt()));
        dtAcLinkEntity.setAcSubo(tradEntity.getSubAmt().add(tradEntity.getDaySubAmt()).add(tradEntity.getMealSubAmt()));
        dtAcLinkEntity.setAcEachm(tradReqEntity.getTradType() == 41 ? dtAcLinkEntity.getAcEachm() + 1 : dtAcLinkEntity.getAcEachm());
        dtAcLinkEntity.setAcEacho(tradReqEntity.getTradType() == 41 ? dtAcLinkEntity.getAcEacho() + 1 : dtAcLinkEntity.getAcEacho());
        dtAcLinkEntity.setAcRegm(BigDecimal.valueOf(0));
        dtAcLinkEntity.setAcMake(BigDecimal.valueOf(0));
        dtAcLinkEntity.setAcBlockm(BigDecimal.valueOf(0));
        dtAcLinkEntity.setAcBlocks(BigDecimal.valueOf(0));
        dtAcLinkEntity.setJlCount(dtAcLinkEntity.getJlCount()+1);
        dtAcLinkEntity.setCardHao(tradReqEntity.getCardNo());
        return succMsgData(tradEntity);
    }
}
