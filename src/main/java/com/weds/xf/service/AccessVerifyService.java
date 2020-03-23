package com.weds.xf.service;

import com.weds.core.base.BaseService;
import com.weds.core.resp.JsonResult;
import com.weds.xf.entity.*;
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

    public JsonResult<TradEntity> accessVerify(TradReqEntity tradReqEntity, TradEntity tradEntity) {
        String userPassword = tradReqEntity.getUserPassword();
        String dbUserPassword = tradEntity.getDbUserPassword();
        boolean bRes = userPasswordVerify(dbUserPassword, userPassword);
        if (!bRes) {
            return failMsg("密码错误");
        }

        short userType = tradEntity.getUserType();
        bRes = userStateVerify(userType);
        if (!bRes) {
            return failMsg("人员类别错误");
        }

        Long userSerial = tradEntity.getUserSerial();
        String devSerial = tradReqEntity.getDevSerial();
        Integer userDep = tradEntity.getUserDep();
        Integer acDepSerial = tradEntity.getAcDepSerial();
        bRes = acDepVerify(userSerial, devSerial, userDep, acDepSerial);
        if (!bRes) {
            return failMsg("没有场所权限");
        }
        JsonResult<TradEntity> jRes = limitVerify(tradReqEntity,tradEntity);
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

    private boolean acDepVerify(Long userSerial, String devSerial, Integer userDep, Integer acDepSerial) {
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


    private JsonResult<TradEntity> limitVerify(TradReqEntity  tradReqEntity,TradEntity tradEntity) {
        DtAcTypeEntity dtAcTypeEntity = dtAcTypeService.selectByPrimaryKey(tradEntity.getAcType());
        if (null == dtAcTypeEntity) {
            return failMsg("未找到账户类型信息");
        }

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
        Integer mealLimitAmt = xfAcTimeEntity.getTimeMaxM();
        Integer mealLimitTimes = xfAcTimeEntity.getTimeMaxT();
        tradEntity.setMealSubAmt(xfAcTimeEntity.getTimeSub());
        tradEntity.setRate(xfAcTimeEntity.getDiscountRate());
        Integer realMoney = tradReqEntity.getMoney()*tradEntity.getRate()/100;
        tradEntity.setRealMoney(realMoney);

        Integer dayLimitAmt = dtAcTypeEntity.getDayMaxM();
        Integer dayLimitTimes = dtAcTypeEntity.getDayMaxT();
        Integer dayLimitEach = dtAcTypeEntity.getAcTimeeachDay();
        Integer everyLimitAmt = dtAcTypeEntity.getTimeMaxM();
        tradEntity.setDaySubAmt(dtAcTypeEntity.getAcSubsidy());

        XfUserTimeEntity xfUserTimeEntity = xfUserTimeService.selectByPrimaryKey(tradEntity.getUserSerial());
        if (null == xfUserTimeEntity) {
            xfUserTimeEntity = new XfUserTimeEntity();
            xfUserTimeEntity.setUserSerial(tradEntity.getUserSerial());
            xfUserTimeEntity.setRq(new Date());
            xfUserTimeEntity.setDayCount(0);
            xfUserTimeEntity.setDayMoney(0);
            xfUserTimeEntity.setEachDay(0);
            xfUserTimeEntity.setEachHour(0);
            xfUserTimeEntity.setXfEach(0);
            xfUserTimeEntity.setXfCount(0);
            xfUserTimeEntity.setXfMoney(0);
            xfUserTimeEntity.setSubDay(0);
            xfUserTimeEntity.setSubHour(0);
            Integer res = xfUserTimeService.insert(xfUserTimeEntity);
        } else {
            String timeNo = xfUserTimeEntity.getTimeNo();

            if(!tradEntity.getTimeNo().equals(timeNo)){
                xfUserTimeEntity.setTimeNo(tradEntity.getTimeNo());
                xfUserTimeEntity.setTimeXh(xfAcTimeXh);
                xfUserTimeEntity.setTimeKs(tradEntity.getTimeBegin());
                xfUserTimeEntity.setTimeJs(tradEntity.getTimeEnd());
                xfUserTimeEntity.setSubHour(0);
                xfUserTimeEntity.setXfCount(0);
                xfUserTimeEntity.setXfMoney(0);
                xfUserTimeEntity.setXfCount(0);
                xfUserTimeEntity.setXfEach(0);
                Integer iRes = xfUserTimeService.updateByPrimaryKey(xfUserTimeEntity);
            }
            Integer dayTimes = xfUserTimeEntity.getDayCount();
            Integer dayAmt = xfUserTimeEntity.getDayMoney();
            Integer dayEach = xfUserTimeEntity.getEachDay();
            Integer mealTimes = xfUserTimeEntity.getXfCount();
            Integer mealAmt = xfUserTimeEntity.getXfMoney();
            tradEntity.setAlreadyDaySub(xfUserTimeEntity.getSubDay());
            tradEntity.setAlreadyMealSub(xfUserTimeEntity.getSubHour());
            tradEntity.setAlreadyDayEach(xfUserTimeEntity.getEachDay());
            tradEntity.setAlreadyMealEach(xfUserTimeEntity.getEachHour());
            if ((dayLimitTimes > 0) && (dayTimes+1 > dayLimitTimes)){
                return failMsg("超日限次");
            }
            if(everyLimitAmt > 0 && realMoney > everyLimitAmt){
                return failMsg("超单次限额");
            }

            if ((tradReqEntity.getTradType() == 1) && (dayLimitAmt > 0) && (dayAmt+realMoney > dayLimitAmt)){
                return failMsg("超日限额");
            }else if ((tradReqEntity.getTradType() == 41)&&(dayLimitEach > 0) && (dayEach+1 > dayLimitEach)){
                return failMsg("超日限额");
            }

            if ((tradReqEntity.getTradType() == 1) && (mealLimitAmt > 0) && (mealAmt+realMoney > mealLimitAmt)){
                return failMsg("超餐限额");
            }else if ((tradReqEntity.getTradType() == 41)&&(mealLimitTimes > 0) && (mealTimes+1 > mealLimitTimes)){
                return failMsg("超餐限额");
            }
        }
        return succMsgData(tradEntity);
    }



}
