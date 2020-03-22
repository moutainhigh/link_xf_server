package com.weds.xf.entity;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;

import java.io.Serializable;
import java.util.List;

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
    private Integer acDepSerial;



    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "string", example = "0000000000001", value = "账户类型")
    private String acType;

    public String getAcType() {
        return acType;
    }

    public void setAcType(String acType) {
        this.acType = acType;
    }

    public List<String> getDbListAcdepSerial() {
        return dbListAcdepSerial;
    }

    public void setDbListAcdepSerial(List<String> dbListAcdepSerial) {
        this.dbListAcdepSerial = dbListAcdepSerial;
    }

    public Integer getAcDepSerial() {
        return acDepSerial;
    }

    public void setAcDepSerial(Integer acDepSerial) {
        this.acDepSerial = acDepSerial;
    }



    public Integer getUserDep() {
        return userDep;
    }

    public void setUserDep(Integer userDep) {
        this.userDep = userDep;
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
}