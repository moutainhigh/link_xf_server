package com.weds.xf.service;

import com.weds.core.base.BaseService;
import com.weds.core.resp.JsonResult;
import com.weds.web.comm.entity.CommProcEntity;
import com.weds.web.comm.service.CommProcService;
import com.weds.xf.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author
 * @Description DtUser管理
 * @Date 2020-03-05
 */
@Service
public class TradService extends BaseService {

    @Autowired
    AccessVerifyService accessVerifyService;
    @Autowired
    ChargeService chargeService;
    @Autowired
    DtAcLinkService dtAcLinkService;
    @Autowired
    DtAcUserService dtAcUserService;
    @Autowired
    DtCardService dtCardService;
    @Autowired
    DtDevService dtDevService;
    @Autowired
    DtUserService dtUserService;
    @Autowired
    BalanceVerifyService balanceVerifyService;
    @Autowired
    StDeviceService stDeviceService;
    @Autowired
    ReceiveDaySubService receiveDaySub;
    @Autowired
    ReceiveMealSubService receiveMealSubService;
    @Autowired
    XfJlYcService xfJlYcService;
    @Autowired
    XfUserTimeService xfUserTimeService;
    @Autowired
    TradCommonService tradCommonService;

    public JsonResult trad(TradReqEntity tradReqEntity) {
        try {
            // 基础数据判断
            JsonResult<TradEntity> jRes = tradCommonService.loadBaseInfo(tradReqEntity);
            if (jRes.getCode() != "600") {
                return jRes;
            }
            TradEntity tradEntity = jRes.getData();

            // 权限判断
            jRes = accessVerifyService.accessVerify(tradReqEntity, tradEntity);
            if (jRes.getCode() != "600") {
                return jRes;
            }
            tradEntity = jRes.getData();

            // 余额判断
            jRes = balanceVerifyService.balanceVerify(tradReqEntity, tradEntity);
            if (jRes.getCode() != "600") {
                return jRes;
            }
            tradEntity = jRes.getData();

            // 日补贴
            jRes = receiveDaySub.receiveDaySub(tradReqEntity, tradEntity);
            if (jRes.getCode() != "600") {
                return jRes;
            }
            tradEntity = jRes.getData();

            // 餐补贴
            jRes = receiveMealSubService.receiveMealSub(tradReqEntity, tradEntity);
            if (jRes.getCode() != "600") {
                return jRes;
            }
            tradEntity = jRes.getData();

            // 扣款
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

            // 更新设备控制表
            jRes = xfJlYcService.updateDevControl(tradReqEntity, tradEntity);
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
