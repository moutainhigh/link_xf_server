package com.weds.xf.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public class TradReqEntity extends TradRecoveryReqEntity implements Serializable {
    /**

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "122202", value = "交易前余额")
    private BigDecimal balance;



    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "1", value = "打折折数")
    private Integer rate;



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

    public Long getUserSerial() {
        return userSerial;
    }

    public void setUserSerial(Long userSerial) {
        this.userSerial = userSerial;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getShouldMoney() {
        return shouldMoney;
    }

    public void setShouldMoney(BigDecimal shouldMoney) {
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

    public BigDecimal getEachMoney() {
        return eachMoney;
    }

    public void setEachMoney(BigDecimal eachMoney) {
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

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


}