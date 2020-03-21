package com.weds.xf.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class RecordReqEntity implements Serializable {
    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "7800", value = "指令码")
    private String orderCode;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "", value = "包标识")
    private String packageSign;


    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "3000", value = "子指令码")
    private String subOrderCode;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "151DF232", value = "物理卡号")
    private String cardNo;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "1", value = "交易类型")
    private Integer tradType;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "0010001", value = "终端编号")
    private String devSerial;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "10", value = "交易流水")
    private Integer tradFlow;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "2000002", value = "人员序号")
    private Integer userSerial;


    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "122202", value = "交易前余额")
    private Integer balance;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "350", value = "交易金额")
    private Integer money;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "100", value = "应收金额")
    private Integer shouldMoney;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "1", value = "打折折数")
    private Integer rate;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "1", value = "交易份数")
    private Integer eachNum;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "1500", value = "份单价")
    private Integer eachMoney;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "148", value = "识别介质")
    private Integer identityType;


    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "20201020", value = "交易日期")
    private String tradDate;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "122135", value = "交易时间")
    private String tradTime;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "123456", value = "交易密码")
    private String password;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getPackageSign() {
        return packageSign;
    }

    public void setPackageSign(String packageSign) {
        this.packageSign = packageSign;
    }

    public String getSubOrderCode() {
        return subOrderCode;
    }

    public void setSubOrderCode(String subOrderCode) {
        this.subOrderCode = subOrderCode;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Integer getTradType() {
        return tradType;
    }

    public void setTradType(Integer tradType) {
        this.tradType = tradType;
    }

    public String getDevSerial() {
        return devSerial;
    }

    public void setDevSerial(String devSerial) {
        this.devSerial = devSerial;
    }

    public Integer getTradFlow() {
        return tradFlow;
    }

    public void setTradFlow(Integer tradFlow) {
        this.tradFlow = tradFlow;
    }

    public Integer getUserSerial() {
        return userSerial;
    }

    public void setUserSerial(Integer userSerial) {
        this.userSerial = userSerial;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getShouldMoney() {
        return shouldMoney;
    }

    public void setShouldMoney(Integer shouldMoney) {
        this.shouldMoney = shouldMoney;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getEachNum() {
        return eachNum;
    }

    public void setEachNum(Integer eachNum) {
        this.eachNum = eachNum;
    }

    public Integer getEachMoney() {
        return eachMoney;
    }

    public void setEachMoney(Integer eachMoney) {
        this.eachMoney = eachMoney;
    }

    public Integer getIdentityType() {
        return identityType;
    }

    public void setIdentityType(Integer identityType) {
        this.identityType = identityType;
    }

    public String getTradDate() {
        return tradDate;
    }

    public void setTradDate(String tradDate) {
        this.tradDate = tradDate;
    }

    public String getTradTime() {
        return tradTime;
    }

    public void setTradTime(String tradTime) {
        this.tradTime = tradTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}