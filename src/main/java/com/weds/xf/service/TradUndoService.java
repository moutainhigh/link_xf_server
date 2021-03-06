package com.weds.xf.service;

import com.weds.core.base.BaseService;
import com.weds.core.resp.JsonResult;
import com.weds.xf.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author
 * @Description 撤销
 * @Date 2020-03-05
 */
@Service
public class TradUndoService extends BaseService {

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

    public JsonResult tradUndo(TradReqEntity tradReqEntity) {
        try {
            // 基础数据判断
            JsonResult<TradEntity> jRes = tradCommonService.loadBaseInfo(tradReqEntity);
            if (jRes.getCode() != "600") {
                return jRes;
            }
            TradEntity tradEntity = jRes.getData();

            XfJlYcEntity xfJlYcEntity = xfJlYcService.selectByPrimaryKey(tradReqEntity.getDevSerial());
            if (null == xfJlYcEntity) {
                return failMsg("设备控制表记录不存在!");
            }

            BigDecimal undoSubAmt = xfJlYcEntity.getResDaySub();

            if (undoSubAmt.intValue() > 0) {
                Integer undoSubLx = xfJlYcEntity.getResSubLx();
                if (undoSubLx == 34) {
                    tradEntity.setDaySubAmt(undoSubAmt);
                    jRes = receiveDaySubService.receiveDaySub(tradReqEntity, tradEntity);
                } else if (undoSubLx == 35) {
                    tradEntity.setMealSubAmt(undoSubAmt);
                    jRes = receiveMealSubService.receiveMealSub(tradReqEntity, tradEntity);
                }
                if (jRes.getCode() != "600") {
                    return jRes;
                }
                tradEntity = jRes.getData();

                // 更新累计表
                jRes = xfUserTimeService.updateTradTotal(tradReqEntity, tradEntity);
                if (jRes.getCode() != "600") {
                    return jRes;
                }
                tradEntity = jRes.getData();


                // 更新联机账户表
                jRes = dtAcLinkService.updateByTradEntity(tradReqEntity, tradEntity);
                if (jRes.getCode() != "600") {
                    return jRes;
                }
                tradEntity = jRes.getData();

                // 更新账户表
                jRes = dtAcUserService.updateByTradEntity(tradReqEntity, tradEntity);
                if (jRes.getCode() != "600") {
                    return jRes;
                }
                return succMsg("success");
            }


            // 扣款
            tradReqEntity.setMoney(xfJlYcEntity.getMoreMoney());
            tradEntity.setRealMoney(xfJlYcEntity.getNewMoney());
            tradEntity.setChargeSub(xfJlYcEntity.getSubNew());
            tradEntity.setChargeCash(xfJlYcEntity.getNewMoney().subtract(xfJlYcEntity.getSubNew()));
            jRes = chargeService.charge(tradReqEntity, tradEntity);
            if (jRes.getCode() != "600") {
                return jRes;
            }
            tradEntity = jRes.getData();

            // 更新累计表
            jRes = xfUserTimeService.updateTradTotal(tradReqEntity, tradEntity);
            if (jRes.getCode() != "600") {
                return jRes;
            }
            tradEntity = jRes.getData();


            // 更新联机账户表
            jRes = dtAcLinkService.updateByTradEntity(tradReqEntity, tradEntity);
            if (jRes.getCode() != "600") {
                return jRes;
            }
            tradEntity = jRes.getData();

            // 更新账户表
            jRes = dtAcUserService.updateByTradEntity(tradReqEntity, tradEntity);
            if (jRes.getCode() != "600") {
                return jRes;
            }
            return succMsg("success");

        } catch (Exception ex) {
            return failMsg(ex.getMessage());
        }
    }
}
