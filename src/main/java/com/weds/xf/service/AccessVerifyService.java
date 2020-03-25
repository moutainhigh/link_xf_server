package com.weds.xf.service;

import com.weds.core.base.BaseService;
import com.weds.core.resp.JsonResult;
import com.weds.xf.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author
 * @Description 权限判断
 * @Date 2020-03-05
 */
@Service
public class AccessVerifyService extends BaseService {

    @Autowired
    DtAcDepUserService dtAcDepUserService;
    @Autowired
    DtAcTypeService dtAcTypeService;
    @Autowired
    OnlineXfAcDepService onlineXfAcDepService;
    @Autowired
    XfAcTimeService xfAcTimeService;
    @Autowired
    XfTimeService xfTimeService;
    @Autowired
    XfUserTimeService xfUserTimeService;

    public JsonResult<TradEntity> accessVerify(TradReqEntity tradReqEntity, TradEntity tradEntity) throws Exception{
        String userPassword = tradReqEntity.getUserPassword();
        String dbUserPassword = tradEntity.getDbUserPassword();
        boolean bRes = userPasswordVerify(dbUserPassword, userPassword);
        if (!bRes) {
            return failMsg("密码错误");
        }

        short userType = tradEntity.getUserType();
        bRes = userStateVerify(userType);
        if (!bRes) {
            return failMsg("人员状态错误");
        }

        Integer cardType = tradEntity.getCardType();
        bRes = cardStateVerify(cardType);
        if (!bRes) {
            return failMsg("卡状态错误");
        }

        Long userSerial = tradEntity.getUserSerial();
        String devSerial = tradReqEntity.getDevSerial();
        Integer userDep = tradEntity.getUserDep();
        Long acDepSerial = tradEntity.getAcDepSerial();
        bRes = acDepVerify(userSerial, devSerial, userDep, acDepSerial);
        if (!bRes) {
            return failMsg("没有场所权限");
        }
        JsonResult<TradEntity> jRes = limitVerify(tradReqEntity, tradEntity);
        return jRes;
    }

    private boolean userPasswordVerify(String dbUserPassword, String userPassword) {
        if (!userPassword.equals("")) {
            return userPassword.equals(dbUserPassword);
        }
        return true;
    }

    private boolean userStateVerify(Short userType) {
        return userType > 50 ? false : true;
    }

    private boolean cardStateVerify(Integer cardType) {
        return cardType == 0 ? true : false;
    }

    private boolean acDepVerify(Long userSerial, String devSerial, Integer userDep, Long acDepSerial) {
        DtAcDepUserEntity dtAcDepUserEntity = dtAcDepUserService.selectByPrimaryKey(userSerial, devSerial);
        if (null != dtAcDepUserEntity) {
            return true;
        }

        OnlineXfAcDepEntity onlineXfAcDepEntity = onlineXfAcDepService.selectByPrimaryKey(userDep, acDepSerial);
        if (null != onlineXfAcDepEntity) {
            return true;
        }
        return false;
    }


    private JsonResult<TradEntity> limitVerify(TradReqEntity tradReqEntity, TradEntity tradEntity) {
        DtAcTypeEntity dtAcTypeEntity = dtAcTypeService.selectByPrimaryKey(tradEntity.getAcType());
        if (null == dtAcTypeEntity) {
            return failMsg("未找到账户类型信息");
        }
        BigDecimal daySubAmt = tradEntity.getEnableSub() == 1 ? dtAcTypeEntity.getAcTimeDay() : BigDecimal.valueOf(0);
        tradEntity.setDaySubAmt(daySubAmt);

        XfTimeEntity xfTimeEntity = xfTimeService.selectByNowTime();
        if (null == xfTimeEntity) {
            tradEntity.setIsInTime(0);
            // 是否允许时段外消费
            Integer acTimeState = dtAcTypeEntity.getAcTimeState();
            if (acTimeState == 0) {
                return failMsg("非消费时段");
            }
            // 非时段编号
            tradEntity.setTimeNo("0000000000000000");
            tradEntity.setRate(Integer.parseInt(dtAcTypeEntity.getDiscountRate()));
        } else {
            tradEntity.setTimeBegin(xfTimeEntity.getKssj());
            tradEntity.setTimeEnd(xfTimeEntity.getJssj());
            tradEntity.setIsInTime(1);
            tradEntity.setTimeNo(xfTimeEntity.getBh());
        }

        XfAcTimeEntity xfAcTimeEntity = xfAcTimeService.selectByAcDepAndTimeNo(tradEntity.getAcDepSerial(), tradEntity.getTimeNo());
        if (null == xfAcTimeEntity) {
            return failMsg("未找到场所时段信息");
        }
        xfAcTimeEntity = xfAcTimeService.selectByAcTypeAndTimeNo(tradEntity.getAcType(), tradEntity.getTimeNo());
        if (null == xfAcTimeEntity) {
            return failMsg("未找到账户时段信息");
        }
        Integer xfAcTimeXh = xfAcTimeEntity.getXh();
        BigDecimal mealLimitAmt = xfAcTimeEntity.getTimeMaxM();
        Integer mealLimitTimes = xfAcTimeEntity.getTimeMaxT();

        BigDecimal realMoney = tradReqEntity.getMoney().multiply(BigDecimal.valueOf(tradEntity.getRate()).divide(BigDecimal.valueOf(100));
        tradEntity.setRealMoney(realMoney);
        tradEntity.setXfAcTimeXh(xfAcTimeXh);

        BigDecimal mealSubAmt = xfAcTimeEntity.getTimeSub();
        if (tradEntity.getEnableSub() == 1) {
            if (tradEntity.getEnableFreeMealSub() == 1) {
                if (mealSubAmt.intValue() > 0) {
                    mealSubAmt = realMoney.intValue() > mealSubAmt.intValue() ? mealSubAmt : realMoney;
                }
            }
        } else {
            mealSubAmt = BigDecimal.valueOf(0);
        }

        tradEntity.setMealSubAmt(mealSubAmt);
        tradEntity.setMealSubEach(xfAcTimeEntity.getTimeEachsub());
        tradEntity.setRate(xfAcTimeEntity.getDiscountRate());


        BigDecimal dayLimitAmt = dtAcTypeEntity.getDayMaxM();
        Integer dayLimitTimes = dtAcTypeEntity.getDayMaxT();
        Integer dayLimitEach = dtAcTypeEntity.getAcTimeeachDay();
        BigDecimal everyLimitAmt = dtAcTypeEntity.getTimeMaxM();
        tradEntity.setDaySubAmt(dtAcTypeEntity.getAcSubsidy());

        XfUserTimeEntity xfUserTimeEntity = xfUserTimeService.selectByPrimaryKey(tradEntity.getUserSerial());
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String curDate = dateFormat.format(date);
        if (null != xfUserTimeEntity
                && xfUserTimeEntity.getRq().toString().equals(curDate)
                && xfUserTimeEntity.getTimeNo().equals(tradEntity.getTimeNo())) {

            Integer dayTimes = xfUserTimeEntity.getDayCount();
            BigDecimal dayAmt = xfUserTimeEntity.getDayMoney();
            Integer dayEach = xfUserTimeEntity.getEachDay();
            Integer mealTimes = xfUserTimeEntity.getXfCount();
            BigDecimal mealAmt = xfUserTimeEntity.getXfMoney();
            if (xfUserTimeEntity.getSubDay() == 1) {
                tradEntity.setDaySubAmt(BigDecimal.valueOf(0));
            }
            if (xfUserTimeEntity.getEachDay() == 1) {
                tradEntity.setDaySubEach(0);
            }
            if (xfUserTimeEntity.getSubHour() == 1) {
                tradEntity.setMealSubAmt(BigDecimal.valueOf(0));
            }
            if (xfUserTimeEntity.getEachHour() == 1) {
                tradEntity.setMealSubEach(0);
            }

            if ((dayLimitTimes > 0) && (dayTimes + 1 > dayLimitTimes)) {
                return failMsg("超日限次");
            }
            if (everyLimitAmt.intValue() > 0 && realMoney.intValue() > everyLimitAmt.intValue()) {
                return failMsg("超单次限额");
            }

            if ((tradReqEntity.getTradType() == 1) && (dayLimitAmt.intValue() > 0) && (dayAmt.add(realMoney).intValue() > dayLimitAmt.intValue())) {
                return failMsg("超日限额");
            } else if ((tradReqEntity.getTradType() == 41) && (dayLimitEach > 0) && (dayEach + 1 > dayLimitEach)) {
                return failMsg("超日限额");
            }

            if ((tradReqEntity.getTradType() == 1) && (mealLimitAmt.intValue() > 0) && (mealAmt.add(realMoney).intValue() > mealLimitAmt.intValue())) {
                return failMsg("超餐限额");
            } else if ((tradReqEntity.getTradType() == 41) && (mealLimitTimes > 0) && (mealTimes + 1 > mealLimitTimes)) {
                return failMsg("超餐限额");
            }
        }
        return succMsgData(tradEntity);
    }


}
