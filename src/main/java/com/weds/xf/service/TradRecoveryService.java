package com.weds.xf.service;

import com.weds.core.base.BaseService;
import com.weds.core.resp.JsonResult;
import com.weds.xf.entity.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author
 * @Description 冲正
 * @Date 2020-03-05
 */
@Service
public class TradRecoveryService extends BaseService {

    @Autowired
    TradCommonService tradCommonService;
    @Autowired
    XfJlYcService xfJlYcService;
    @Autowired
    ReceiveDaySubService receiveDaySubService;
    @Autowired
    ReceiveMealSubService receiveMealSubService;
    @Autowired
    XfUserTimeService xfUserTimeService;
    @Autowired
    DtAcLinkService dtAcLinkService;
    @Autowired
    DtAcUserService dtAcUserService;
    @Autowired
    ChargeService chargeService;
    @Autowired
    XfJlService xfJlService;

    public JsonResult tradRecovery(TradRecoveryReqEntity tradRecoveryReqEntity) {
        try {
            // 基础数据判断
            TradEntity tradEntity = new TradEntity();
            tradEntity.set
            JsonResult<TradEntity> jRes = tradCommonService.loadBaseInfo(tradRecoveryReqEntity);
            if (jRes.getCode() != "600") {
                return jRes;
            }
            TradEntity tradEntity = jRes.getData();

            XfJlEntity xfJlEntity = xfJlService.selectByDevAndJlBh(tradRecoveryReqEntity.getDevSerial(), tradRecoveryReqEntity.getTradFlow().toString());
            if (null == xfJlEntity) {
                return succMsg("没有要冲正的记录");
            }

            tradRecoveryReqEntity.setTradFlow(Integer.parseInt(xfJlEntity.getJlBh()));

            if (undoSubAmt.intValue() > 0) {
                Integer undoSubLx = xfJlYcEntity.getResSubLx();
                if (undoSubLx == 34) {
                    tradEntity.setDaySubAmt(undoSubAmt);
                    jRes = receiveDaySubService.receiveDaySub(tradRecoveryReqEntity, tradEntity);
                } else if (undoSubLx == 35) {
                    tradEntity.setMealSubAmt(undoSubAmt);
                    jRes = receiveMealSubService.receiveMealSub(tradRecoveryReqEntity, tradEntity);
                }
                if (jRes.getCode() != "600") {
                    return jRes;
                }
                tradEntity = jRes.getData();

                // 更新累计表
                jRes = xfUserTimeService.updateTradTotal(tradRecoveryReqEntity, tradEntity);
                if (jRes.getCode() != "600") {
                    return jRes;
                }
                tradEntity = jRes.getData();


                // 更新联机账户表
                jRes = dtAcLinkService.updateByTradEntity(tradRecoveryReqEntity, tradEntity);
                if (jRes.getCode() != "600") {
                    return jRes;
                }
                tradEntity = jRes.getData();

                // 更新账户表
                jRes = dtAcUserService.updateByTradEntity(tradRecoveryReqEntity, tradEntity);
                if (jRes.getCode() != "600") {
                    return jRes;
                }
                return succMsg("success");
            }


            // 扣款
            tradRecoveryReqEntity.setMoney(xfJlYcEntity.getMoreMoney());
            tradEntity.setRealMoney(xfJlYcEntity.getNewMoney());
            tradEntity.setChargeSub(xfJlYcEntity.getSubNew());
            tradEntity.setChargeCash(xfJlYcEntity.getNewMoney().subtract(xfJlYcEntity.getSubNew()));
            jRes = chargeService.charge(tradRecoveryReqEntity, tradEntity);
            if (jRes.getCode() != "600") {
                return jRes;
            }
            tradEntity = jRes.getData();

            // 更新累计表
            jRes = xfUserTimeService.updateTradTotal(tradRecoveryReqEntity, tradEntity);
            if (jRes.getCode() != "600") {
                return jRes;
            }
            tradEntity = jRes.getData();


            // 更新联机账户表
            jRes = dtAcLinkService.updateByTradEntity(tradRecoveryReqEntity, tradEntity);
            if (jRes.getCode() != "600") {
                return jRes;
            }
            tradEntity = jRes.getData();

            // 更新账户表
            jRes = dtAcUserService.updateByTradEntity(tradRecoveryReqEntity, tradEntity);
            if (jRes.getCode() != "600") {
                return jRes;
            }
            return succMsg("success");

        } catch (Exception ex) {
            return failMsg(ex.getMessage());
        }
    }
}
