package com.weds.xf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

public class XfYcEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer xh;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Long userSerial;

    /**
     *
     */
    @Size(max = 7)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String devSerial;

    /**
     *
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String jlBh;

    /**
     *
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String cardHao;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer lx;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer stateFlag;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer newMoney;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer newEach;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer devType;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer pass;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer identType;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer makeLx;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer tLevel;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer styleYc;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:23:06", value = "")
    private Date ycSj;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column xf_yc.xh
     *
     * @return the value of xf_yc.xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public XfYcEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column xf_yc.xh
     *
     * @param xh the value for xf_yc.xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column xf_yc.user_serial
     *
     * @return the value of xf_yc.user_serial
     */
    public Long getUserSerial() {
        return userSerial;
    }

    /**
     */
    public XfYcEntity withUserSerial(Long userSerial) {
        this.setUserSerial(userSerial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_yc.user_serial
     *
     * @param userSerial the value for xf_yc.user_serial
     */
    public void setUserSerial(Long userSerial) {
        this.userSerial = userSerial;
    }

    /**
     * This method returns the value of the database column xf_yc.dev_serial
     *
     * @return the value of xf_yc.dev_serial
     */
    public String getDevSerial() {
        return devSerial;
    }

    /**
     */
    public XfYcEntity withDevSerial(String devSerial) {
        this.setDevSerial(devSerial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_yc.dev_serial
     *
     * @param devSerial the value for xf_yc.dev_serial
     */
    public void setDevSerial(String devSerial) {
        this.devSerial = devSerial;
    }

    /**
     * This method returns the value of the database column xf_yc.jl_bh
     *
     * @return the value of xf_yc.jl_bh
     */
    public String getJlBh() {
        return jlBh;
    }

    /**
     */
    public XfYcEntity withJlBh(String jlBh) {
        this.setJlBh(jlBh);
        return this;
    }

    /**
     * This method sets the value of the database column xf_yc.jl_bh
     *
     * @param jlBh the value for xf_yc.jl_bh
     */
    public void setJlBh(String jlBh) {
        this.jlBh = jlBh;
    }

    /**
     * This method returns the value of the database column xf_yc.card_hao
     *
     * @return the value of xf_yc.card_hao
     */
    public String getCardHao() {
        return cardHao;
    }

    /**
     */
    public XfYcEntity withCardHao(String cardHao) {
        this.setCardHao(cardHao);
        return this;
    }

    /**
     * This method sets the value of the database column xf_yc.card_hao
     *
     * @param cardHao the value for xf_yc.card_hao
     */
    public void setCardHao(String cardHao) {
        this.cardHao = cardHao;
    }

    /**
     * This method returns the value of the database column xf_yc.lx
     *
     * @return the value of xf_yc.lx
     */
    public Integer getLx() {
        return lx;
    }

    /**
     */
    public XfYcEntity withLx(Integer lx) {
        this.setLx(lx);
        return this;
    }

    /**
     * This method sets the value of the database column xf_yc.lx
     *
     * @param lx the value for xf_yc.lx
     */
    public void setLx(Integer lx) {
        this.lx = lx;
    }

    /**
     * This method returns the value of the database column xf_yc.state_flag
     *
     * @return the value of xf_yc.state_flag
     */
    public Integer getStateFlag() {
        return stateFlag;
    }

    /**
     */
    public XfYcEntity withStateFlag(Integer stateFlag) {
        this.setStateFlag(stateFlag);
        return this;
    }

    /**
     * This method sets the value of the database column xf_yc.state_flag
     *
     * @param stateFlag the value for xf_yc.state_flag
     */
    public void setStateFlag(Integer stateFlag) {
        this.stateFlag = stateFlag;
    }

    /**
     * This method returns the value of the database column xf_yc.new_money
     *
     * @return the value of xf_yc.new_money
     */
    public Integer getNewMoney() {
        return newMoney;
    }

    /**
     */
    public XfYcEntity withNewMoney(Integer newMoney) {
        this.setNewMoney(newMoney);
        return this;
    }

    /**
     * This method sets the value of the database column xf_yc.new_money
     *
     * @param newMoney the value for xf_yc.new_money
     */
    public void setNewMoney(Integer newMoney) {
        this.newMoney = newMoney;
    }

    /**
     * This method returns the value of the database column xf_yc.new_each
     *
     * @return the value of xf_yc.new_each
     */
    public Integer getNewEach() {
        return newEach;
    }

    /**
     */
    public XfYcEntity withNewEach(Integer newEach) {
        this.setNewEach(newEach);
        return this;
    }

    /**
     * This method sets the value of the database column xf_yc.new_each
     *
     * @param newEach the value for xf_yc.new_each
     */
    public void setNewEach(Integer newEach) {
        this.newEach = newEach;
    }

    /**
     * This method returns the value of the database column xf_yc.dev_type
     *
     * @return the value of xf_yc.dev_type
     */
    public Integer getDevType() {
        return devType;
    }

    /**
     */
    public XfYcEntity withDevType(Integer devType) {
        this.setDevType(devType);
        return this;
    }

    /**
     * This method sets the value of the database column xf_yc.dev_type
     *
     * @param devType the value for xf_yc.dev_type
     */
    public void setDevType(Integer devType) {
        this.devType = devType;
    }

    /**
     * This method returns the value of the database column xf_yc.pass
     *
     * @return the value of xf_yc.pass
     */
    public Integer getPass() {
        return pass;
    }

    /**
     */
    public XfYcEntity withPass(Integer pass) {
        this.setPass(pass);
        return this;
    }

    /**
     * This method sets the value of the database column xf_yc.pass
     *
     * @param pass the value for xf_yc.pass
     */
    public void setPass(Integer pass) {
        this.pass = pass;
    }

    /**
     * This method returns the value of the database column xf_yc.ident_type
     *
     * @return the value of xf_yc.ident_type
     */
    public Integer getIdentType() {
        return identType;
    }

    /**
     */
    public XfYcEntity withIdentType(Integer identType) {
        this.setIdentType(identType);
        return this;
    }

    /**
     * This method sets the value of the database column xf_yc.ident_type
     *
     * @param identType the value for xf_yc.ident_type
     */
    public void setIdentType(Integer identType) {
        this.identType = identType;
    }

    /**
     * This method returns the value of the database column xf_yc.make_lx
     *
     * @return the value of xf_yc.make_lx
     */
    public Integer getMakeLx() {
        return makeLx;
    }

    /**
     */
    public XfYcEntity withMakeLx(Integer makeLx) {
        this.setMakeLx(makeLx);
        return this;
    }

    /**
     * This method sets the value of the database column xf_yc.make_lx
     *
     * @param makeLx the value for xf_yc.make_lx
     */
    public void setMakeLx(Integer makeLx) {
        this.makeLx = makeLx;
    }

    /**
     * This method returns the value of the database column xf_yc.t_level
     *
     * @return the value of xf_yc.t_level
     */
    public Integer gettLevel() {
        return tLevel;
    }

    /**
     */
    public XfYcEntity withtLevel(Integer tLevel) {
        this.settLevel(tLevel);
        return this;
    }

    /**
     * This method sets the value of the database column xf_yc.t_level
     *
     * @param tLevel the value for xf_yc.t_level
     */
    public void settLevel(Integer tLevel) {
        this.tLevel = tLevel;
    }

    /**
     * This method returns the value of the database column xf_yc.style_yc
     *
     * @return the value of xf_yc.style_yc
     */
    public Integer getStyleYc() {
        return styleYc;
    }

    /**
     */
    public XfYcEntity withStyleYc(Integer styleYc) {
        this.setStyleYc(styleYc);
        return this;
    }

    /**
     * This method sets the value of the database column xf_yc.style_yc
     *
     * @param styleYc the value for xf_yc.style_yc
     */
    public void setStyleYc(Integer styleYc) {
        this.styleYc = styleYc;
    }

    /**
     * This method returns the value of the database column xf_yc.yc_sj
     *
     * @return the value of xf_yc.yc_sj
     */
    public Date getYcSj() {
        return ycSj;
    }

    /**
     */
    public XfYcEntity withYcSj(Date ycSj) {
        this.setYcSj(ycSj);
        return this;
    }

    /**
     * This method sets the value of the database column xf_yc.yc_sj
     *
     * @param ycSj the value for xf_yc.yc_sj
     */
    public void setYcSj(Date ycSj) {
        this.ycSj = ycSj;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}