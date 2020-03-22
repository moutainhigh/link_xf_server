package com.weds.xf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

public class DtAcUserEntity implements Serializable {
    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Long userSerial;

    /**
     *
     */
    @Size(max = 16)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String acType;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acOrder;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acMoney;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acAddm;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acSubm;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acRegm;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String acPass;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:15:01", value = "")
    private Date acKssj;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:15:01", value = "")
    private Date acJssj;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acState;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:15:01", value = "")
    private Date sj;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String glyNo;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acOverdraw;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acMake;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acAddo;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acSubo;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acEachm;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acEacho;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal acDelm;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer xh;

    /**
     *
     */
    @Size(max = 16)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String acNo;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acChange;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column dt_ac_user.user_serial
     *
     * @return the value of dt_ac_user.user_serial
     */
    public Long getUserSerial() {
        return userSerial;
    }

    /**
     */
    public DtAcUserEntity withUserSerial(Long userSerial) {
        this.setUserSerial(userSerial);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.user_serial
     *
     * @param userSerial the value for dt_ac_user.user_serial
     */
    public void setUserSerial(Long userSerial) {
        this.userSerial = userSerial;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_type
     *
     * @return the value of dt_ac_user.ac_type
     */
    public String getAcType() {
        return acType;
    }

    /**
     */
    public DtAcUserEntity withAcType(String acType) {
        this.setAcType(acType);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_type
     *
     * @param acType the value for dt_ac_user.ac_type
     */
    public void setAcType(String acType) {
        this.acType = acType;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_order
     *
     * @return the value of dt_ac_user.ac_order
     */
    public Integer getAcOrder() {
        return acOrder;
    }

    /**
     */
    public DtAcUserEntity withAcOrder(Integer acOrder) {
        this.setAcOrder(acOrder);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_order
     *
     * @param acOrder the value for dt_ac_user.ac_order
     */
    public void setAcOrder(Integer acOrder) {
        this.acOrder = acOrder;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_money
     *
     * @return the value of dt_ac_user.ac_money
     */
    public Integer getAcMoney() {
        return acMoney;
    }

    /**
     */
    public DtAcUserEntity withAcMoney(Integer acMoney) {
        this.setAcMoney(acMoney);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_money
     *
     * @param acMoney the value for dt_ac_user.ac_money
     */
    public void setAcMoney(Integer acMoney) {
        this.acMoney = acMoney;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_addm
     *
     * @return the value of dt_ac_user.ac_addm
     */
    public Integer getAcAddm() {
        return acAddm;
    }

    /**
     */
    public DtAcUserEntity withAcAddm(Integer acAddm) {
        this.setAcAddm(acAddm);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_addm
     *
     * @param acAddm the value for dt_ac_user.ac_addm
     */
    public void setAcAddm(Integer acAddm) {
        this.acAddm = acAddm;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_subm
     *
     * @return the value of dt_ac_user.ac_subm
     */
    public Integer getAcSubm() {
        return acSubm;
    }

    /**
     */
    public DtAcUserEntity withAcSubm(Integer acSubm) {
        this.setAcSubm(acSubm);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_subm
     *
     * @param acSubm the value for dt_ac_user.ac_subm
     */
    public void setAcSubm(Integer acSubm) {
        this.acSubm = acSubm;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_regm
     *
     * @return the value of dt_ac_user.ac_regm
     */
    public Integer getAcRegm() {
        return acRegm;
    }

    /**
     */
    public DtAcUserEntity withAcRegm(Integer acRegm) {
        this.setAcRegm(acRegm);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_regm
     *
     * @param acRegm the value for dt_ac_user.ac_regm
     */
    public void setAcRegm(Integer acRegm) {
        this.acRegm = acRegm;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_pass
     *
     * @return the value of dt_ac_user.ac_pass
     */
    public String getAcPass() {
        return acPass;
    }

    /**
     */
    public DtAcUserEntity withAcPass(String acPass) {
        this.setAcPass(acPass);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_pass
     *
     * @param acPass the value for dt_ac_user.ac_pass
     */
    public void setAcPass(String acPass) {
        this.acPass = acPass;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_kssj
     *
     * @return the value of dt_ac_user.ac_kssj
     */
    public Date getAcKssj() {
        return acKssj;
    }

    /**
     */
    public DtAcUserEntity withAcKssj(Date acKssj) {
        this.setAcKssj(acKssj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_kssj
     *
     * @param acKssj the value for dt_ac_user.ac_kssj
     */
    public void setAcKssj(Date acKssj) {
        this.acKssj = acKssj;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_jssj
     *
     * @return the value of dt_ac_user.ac_jssj
     */
    public Date getAcJssj() {
        return acJssj;
    }

    /**
     */
    public DtAcUserEntity withAcJssj(Date acJssj) {
        this.setAcJssj(acJssj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_jssj
     *
     * @param acJssj the value for dt_ac_user.ac_jssj
     */
    public void setAcJssj(Date acJssj) {
        this.acJssj = acJssj;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_state
     *
     * @return the value of dt_ac_user.ac_state
     */
    public Integer getAcState() {
        return acState;
    }

    /**
     */
    public DtAcUserEntity withAcState(Integer acState) {
        this.setAcState(acState);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_state
     *
     * @param acState the value for dt_ac_user.ac_state
     */
    public void setAcState(Integer acState) {
        this.acState = acState;
    }

    /**
     * This method returns the value of the database column dt_ac_user.sj
     *
     * @return the value of dt_ac_user.sj
     */
    public Date getSj() {
        return sj;
    }

    /**
     */
    public DtAcUserEntity withSj(Date sj) {
        this.setSj(sj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.sj
     *
     * @param sj the value for dt_ac_user.sj
     */
    public void setSj(Date sj) {
        this.sj = sj;
    }

    /**
     * This method returns the value of the database column dt_ac_user.gly_no
     *
     * @return the value of dt_ac_user.gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public DtAcUserEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.gly_no
     *
     * @param glyNo the value for dt_ac_user.gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_overdraw
     *
     * @return the value of dt_ac_user.ac_overdraw
     */
    public Integer getAcOverdraw() {
        return acOverdraw;
    }

    /**
     */
    public DtAcUserEntity withAcOverdraw(Integer acOverdraw) {
        this.setAcOverdraw(acOverdraw);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_overdraw
     *
     * @param acOverdraw the value for dt_ac_user.ac_overdraw
     */
    public void setAcOverdraw(Integer acOverdraw) {
        this.acOverdraw = acOverdraw;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_make
     *
     * @return the value of dt_ac_user.ac_make
     */
    public Integer getAcMake() {
        return acMake;
    }

    /**
     */
    public DtAcUserEntity withAcMake(Integer acMake) {
        this.setAcMake(acMake);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_make
     *
     * @param acMake the value for dt_ac_user.ac_make
     */
    public void setAcMake(Integer acMake) {
        this.acMake = acMake;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_addo
     *
     * @return the value of dt_ac_user.ac_addo
     */
    public Integer getAcAddo() {
        return acAddo;
    }

    /**
     */
    public DtAcUserEntity withAcAddo(Integer acAddo) {
        this.setAcAddo(acAddo);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_addo
     *
     * @param acAddo the value for dt_ac_user.ac_addo
     */
    public void setAcAddo(Integer acAddo) {
        this.acAddo = acAddo;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_subo
     *
     * @return the value of dt_ac_user.ac_subo
     */
    public Integer getAcSubo() {
        return acSubo;
    }

    /**
     */
    public DtAcUserEntity withAcSubo(Integer acSubo) {
        this.setAcSubo(acSubo);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_subo
     *
     * @param acSubo the value for dt_ac_user.ac_subo
     */
    public void setAcSubo(Integer acSubo) {
        this.acSubo = acSubo;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_eachm
     *
     * @return the value of dt_ac_user.ac_eachm
     */
    public Integer getAcEachm() {
        return acEachm;
    }

    /**
     */
    public DtAcUserEntity withAcEachm(Integer acEachm) {
        this.setAcEachm(acEachm);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_eachm
     *
     * @param acEachm the value for dt_ac_user.ac_eachm
     */
    public void setAcEachm(Integer acEachm) {
        this.acEachm = acEachm;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_eacho
     *
     * @return the value of dt_ac_user.ac_eacho
     */
    public Integer getAcEacho() {
        return acEacho;
    }

    /**
     */
    public DtAcUserEntity withAcEacho(Integer acEacho) {
        this.setAcEacho(acEacho);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_eacho
     *
     * @param acEacho the value for dt_ac_user.ac_eacho
     */
    public void setAcEacho(Integer acEacho) {
        this.acEacho = acEacho;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_delm
     *
     * @return the value of dt_ac_user.ac_delm
     */
    public BigDecimal getAcDelm() {
        return acDelm;
    }

    /**
     */
    public DtAcUserEntity withAcDelm(BigDecimal acDelm) {
        this.setAcDelm(acDelm);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_delm
     *
     * @param acDelm the value for dt_ac_user.ac_delm
     */
    public void setAcDelm(BigDecimal acDelm) {
        this.acDelm = acDelm;
    }

    /**
     * This method returns the value of the database column dt_ac_user.xh
     *
     * @return the value of dt_ac_user.xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public DtAcUserEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.xh
     *
     * @param xh the value for dt_ac_user.xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_no
     *
     * @return the value of dt_ac_user.ac_no
     */
    public String getAcNo() {
        return acNo;
    }

    /**
     */
    public DtAcUserEntity withAcNo(String acNo) {
        this.setAcNo(acNo);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_no
     *
     * @param acNo the value for dt_ac_user.ac_no
     */
    public void setAcNo(String acNo) {
        this.acNo = acNo;
    }

    /**
     * This method returns the value of the database column dt_ac_user.ac_change
     *
     * @return the value of dt_ac_user.ac_change
     */
    public Integer getAcChange() {
        return acChange;
    }

    /**
     */
    public DtAcUserEntity withAcChange(Integer acChange) {
        this.setAcChange(acChange);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_user.ac_change
     *
     * @param acChange the value for dt_ac_user.ac_change
     */
    public void setAcChange(Integer acChange) {
        this.acChange = acChange;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}