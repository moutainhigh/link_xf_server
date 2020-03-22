package com.weds.xf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

public class LinkOfflineCzEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer xh;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer userSerial;

    /**
     *
     */
    @Size(max = 2000)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String jlData;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:18:46", value = "")
    private Date jlSj;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer dealState;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:18:46", value = "")
    private Date dealSj;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer mould;

    /**
     *
     */
    @Size(max = 16)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String timeNo;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal newMoney;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column link_offline_cz.xh
     *
     * @return the value of link_offline_cz.xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public LinkOfflineCzEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column link_offline_cz.xh
     *
     * @param xh the value for link_offline_cz.xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column link_offline_cz.user_serial
     *
     * @return the value of link_offline_cz.user_serial
     */
    public Integer getUserSerial() {
        return userSerial;
    }

    /**
     */
    public LinkOfflineCzEntity withUserSerial(Integer userSerial) {
        this.setUserSerial(userSerial);
        return this;
    }

    /**
     * This method sets the value of the database column link_offline_cz.user_serial
     *
     * @param userSerial the value for link_offline_cz.user_serial
     */
    public void setUserSerial(Integer userSerial) {
        this.userSerial = userSerial;
    }

    /**
     * This method returns the value of the database column link_offline_cz.jl_data
     *
     * @return the value of link_offline_cz.jl_data
     */
    public String getJlData() {
        return jlData;
    }

    /**
     */
    public LinkOfflineCzEntity withJlData(String jlData) {
        this.setJlData(jlData);
        return this;
    }

    /**
     * This method sets the value of the database column link_offline_cz.jl_data
     *
     * @param jlData the value for link_offline_cz.jl_data
     */
    public void setJlData(String jlData) {
        this.jlData = jlData;
    }

    /**
     * This method returns the value of the database column link_offline_cz.jl_sj
     *
     * @return the value of link_offline_cz.jl_sj
     */
    public Date getJlSj() {
        return jlSj;
    }

    /**
     */
    public LinkOfflineCzEntity withJlSj(Date jlSj) {
        this.setJlSj(jlSj);
        return this;
    }

    /**
     * This method sets the value of the database column link_offline_cz.jl_sj
     *
     * @param jlSj the value for link_offline_cz.jl_sj
     */
    public void setJlSj(Date jlSj) {
        this.jlSj = jlSj;
    }

    /**
     * This method returns the value of the database column link_offline_cz.deal_state
     *
     * @return the value of link_offline_cz.deal_state
     */
    public Integer getDealState() {
        return dealState;
    }

    /**
     */
    public LinkOfflineCzEntity withDealState(Integer dealState) {
        this.setDealState(dealState);
        return this;
    }

    /**
     * This method sets the value of the database column link_offline_cz.deal_state
     *
     * @param dealState the value for link_offline_cz.deal_state
     */
    public void setDealState(Integer dealState) {
        this.dealState = dealState;
    }

    /**
     * This method returns the value of the database column link_offline_cz.deal_sj
     *
     * @return the value of link_offline_cz.deal_sj
     */
    public Date getDealSj() {
        return dealSj;
    }

    /**
     */
    public LinkOfflineCzEntity withDealSj(Date dealSj) {
        this.setDealSj(dealSj);
        return this;
    }

    /**
     * This method sets the value of the database column link_offline_cz.deal_sj
     *
     * @param dealSj the value for link_offline_cz.deal_sj
     */
    public void setDealSj(Date dealSj) {
        this.dealSj = dealSj;
    }

    /**
     * This method returns the value of the database column link_offline_cz.mould
     *
     * @return the value of link_offline_cz.mould
     */
    public Integer getMould() {
        return mould;
    }

    /**
     */
    public LinkOfflineCzEntity withMould(Integer mould) {
        this.setMould(mould);
        return this;
    }

    /**
     * This method sets the value of the database column link_offline_cz.mould
     *
     * @param mould the value for link_offline_cz.mould
     */
    public void setMould(Integer mould) {
        this.mould = mould;
    }

    /**
     * This method returns the value of the database column link_offline_cz.time_no
     *
     * @return the value of link_offline_cz.time_no
     */
    public String getTimeNo() {
        return timeNo;
    }

    /**
     */
    public LinkOfflineCzEntity withTimeNo(String timeNo) {
        this.setTimeNo(timeNo);
        return this;
    }

    /**
     * This method sets the value of the database column link_offline_cz.time_no
     *
     * @param timeNo the value for link_offline_cz.time_no
     */
    public void setTimeNo(String timeNo) {
        this.timeNo = timeNo;
    }

    /**
     * This method returns the value of the database column link_offline_cz.new_money
     *
     * @return the value of link_offline_cz.new_money
     */
    public BigDecimal getNewMoney() {
        return newMoney;
    }

    /**
     */
    public LinkOfflineCzEntity withNewMoney(BigDecimal newMoney) {
        this.setNewMoney(newMoney);
        return this;
    }

    /**
     * This method sets the value of the database column link_offline_cz.new_money
     *
     * @param newMoney the value for link_offline_cz.new_money
     */
    public void setNewMoney(BigDecimal newMoney) {
        this.newMoney = newMoney;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}