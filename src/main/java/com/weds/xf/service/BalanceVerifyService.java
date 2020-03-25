package com.weds.xf.service;

import com.weds.core.base.BaseService;
import com.weds.core.resp.JsonResult;
import com.weds.xf.entity.*;
import org.apache.ibatis.annotations.Case;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author
 * @Description 权限判断
 * @Date 2020-03-05
 */
@Service
public class BalanceVerifyService extends BaseService {

    public JsonResult<TradEntity> balanceVerify(TradReqEntity tradReqEntity, TradEntity tradEntity) {
        if (tradReqEntity.getTradType() == 1) {
            BigDecimal totalSubAmt = tradEntity.getSubAmt().add(tradEntity.getDaySubAmt()).add(tradEntity.getMealSubAmt());
            BigDecimal totalAmt = tradEntity.getCashAmt().add(totalSubAmt);


            if (tradEntity.getChargeType() == 0) {            // 先扣补贴
                if (totalAmt.intValue() < tradEntity.getRealMoney().intValue()) {
                    return failMsg("余额不足");
                }
                if (totalSubAmt.intValue() > tradEntity.getRealMoney().intValue()) {
                    tradEntity.setChargeSub(tradEntity.getRealMoney());
                    tradEntity.setChargeCash(BigDecimal.valueOf(0));
                } else {
                    tradEntity.setChargeSub(totalSubAmt);
                    tradEntity.setChargeCash(tradEntity.getRealMoney().subtract(totalSubAmt));
                }

            } else if (tradEntity.getChargeType() == 1) {    // 只扣补贴
                if (totalSubAmt.intValue() < tradEntity.getRealMoney().intValue()) {
                    return failMsg("余额不足");
                } else {
                    tradEntity.setChargeSub(tradEntity.getRealMoney());
                    tradEntity.setChargeCash(BigDecimal.valueOf(0));
                }
            } else if (tradEntity.getChargeType() == 2) {     // 只扣现金
                if (tradEntity.getCashAmt().intValue() < tradEntity.getRealMoney().intValue()) {
                    return failMsg("余额不足");
                } else {
                    tradEntity.setChargeSub(BigDecimal.valueOf(0));
                    tradEntity.setChargeCash(tradEntity.getRealMoney());
                }
            } else if (tradEntity.getChargeType() == 3) {     // 先扣现金
                if (totalAmt.intValue() < tradEntity.getRealMoney().intValue()) {
                    return failMsg("余额不足");
                }
                if (tradEntity.getCashAmt().intValue() > tradEntity.getRealMoney().intValue()) {
                    tradEntity.setChargeSub(BigDecimal.valueOf(0));
                    tradEntity.setChargeCash(tradEntity.getRealMoney());
                } else {
                    tradEntity.setChargeSub(tradEntity.getRealMoney().subtract(tradEntity.getCashAmt()));
                    tradEntity.setChargeCash(tradEntity.getCashAmt());
                }
            }
        } else if (tradReqEntity.getTradType() == 41) {
            if (tradEntity.getEach() <= 0) {
                return failMsg("余额不足");
            }
        }
        return succMsgData(tradEntity);
    }

}
