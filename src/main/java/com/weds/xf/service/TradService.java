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

    public JsonResult trad(TradReqEntity tradReqEntity) {
        Long userSerial = tradReqEntity.getUserSerial();
        TradEntity tradEntity = new TradEntity();
        if (userSerial == 0 || userSerial == null) {
            DtCardEntity dtCardEntity = dtCardService.selectByCardHao(tradReqEntity.getCardNo());
            if (null != dtCardEntity) {
                userSerial = dtCardEntity.getUserSerial();
                tradEntity.setUserSerial(userSerial);
                tradEntity.setCardType(dtCardEntity.getCardType());
                tradEntity.setCardSerial(dtCardEntity.getCardSerial());
                DtUserEntity dtUserEntity = dtUserService.selectByPrimaryKey(userSerial);
                if (null != dtUserEntity) {
                    tradEntity.setUserType(dtUserEntity.getUserType());
                    tradEntity.setDbUserPassword(dtUserEntity.getUserPassword());
                    tradEntity.setUserDep(dtUserEntity.getUserDep());
                } else {
                    return failMsg("人员信息不存在");
                }

                DtAcUserEntity dtAcUserEntity = dtAcUserService.selectByPrimaryKey(userSerial);
                if (null == dtAcUserEntity) {
                    return failMsg("账户信息不存在");
                }
                tradEntity.setAcType(dtAcUserEntity.getAcType());

                DtAcLinkEntity dtAcLinkEntity = dtAcLinkService.selectByPrimaryKey(userSerial);
                if (null == dtAcLinkEntity) {
                    return failMsg("联机账户信息不存在");
                }
                tradEntity.setCashAmt(dtAcLinkEntity.getAcAddo());
                tradEntity.setSubAmt(dtAcLinkEntity.getAcSubo());
                tradEntity.setJlCount(dtAcLinkEntity.getJlCount());


                DtDevEntity dtDevEntity = dtDevService.selectByDevSerial(tradReqEntity.getDevSerial());
                if (null == dtDevEntity) {
                    return failMsg("场所未找到");
                }
                tradEntity.setAcDepSerial(dtDevEntity.getAcdepSerial());


            } else {
                return failMsg("卡信息不存在");
            }
        }
        // 权限判断
        JsonResult<TradEntity> jRes = accessVerifyService.accessVerify(tradReqEntity, tradEntity);
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

    }

}
