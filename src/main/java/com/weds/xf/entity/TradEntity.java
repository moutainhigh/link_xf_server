package com.weds.xf.entity;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;

import java.io.Serializable;

public class TradEntity implements Serializable {

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
}