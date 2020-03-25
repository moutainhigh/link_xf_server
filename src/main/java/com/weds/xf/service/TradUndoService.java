package com.weds.xf.service;

import com.weds.core.base.BaseService;
import com.weds.core.resp.JsonResult;
import com.weds.xf.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author
 * @Description DtUser管理
 * @Date 2020-03-05
 */
@Service
public class TradUndoService extends BaseService {

    @Autowired
    TradCommonService tradCommonService;
    @Autowired
    XfJlYcService xfJlYcService;

    public JsonResult trad(TradReqEntity tradReqEntity) {
        try {
            // 基础数据判断
            JsonResult<TradEntity> jRes = tradCommonService.loadBaseInfo(tradReqEntity);
            if (jRes.getCode() != "600") {
                return jRes;
            }
            TradEntity tradEntity = jRes.getData();

            xfJlYcService.selectByPrimaryKey(trad)

            // 扣款
            jRes = chargeService.charge(tradReqEntity, tradEntity);
            if (jRes.getCode() != "600") {
                return jRes;
            }
            tradEntity = jRes.getData();

            // 更新累计表
            jRes = xfUserTimeService.updateTradTotal(tradReqEntity,tradEntity);
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
