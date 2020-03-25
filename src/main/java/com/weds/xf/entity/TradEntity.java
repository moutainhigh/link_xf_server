package com.weds.xf.entity;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class TradEntity implements Serializable {
    public Integer getXfAcTimeXh() {
        return xfAcTimeXh;
    }

    public void setXfAcTimeXh(Integer xfAcTimeXh) {
        this.xfAcTimeXh = xfAcTimeXh;
    }

    public Integer getEnableFreeMealSub() {
        return enableFreeMealSub;
    }

    public void setEnableFreeMealSub(Integer enableFreeMealSub) {
        this.enableFreeMealSub = enableFreeMealSub;
    }

    public Integer getEnableSub() {
        return enableSub;
    }

    public void setEnableSub(Integer enableSub) {
        this.enableSub = enableSub;
    }


    public Integer getMealSubEach() {
        return mealSubEach;
    }

    public void setMealSubEach(Integer mealSubEach) {
        this.mealSubEach = mealSubEach;
    }

    public Integer getDaySubEach() {
        return daySubEach;
    }

    public void setDaySubEach(Integer daySubEach) {
        this.daySubEach = daySubEach;
    }
    public String getCardSerial() {
        return cardSerial;
    }

    public void setCardSerial(String cardSerial) {
        this.cardSerial = cardSerial;
    }

    public Integer getJlCount() {
        return jlCount;
    }

    public void setJlCount(Integer jlCount) {
        this.jlCount = jlCount;
    }

    public Integer getEach() {
        return each;
    }

    public void setEach(Integer each) {
        this.each = each;
    }

    public BigDecimal getChargeCash() {
        return chargeCash;
    }

    public void setChargeCash(BigDecimal chargeCash) {
        this.chargeCash = chargeCash;
    }

    public BigDecimal getChargeSub() {
        return chargeSub;
    }

    public void setChargeSub(BigDecimal chargeSub) {
        this.chargeSub = chargeSub;
    }


    public BigDecimal getCashAmt() {
        return cashAmt;
    }

    public void setCashAmt(BigDecimal cashAmt) {
        this.cashAmt = cashAmt;
    }

    public BigDecimal getSubAmt() {
        return subAmt;
    }

    public void setSubAmt(BigDecimal subAmt) {
        this.subAmt = subAmt;
    }

    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(Integer timeBegin) {
        this.timeBegin = timeBegin;
    }

    public Integer getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Integer timeEnd) {
        this.timeEnd = timeEnd;
    }


    public Integer getAlreadyDaySub() {
        return alreadyDaySub;
    }

    public void setAlreadyDaySub(Integer alreadyDaySub) {
        this.alreadyDaySub = alreadyDaySub;
    }

    public Integer getAlreadyMealSub() {
        return alreadyMealSub;
    }

    public void setAlreadyMealSub(Integer alreadyMealSub) {
        this.alreadyMealSub = alreadyMealSub;
    }

    public String getDbUserPassword() {
        return dbUserPassword;
    }

    public void setDbUserPassword(String dbUserPassword) {
        this.dbUserPassword = dbUserPassword;
    }

    public Long getUserSerial() {
        return userSerial;
    }

    public void setUserSerial(Long userSerial) {
        this.userSerial = userSerial;
    }

    public Short getUserType() {
        return userType;
    }

    public void setUserType(Short userType) {
        this.userType = userType;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public Integer getUserDep() {
        return userDep;
    }

    public void setUserDep(Integer userDep) {
        this.userDep = userDep;
    }

    public List<String> getDbListAcdepSerial() {
        return dbListAcdepSerial;
    }

    public void setDbListAcdepSerial(List<String> dbListAcdepSerial) {
        this.dbListAcdepSerial = dbListAcdepSerial;
    }

    public Long getAcDepSerial() {
        return acDepSerial;
    }

    public void setAcDepSerial(Long acDepSerial) {
        this.acDepSerial = acDepSerial;
    }

    public String getAcType() {
        return acType;
    }

    public void setAcType(String acType) {
        this.acType = acType;
    }

    public String getTimeNo() {
        return timeNo;
    }

    public void setTimeNo(String timeNo) {
        this.timeNo = timeNo;
    }

//    public Integer getEnableOutTimeXf() {
//        return enableOutTimeXf;
//    }
//
//    public void setEnableOutTimeXf(Integer enableOutTimeXf) {
//        this.enableOutTimeXf = enableOutTimeXf;
//    }

    public BigDecimal getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(BigDecimal realMoney) {
        this.realMoney = realMoney;
    }


    public Integer getIsInTime() {
        return isInTime;
    }

    public void setIsInTime(Integer isInTime) {
        this.isInTime = isInTime;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getAcTimeOffset() {
        return acTimeOffset;
    }

    public void setAcTimeOffset(Integer acTimeOffset) {
        this.acTimeOffset = acTimeOffset;
    }

    public Integer getEnableUserPassword() {
        return enableUserPassword;
    }

    public void setEnableUserPassword(Integer enableUserPassword) {
        this.enableUserPassword = enableUserPassword;
    }


    public BigDecimal getDaySubAmt() {
        return daySubAmt;
    }

    public void setDaySubAmt(BigDecimal daySubAmt) {
        this.daySubAmt = daySubAmt;
    }

    public BigDecimal getMealSubAmt() {
        return mealSubAmt;
    }

    public void setMealSubAmt(BigDecimal mealSubAmt) {
        this.mealSubAmt = mealSubAmt;
    }

    public Integer getAlreadyMealEach() {
        return alreadyMealEach;
    }

    public void setAlreadyMealEach(Integer alreadyMealEach) {
        this.alreadyMealEach = alreadyMealEach;
    }

    public Integer getAlreadyDayEach() {
        return alreadyDayEach;
    }

    public void setAlreadyDayEach(Integer alreadyDayEach) {
        this.alreadyDayEach = alreadyDayEach;
    }


    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "string", example = "123456", value = "密码")
    private String dbUserPassword;


    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "2000002", value = "人员序号")
    private Long userSerial;


    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "0", value = "人员状态")
    private Short userType;


    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "0", value = "卡状态")
    private Integer cardType;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "10001", value = "部门序号")
    private Integer userDep;


    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "string", example = "10001", value = "场所列表")
    private List<String> dbListAcdepSerial;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "10001", value = "场所编号")
    private Long acDepSerial;


    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "string", example = "0000000000001", value = "账户类型")
    private String acType;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "string", example = "2011101113313453", value = "时段编号")
    private String timeNo;


//    /**
//     *
//     */
//    @ApiModelProperty(required = false, dataType = "integer", example = "100", value = "是否允许时段外消费")
//    private Integer enableOutTimeXf;


    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "100", value = "是否在时段内")
    private Integer isInTime;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "100", value = "消费折扣")
    private Integer rate;



    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "100", value = "日补贴")
    private BigDecimal daySubAmt;


    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "100", value = "日补贴")
    private Integer daySubEach;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "100", value = "餐补贴")
    private BigDecimal mealSubAmt;



    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "100", value = "餐补份")
    private Integer mealSubEach;


    /**
     *   1启用0禁用
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "100", value = "是否全额补")
    private Integer enableFreeMealSub;

    /**
     *   1启用0禁止
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "1", value = "是否启用补贴")
    private Integer enableSub;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "100", value = "偏移量")
    private Integer acTimeOffset;


    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "100", value = "实扣金额")
    private BigDecimal realMoney;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "1", value = "是否启用超限密码")
    private Integer enableUserPassword;



    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "1", value = "是否已日补")
    private Integer alreadyDaySub;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "1", value = "是否已餐补")
    private Integer alreadyMealSub;


    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "1", value = "是否已餐份补")
    private Integer alreadyMealEach;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "1", value = "是否已日份补")
    private Integer alreadyDayEach;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "1", value = "时段开始")
    private Integer timeBegin;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "1", value = "时段结束")
    private Integer timeEnd;


    /**
     * 0先扣补贴 1只扣补贴 2只扣现金 3先扣现金
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "1", value = "扣款类型")
    private Integer chargeType;


    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "1", value = "扣现金")
    private BigDecimal chargeCash;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "1", value = "扣补贴")
    private BigDecimal chargeSub;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "1", value = "现金余额")
    private BigDecimal cashAmt;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "1", value = "补贴余额")
    private BigDecimal subAmt;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "1", value = "份余额")
    private Integer each;



    /**
     * 个人记录数
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "1", value = "个人记录数")
    private Integer jlCount;


    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "string", example = "00000008", value = "卡序号")
    private String cardSerial;



    /**
     *  账户时段序号
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "1", value = "账户时段序号")
    private Integer xfAcTimeXh;

}