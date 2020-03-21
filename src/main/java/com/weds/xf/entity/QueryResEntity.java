package com.weds.xf.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class QueryResEntity implements Serializable {
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
    @ApiModelProperty(required = true, dataType = "integer", example = "0", value = "返回码")
    private Integer resCode;


    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "151DF232", value = "物理卡号")
    private String cardNo;


    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "2000002", value = "人员序号")
    private Integer userSerial;


    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "122202", value = "剩余金额")
    private Integer balance;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "350", value = "剩余补贴")
    private Integer sub;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "100", value = "剩余份数")
    private Integer each;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "1", value = "单笔消费限额")
    private Integer singleLimitAmt;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "1", value = "日限次")
    private Integer dayLimitNum;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "1500", value = "日累计次数")
    private Integer daySumNum;


    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "1", value = "日限额")
    private Integer dayLimitAmt;

    /**
     *
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "1500", value = "日累计金额")
    private Integer daySumAmt;


    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "123456", value = "人员编号")
    private String userNo;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "123456", value = "人员姓名")
    private String userLname;

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

    public Integer getResCode() {
        return resCode;
    }

    public void setResCode(Integer resCode) {
        this.resCode = resCode;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
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

    public Integer getSub() {
        return sub;
    }

    public void setSub(Integer sub) {
        this.sub = sub;
    }

    public Integer getEach() {
        return each;
    }

    public void setEach(Integer each) {
        this.each = each;
    }

    public Integer getSingleLimitAmt() {
        return singleLimitAmt;
    }

    public void setSingleLimitAmt(Integer singleLimitAmt) {
        this.singleLimitAmt = singleLimitAmt;
    }

    public Integer getDayLimitNum() {
        return dayLimitNum;
    }

    public void setDayLimitNum(Integer dayLimitNum) {
        this.dayLimitNum = dayLimitNum;
    }

    public Integer getDaySumNum() {
        return daySumNum;
    }

    public void setDaySumNum(Integer daySumNum) {
        this.daySumNum = daySumNum;
    }

    public Integer getDayLimitAmt() {
        return dayLimitAmt;
    }

    public void setDayLimitAmt(Integer dayLimitAmt) {
        this.dayLimitAmt = dayLimitAmt;
    }

    public Integer getDaySumAmt() {
        return daySumAmt;
    }

    public void setDaySumAmt(Integer daySumAmt) {
        this.daySumAmt = daySumAmt;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserLname() {
        return userLname;
    }

    public void setUserLname(String userLname) {
        this.userLname = userLname;
    }


}