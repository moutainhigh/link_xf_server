package com.weds.xf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

public class XfAddmoneyEntity extends BaseEntity implements Serializable {
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
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal inputMoney;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal addMoney;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal glyMoney;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:22:12", value = "")
    private Date sj;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:22:12", value = "")
    private Date updateSj;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer addState;

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
    private Integer type;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer lx;

    /**
     *
     */
    @Size(max = 8)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String cardSerial;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer addOrder;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column xf_addmoney.xh
     *
     * @return the value of xf_addmoney.xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public XfAddmoneyEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addmoney.xh
     *
     * @param xh the value for xf_addmoney.xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column xf_addmoney.user_serial
     *
     * @return the value of xf_addmoney.user_serial
     */
    public Long getUserSerial() {
        return userSerial;
    }

    /**
     */
    public XfAddmoneyEntity withUserSerial(Long userSerial) {
        this.setUserSerial(userSerial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addmoney.user_serial
     *
     * @param userSerial the value for xf_addmoney.user_serial
     */
    public void setUserSerial(Long userSerial) {
        this.userSerial = userSerial;
    }

    /**
     * This method returns the value of the database column xf_addmoney.input_money
     *
     * @return the value of xf_addmoney.input_money
     */
    public BigDecimal getInputMoney() {
        return inputMoney;
    }

    /**
     */
    public XfAddmoneyEntity withInputMoney(BigDecimal inputMoney) {
        this.setInputMoney(inputMoney);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addmoney.input_money
     *
     * @param inputMoney the value for xf_addmoney.input_money
     */
    public void setInputMoney(BigDecimal inputMoney) {
        this.inputMoney = inputMoney;
    }

    /**
     * This method returns the value of the database column xf_addmoney.add_money
     *
     * @return the value of xf_addmoney.add_money
     */
    public BigDecimal getAddMoney() {
        return addMoney;
    }

    /**
     */
    public XfAddmoneyEntity withAddMoney(BigDecimal addMoney) {
        this.setAddMoney(addMoney);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addmoney.add_money
     *
     * @param addMoney the value for xf_addmoney.add_money
     */
    public void setAddMoney(BigDecimal addMoney) {
        this.addMoney = addMoney;
    }

    /**
     * This method returns the value of the database column xf_addmoney.gly_money
     *
     * @return the value of xf_addmoney.gly_money
     */
    public BigDecimal getGlyMoney() {
        return glyMoney;
    }

    /**
     */
    public XfAddmoneyEntity withGlyMoney(BigDecimal glyMoney) {
        this.setGlyMoney(glyMoney);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addmoney.gly_money
     *
     * @param glyMoney the value for xf_addmoney.gly_money
     */
    public void setGlyMoney(BigDecimal glyMoney) {
        this.glyMoney = glyMoney;
    }

    /**
     * This method returns the value of the database column xf_addmoney.sj
     *
     * @return the value of xf_addmoney.sj
     */
    public Date getSj() {
        return sj;
    }

    /**
     */
    public XfAddmoneyEntity withSj(Date sj) {
        this.setSj(sj);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addmoney.sj
     *
     * @param sj the value for xf_addmoney.sj
     */
    public void setSj(Date sj) {
        this.sj = sj;
    }

    /**
     * This method returns the value of the database column xf_addmoney.update_sj
     *
     * @return the value of xf_addmoney.update_sj
     */
    public Date getUpdateSj() {
        return updateSj;
    }

    /**
     */
    public XfAddmoneyEntity withUpdateSj(Date updateSj) {
        this.setUpdateSj(updateSj);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addmoney.update_sj
     *
     * @param updateSj the value for xf_addmoney.update_sj
     */
    public void setUpdateSj(Date updateSj) {
        this.updateSj = updateSj;
    }

    /**
     * This method returns the value of the database column xf_addmoney.add_state
     *
     * @return the value of xf_addmoney.add_state
     */
    public Integer getAddState() {
        return addState;
    }

    /**
     */
    public XfAddmoneyEntity withAddState(Integer addState) {
        this.setAddState(addState);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addmoney.add_state
     *
     * @param addState the value for xf_addmoney.add_state
     */
    public void setAddState(Integer addState) {
        this.addState = addState;
    }

    /**
     * This method returns the value of the database column xf_addmoney.gly_no
     *
     * @return the value of xf_addmoney.gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public XfAddmoneyEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addmoney.gly_no
     *
     * @param glyNo the value for xf_addmoney.gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    /**
     * This method returns the value of the database column xf_addmoney.type
     *
     * @return the value of xf_addmoney.type
     */
    public Integer getType() {
        return type;
    }

    /**
     */
    public XfAddmoneyEntity withType(Integer type) {
        this.setType(type);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addmoney.type
     *
     * @param type the value for xf_addmoney.type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method returns the value of the database column xf_addmoney.lx
     *
     * @return the value of xf_addmoney.lx
     */
    public Integer getLx() {
        return lx;
    }

    /**
     */
    public XfAddmoneyEntity withLx(Integer lx) {
        this.setLx(lx);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addmoney.lx
     *
     * @param lx the value for xf_addmoney.lx
     */
    public void setLx(Integer lx) {
        this.lx = lx;
    }

    /**
     * This method returns the value of the database column xf_addmoney.card_serial
     *
     * @return the value of xf_addmoney.card_serial
     */
    public String getCardSerial() {
        return cardSerial;
    }

    /**
     */
    public XfAddmoneyEntity withCardSerial(String cardSerial) {
        this.setCardSerial(cardSerial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addmoney.card_serial
     *
     * @param cardSerial the value for xf_addmoney.card_serial
     */
    public void setCardSerial(String cardSerial) {
        this.cardSerial = cardSerial;
    }

    /**
     * This method returns the value of the database column xf_addmoney.add_order
     *
     * @return the value of xf_addmoney.add_order
     */
    public Integer getAddOrder() {
        return addOrder;
    }

    /**
     */
    public XfAddmoneyEntity withAddOrder(Integer addOrder) {
        this.setAddOrder(addOrder);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addmoney.add_order
     *
     * @param addOrder the value for xf_addmoney.add_order
     */
    public void setAddOrder(Integer addOrder) {
        this.addOrder = addOrder;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}