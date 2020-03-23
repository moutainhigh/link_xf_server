package com.weds.xf.service;

import com.weds.core.base.BaseService;
import com.weds.core.resp.JsonResult;
import com.weds.xf.entity.TradEntity;
import com.weds.xf.entity.TradReqEntity;
import com.weds.xf.entity.XfJlEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author
 * @Description 领取日补
 * @Date 2020-03-05
 */
@Service
public class ReceiveDaySubService extends BaseService {
    @Autowired
    XfJlService xfJlService;
    @Autowired
    XfMxService xfMxService;
    @Autowired
    DtAcLinkService dtAcLinkService;
    @Autowired
    DtAcUserService dtAcUserService;
    @Autowired
    XfUserTimeService xfUserTimeService;

    public JsonResult<TradEntity> receiveDaySub(TradReqEntity tradReqEntity, TradEntity tradEntity) {
        if(tradReqEntity.getTradType() == 1){
            return receiveDaySubAmt(tradReqEntity,tradEntity);
        }else if(tradReqEntity.getTradType() == 41){
            return receiveDaySubEach(tradReqEntity,tradEntity);
        }
    }

    public JsonResult<TradEntity> receiveDaySubAmt(TradReqEntity tradReqEntity, TradEntity tradEntity) {
        if (tradEntity.getDaySubAmt().intValue() <= 0) {
            return succMsgData(tradEntity);
        }
        XfJlEntity xfJlEntity = xfJlService.selectMaxByUser(tradEntity.getUserSerial());
        xfJlEntity.setUserSerial(tradEntity.getUserSerial());
        xfJlEntity.setLx(4);
        xfJlEntity.setJlBh("0000000000");
        xfJlEntity.setDevSerial(tradReqEntity.getDevSerial());
        xfJlEntity.setUserCard(tradReqEntity.getCardNo());
        xfJlEntity.setSamSerial("0");
        xfJlEntity.setOldMoney(tradEntity.getCashAmt().add(tradEntity.getSubAmt()));
        xfJlEntity.setNewMoney(tradEntity.getDaySubAmt());
        xfJlEntity.setJlSj(new Date());
        xfJlEntity.setJlCount(tradEntity.getJlCount()+1);
        xfJlEntity.setSubXh(0);
        xfJlEntity.setSj(new Date());
        xfJlEntity.setCardSerial(tradEntity.getCardSerial());
        xfJlEntity.setType(4);
        xfJlEntity.setState(0);
        xfJlEntity.setTimeNo("0000000000000000");
        xfJlEntity.setTimeOrder("0000000000000000");
        xfJlEntity.setDelType(tradEntity.getChargeType());
        xfJlEntity.setSubOld(tradEntity.getSubAmt());
        xfJlEntity.setSubNew(tradEntity.getDaySubAmt());
        xfJlEntity.set
    }

    public JsonResult<TradEntity> receiveDaySubEach(TradReqEntity tradReqEntity, TradEntity tradEntity) {
        if (tradEntity.getDaySubEach().intValue() <= 0) {
            return succMsgData(tradEntity);
        }
        XfJlEntity xfJlEntity = new XfJlEntity();
        xfJlEntity.setUserSerial(tradEntity.getUserSerial());
        xfJlEntity.setLx(4);
        xfJlEntity.setJlBh("0000000000");
        xfJlEntity.setDevSerial(tradReqEntity.getDevSerial());
        xfJlEntity.setUserCard(tradReqEntity.getCardNo());
        xfJlEntity.setSamSerial("0");
        xfJlEntity.setOldMoney(tradEntity.getCashAmt().add(tradEntity.getSubAmt()));
        xfJlEntity.setNewMoney(tradEntity.getDaySubAmt());
        xfJlEntity.setJlSj(new Date());
        xfJlEntity.setJlCount(tradEntity.getJlCount()+1);
        xfJlEntity.setSubXh(0);
        xfJlEntity.setSj(new Date());
        xfJlEntity.setCardSerial(tradEntity.getCardSerial());
        xfJlEntity.setType(4);
        xfJlEntity.setState(0);
        xfJlEntity.setTimeNo("0000000000000000");
        xfJlEntity.setTimeOrder("0000000000000000");
        xfJlEntity.setDelType(tradEntity.getChargeType());
        xfJlEntity.setSubOld(tradEntity.getSubAmt());
        xfJlEntity.setSubNew(tradEntity.getDaySubAmt());
        xfJlEntity.set
    }
}
