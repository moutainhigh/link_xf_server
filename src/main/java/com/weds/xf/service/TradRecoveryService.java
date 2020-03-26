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
            JsonResult<TradEntity> jRes = tradCommonService.loadBaseInfo(tradRecoveryReqEntity);
            if (jRes.getCode() != "600") {
                return jRes;
            }
            TradEntity tradEntity = jRes.getData();

            XfJlEntity xfJlEntity = xfJlService.selectByDevAndJlBh(tradRecoveryReqEntity.getDevSerial(), tradRecoveryReqEntity.getTradFlow().toString());
            if (null == xfJlEntity) {
                return succMsg("没有要冲正的记录");
            }


            // 扣款
            TradReqEntity tradReqEntity = new TradReqEntity();




            tradRecoveryReqEntity.setMoney(tradRecoveryReqEntity.getMoney());
//            tradEntity.setRealMoney();
//            tradEntity.setChargeSub();
//            tradEntity.setChargeCash();
            jRes = chargeService.charge(baseReqEntity, tradEntity);
//            if (jRes.getCode() != "600") {
//                return jRes;
//            }
//            tradEntity = jRes.getData();
//
//            // 更新累计表
//            jRes = xfUserTimeService.updateTradTotal(tradRecoveryReqEntity, tradEntity);
//            if (jRes.getCode() != "600") {
//                return jRes;
//            }
//            tradEntity = jRes.getData();
//
//
//            // 更新联机账户表
//            jRes = dtAcLinkService.updateByTradEntity(tradRecoveryReqEntity, tradEntity);
//            if (jRes.getCode() != "600") {
//                return jRes;
//            }
//            tradEntity = jRes.getData();
//
//            // 更新账户表
//            jRes = dtAcUserService.updateByTradEntity(tradRecoveryReqEntity, tradEntity);
//            if (jRes.getCode() != "600") {
//                return jRes;
//            }
//            return succMsg("success");

        } catch (Exception ex) {
            return failMsg(ex.getMessage());
        }
    }
}
