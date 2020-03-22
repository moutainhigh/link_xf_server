package com.weds.xf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

public class XfTimeEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    @Size(max = 16)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String bh;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer kssj;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer jssj;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer dayOffset;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:16:55", value = "")
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
    @Size(max = 7)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String devSerial;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer dayOrder;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String lname;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String regserial;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column xf_time.bh
     *
     * @return the value of xf_time.bh
     */
    public String getBh() {
        return bh;
    }

    /**
     */
    public XfTimeEntity withBh(String bh) {
        this.setBh(bh);
        return this;
    }

    /**
     * This method sets the value of the database column xf_time.bh
     *
     * @param bh the value for xf_time.bh
     */
    public void setBh(String bh) {
        this.bh = bh;
    }

    /**
     * This method returns the value of the database column xf_time.kssj
     *
     * @return the value of xf_time.kssj
     */
    public Integer getKssj() {
        return kssj;
    }

    /**
     */
    public XfTimeEntity withKssj(Integer kssj) {
        this.setKssj(kssj);
        return this;
    }

    /**
     * This method sets the value of the database column xf_time.kssj
     *
     * @param kssj the value for xf_time.kssj
     */
    public void setKssj(Integer kssj) {
        this.kssj = kssj;
    }

    /**
     * This method returns the value of the database column xf_time.jssj
     *
     * @return the value of xf_time.jssj
     */
    public Integer getJssj() {
        return jssj;
    }

    /**
     */
    public XfTimeEntity withJssj(Integer jssj) {
        this.setJssj(jssj);
        return this;
    }

    /**
     * This method sets the value of the database column xf_time.jssj
     *
     * @param jssj the value for xf_time.jssj
     */
    public void setJssj(Integer jssj) {
        this.jssj = jssj;
    }

    /**
     * This method returns the value of the database column xf_time.day_offset
     *
     * @return the value of xf_time.day_offset
     */
    public Integer getDayOffset() {
        return dayOffset;
    }

    /**
     */
    public XfTimeEntity withDayOffset(Integer dayOffset) {
        this.setDayOffset(dayOffset);
        return this;
    }

    /**
     * This method sets the value of the database column xf_time.day_offset
     *
     * @param dayOffset the value for xf_time.day_offset
     */
    public void setDayOffset(Integer dayOffset) {
        this.dayOffset = dayOffset;
    }

    /**
     * This method returns the value of the database column xf_time.sj
     *
     * @return the value of xf_time.sj
     */
    public Date getSj() {
        return sj;
    }

    /**
     */
    public XfTimeEntity withSj(Date sj) {
        this.setSj(sj);
        return this;
    }

    /**
     * This method sets the value of the database column xf_time.sj
     *
     * @param sj the value for xf_time.sj
     */
    public void setSj(Date sj) {
        this.sj = sj;
    }

    /**
     * This method returns the value of the database column xf_time.gly_no
     *
     * @return the value of xf_time.gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public XfTimeEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column xf_time.gly_no
     *
     * @param glyNo the value for xf_time.gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    /**
     * This method returns the value of the database column xf_time.dev_serial
     *
     * @return the value of xf_time.dev_serial
     */
    public String getDevSerial() {
        return devSerial;
    }

    /**
     */
    public XfTimeEntity withDevSerial(String devSerial) {
        this.setDevSerial(devSerial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_time.dev_serial
     *
     * @param devSerial the value for xf_time.dev_serial
     */
    public void setDevSerial(String devSerial) {
        this.devSerial = devSerial;
    }

    /**
     * This method returns the value of the database column xf_time.day_order
     *
     * @return the value of xf_time.day_order
     */
    public Integer getDayOrder() {
        return dayOrder;
    }

    /**
     */
    public XfTimeEntity withDayOrder(Integer dayOrder) {
        this.setDayOrder(dayOrder);
        return this;
    }

    /**
     * This method sets the value of the database column xf_time.day_order
     *
     * @param dayOrder the value for xf_time.day_order
     */
    public void setDayOrder(Integer dayOrder) {
        this.dayOrder = dayOrder;
    }

    /**
     * This method returns the value of the database column xf_time.lname
     *
     * @return the value of xf_time.lname
     */
    public String getLname() {
        return lname;
    }

    /**
     */
    public XfTimeEntity withLname(String lname) {
        this.setLname(lname);
        return this;
    }

    /**
     * This method sets the value of the database column xf_time.lname
     *
     * @param lname the value for xf_time.lname
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * This method returns the value of the database column xf_time.regserial
     *
     * @return the value of xf_time.regserial
     */
    public String getRegserial() {
        return regserial;
    }

    /**
     */
    public XfTimeEntity withRegserial(String regserial) {
        this.setRegserial(regserial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_time.regserial
     *
     * @param regserial the value for xf_time.regserial
     */
    public void setRegserial(String regserial) {
        this.regserial = regserial;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}