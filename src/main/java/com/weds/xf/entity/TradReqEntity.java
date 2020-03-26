package com.weds.xf.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public class TradReqEntity extends BaseReqEntity implements Serializable {
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




    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }





}