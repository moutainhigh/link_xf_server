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
public class TradCommonService extends BaseService {

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
    StDeviceService stDeviceService;

    public JsonResult<TradEntity> loadBaseInfo(BaseReqEntity terminalBaseReqEntity) throws Exception {
        Long userSerial = terminalBaseReqEntity.getUserSerial();
        TradEntity tradEntity = new TradEntity();
        if (userSerial == 0 || userSerial == null) {
            DtCardEntity dtCardEntity = dtCardService.selectByCardHao(terminalBaseReqEntity.getCardNo());
            if (null != dtCardEntity) {
                userSerial = dtCardEntity.getUserSerial();
                tradEntity.setUserSerial(userSerial);
                tradEntity.setCardType(dtCardEntity.getCardType());
                tradEntity.setCardSerial(dtCardEntity.getCardSerial());
            } else {
                return failMsg("卡信息不存在");
            }
        }

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

        StDeviceEntity stDeviceEntity = stDeviceService.selectByPrimaryKey(tradReqEntity.getDevSerial());
        if (null == stDeviceEntity) {
            return failMsg("设备不存在");
        }
        Integer enableSub = stDeviceEntity.getSubType() == 1 ? 0 : 1;
        tradEntity.setEnableSub(enableSub);
        tradEntity.setCardType(stDeviceEntity.getPayType());

        return succMsgData(tradEntity);
    }
}
