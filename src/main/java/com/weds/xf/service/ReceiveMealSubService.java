package com.weds.xf.service;

import com.weds.core.base.BaseService;
import com.weds.core.resp.JsonResult;
import com.weds.xf.entity.TradEntity;
import com.weds.xf.entity.TradReqEntity;
import com.weds.xf.entity.XfJlEntity;
import com.weds.xf.entity.XfMxEntity;
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
public class ReceiveMealSubService extends BaseService {
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

    public JsonResult<TradEntity> receiveMealSub(TradReqEntity tradReqEntity, TradEntity tradEntity) throws Exception{
        if (tradReqEntity.getTradType() == 1 && tradEntity.getMealSubAmt().intValue() <= 0) {
            return succMsg("success");
        } else if (tradReqEntity.getTradType() == 41 && tradEntity.getMealSubEach().intValue() <= 0) {
            return succMsg("success");
        }

        JsonResult<XfJlEntity> jRes = insertMealSub2Jl(tradReqEntity, tradEntity);
        if (jRes.getCode() != "600") {
            return failMsg("餐补插入流水失败");
        }
        XfJlEntity xfJlEntity = jRes.getData();
        return insertMealSub2Mx(tradEntity,xfJlEntity);
    }


    private JsonResult<XfJlEntity> insertMealSub2Jl(TradReqEntity tradReqEntity, TradEntity tradEntity) {
        XfJlEntity xfJlEntity = new XfJlEntity();
        if (tradReqEntity.getTradType() == 1) {
            xfJlEntity.setMould(0);
            xfJlEntity.setSubOld(tradEntity.getSubAmt());
            xfJlEntity.setSubNew(tradEntity.getMealSubAmt());
            xfJlEntity.setNewMoney(tradEntity.getMealSubAmt());
            xfJlEntity.setEachOld(0);
            xfJlEntity.setEachNew(0);
        } else {
            xfJlEntity.setMould(1);
            xfJlEntity.setSubOld(BigDecimal.valueOf(0));
            xfJlEntity.setSubNew(BigDecimal.valueOf(0));
            xfJlEntity.setNewMoney(BigDecimal.valueOf(0));
            xfJlEntity.setEachOld(tradEntity.getEach());
            xfJlEntity.setEachNew(tradEntity.getDaySubEach());
        }

        xfJlEntity.setUserSerial(tradEntity.getUserSerial());
        xfJlEntity.setLx(4);
        xfJlEntity.setJlBh("0000000000");
        xfJlEntity.setDevSerial(tradReqEntity.getDevSerial());
        xfJlEntity.setUserCard(tradReqEntity.getCardNo());
        xfJlEntity.setSamSerial("0");
        xfJlEntity.setOldMoney(tradEntity.getCashAmt().add(tradEntity.getSubAmt()));
        xfJlEntity.setMoreMoney(BigDecimal.valueOf(0));
        xfJlEntity.setJlSj(new Date());
        tradEntity.setJlCount(tradEntity.getJlCount() + 1);
        xfJlEntity.setJlCount(tradEntity.getJlCount());
        xfJlEntity.setSubXh(0);
        xfJlEntity.setSj(new Date());
        xfJlEntity.setCardSerial(tradEntity.getCardSerial());
        xfJlEntity.setType(4);
        xfJlEntity.setState(0);
        xfJlEntity.setTimeNo("0000000000000000");
        xfJlEntity.setTimeOrder("0000000000000000");
        xfJlEntity.setDelType(tradEntity.getChargeType());
        xfJlEntity.setEachUnit(BigDecimal.valueOf(0));
        xfJlEntity.setDiscountRate(100);
        xfJlEntity.setDepSerial(tradEntity.getUserDep());
        xfJlEntity.setAcdepSerial(tradEntity.getAcDepSerial());
        xfJlEntity.setCorMoney(BigDecimal.valueOf(0));
        xfJlEntity.setCorSub(BigDecimal.valueOf(0));
        xfJlService.insert(xfJlEntity);
        return succMsgData(xfJlEntity);
    }

    private JsonResult<TradEntity> insertMealSub2Mx(TradEntity tradEntity, XfJlEntity xfJlEntity) {
        XfMxEntity xfMxEntity = new XfMxEntity();
        xfMxEntity.setMould(xfJlEntity.getMould());
        xfMxEntity.setUserSerial(xfJlEntity.getUserSerial());
        xfMxEntity.setLx(xfJlEntity.getLx());
        xfMxEntity.setJlBh(xfJlEntity.getJlBh());
        xfMxEntity.setDevSerial(xfJlEntity.getDevSerial());
        xfMxEntity.setUserCard(xfJlEntity.getUserCard());
        xfMxEntity.setOldMoney(xfJlEntity.getOldMoney());
        xfMxEntity.setMoreMoney(xfJlEntity.getMoreMoney());
        xfMxEntity.setNewSub(xfJlEntity.getSubNew());
        xfMxEntity.setSaveMoney(xfMxEntity.getOldMoney().add(xfMxEntity.getNewSub()));
        xfMxEntity.setMoneyCount(0);
        xfMxEntity.setJlSj(xfJlEntity.getJlSj());
        xfMxEntity.setJlCount(xfJlEntity.getJlCount());
        xfMxEntity.setSj(xfJlEntity.getSj());
        xfMxEntity.setCardSerial(xfJlEntity.getCardSerial());
        xfMxEntity.setType(xfJlEntity.getType());
        xfMxEntity.setTimeNo(xfJlEntity.getTimeNo());
        xfMxEntity.setEachUnit(xfJlEntity.getEachUnit());
        xfMxEntity.setDiscountRate(xfJlEntity.getDiscountRate());
        xfMxEntity.setDepSerial(xfJlEntity.getDepSerial());
        xfMxEntity.setAcdepSerial(xfJlEntity.getAcdepSerial());
        xfMxEntity.setCorMoney(xfJlEntity.getCorMoney());
        xfMxEntity.setCorSub(xfJlEntity.getCorSub());
        xfMxEntity.setNewMoney(xfJlEntity.getNewMoney());
        xfMxEntity.setSubCount(1);
        xfMxEntity.setAddCount(0);
        xfMxEntity.setNewDel(BigDecimal.valueOf(0));
        xfMxEntity.setDelCount(0);
        xfMxEntity.setNewZero(BigDecimal.valueOf(0));
        xfMxEntity.setDelZero(BigDecimal.valueOf(0));
        xfMxEntity.setNewEdit(BigDecimal.valueOf(0));
        xfMxEntity.setDelEdit(BigDecimal.valueOf(0));
        xfMxEntity.setDevTimeNo(xfJlEntity.getTimeNo());
        xfMxEntity.setRateMoney(BigDecimal.valueOf(0));
        xfMxEntity.setOldAdd(tradEntity.getCashAmt());
        xfMxEntity.setOldSub(tradEntity.getSubAmt());
        xfMxEntity.setSaveAdd(tradEntity.getCashAmt());
        xfMxEntity.setSaveSub(tradEntity.getSubAmt().add(tradEntity.getMealSubAmt()));
        xfMxEntity.setXfAdd(tradEntity.getChargeCash());
        xfMxEntity.setXfSub(tradEntity.getChargeSub());
        xfMxEntity.setAddType(0);
        xfMxService.insert(xfMxEntity);
        return succMsgData(tradEntity);
    }

}
