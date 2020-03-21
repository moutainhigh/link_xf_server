package com.weds.xf.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class RecoveryResEntity implements Serializable {
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

    public Integer getResCode() {
        return resCode;
    }

    public void setResCode(Integer resCode) {
        this.resCode = resCode;
    }

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
    @ApiModelProperty(required = true, dataType = "integer", example = "148", value = "识别介质")
    private Integer identityType;


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

    public Integer getIdentityType() {
        return identityType;
    }

    public void setIdentityType(Integer identityType) {
        this.identityType = identityType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}