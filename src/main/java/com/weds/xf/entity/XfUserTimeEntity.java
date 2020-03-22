package com.weds.xf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

public class XfUserTimeEntity extends BaseEntity implements Serializable {
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:22:53", value = "")
    private Date rq;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer dayCount;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer dayMoney;

    /**
     *
     */
    @Size(max = 16)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String timeNo;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer timeXh;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer timeKs;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer timeJs;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer subDay;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer subHour;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer xfCount;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer xfMoney;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer xfEach;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:22:53", value = "")
    private Date sj;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer eachDay;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer eachHour;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column xf_user_time.xh
     *
     * @return the value of xf_user_time.xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public XfUserTimeEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column xf_user_time.xh
     *
     * @param xh the value for xf_user_time.xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column xf_user_time.user_serial
     *
     * @return the value of xf_user_time.user_serial
     */
    public Long getUserSerial() {
        return userSerial;
    }

    /**
     */
    public XfUserTimeEntity withUserSerial(Long userSerial) {
        this.setUserSerial(userSerial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_user_time.user_serial
     *
     * @param userSerial the value for xf_user_time.user_serial
     */
    public void setUserSerial(Long userSerial) {
        this.userSerial = userSerial;
    }

    /**
     * This method returns the value of the database column xf_user_time.rq
     *
     * @return the value of xf_user_time.rq
     */
    public Date getRq() {
        return rq;
    }

    /**
     */
    public XfUserTimeEntity withRq(Date rq) {
        this.setRq(rq);
        return this;
    }

    /**
     * This method sets the value of the database column xf_user_time.rq
     *
     * @param rq the value for xf_user_time.rq
     */
    public void setRq(Date rq) {
        this.rq = rq;
    }

    /**
     * This method returns the value of the database column xf_user_time.day_count
     *
     * @return the value of xf_user_time.day_count
     */
    public Integer getDayCount() {
        return dayCount;
    }

    /**
     */
    public XfUserTimeEntity withDayCount(Integer dayCount) {
        this.setDayCount(dayCount);
        return this;
    }

    /**
     * This method sets the value of the database column xf_user_time.day_count
     *
     * @param dayCount the value for xf_user_time.day_count
     */
    public void setDayCount(Integer dayCount) {
        this.dayCount = dayCount;
    }

    /**
     * This method returns the value of the database column xf_user_time.day_money
     *
     * @return the value of xf_user_time.day_money
     */
    public Integer getDayMoney() {
        return dayMoney;
    }

    /**
     */
    public XfUserTimeEntity withDayMoney(Integer dayMoney) {
        this.setDayMoney(dayMoney);
        return this;
    }

    /**
     * This method sets the value of the database column xf_user_time.day_money
     *
     * @param dayMoney the value for xf_user_time.day_money
     */
    public void setDayMoney(Integer dayMoney) {
        this.dayMoney = dayMoney;
    }

    /**
     * This method returns the value of the database column xf_user_time.time_no
     *
     * @return the value of xf_user_time.time_no
     */
    public String getTimeNo() {
        return timeNo;
    }

    /**
     */
    public XfUserTimeEntity withTimeNo(String timeNo) {
        this.setTimeNo(timeNo);
        return this;
    }

    /**
     * This method sets the value of the database column xf_user_time.time_no
     *
     * @param timeNo the value for xf_user_time.time_no
     */
    public void setTimeNo(String timeNo) {
        this.timeNo = timeNo;
    }

    /**
     * This method returns the value of the database column xf_user_time.time_xh
     *
     * @return the value of xf_user_time.time_xh
     */
    public Integer getTimeXh() {
        return timeXh;
    }

    /**
     */
    public XfUserTimeEntity withTimeXh(Integer timeXh) {
        this.setTimeXh(timeXh);
        return this;
    }

    /**
     * This method sets the value of the database column xf_user_time.time_xh
     *
     * @param timeXh the value for xf_user_time.time_xh
     */
    public void setTimeXh(Integer timeXh) {
        this.timeXh = timeXh;
    }

    /**
     * This method returns the value of the database column xf_user_time.time_ks
     *
     * @return the value of xf_user_time.time_ks
     */
    public Integer getTimeKs() {
        return timeKs;
    }

    /**
     */
    public XfUserTimeEntity withTimeKs(Integer timeKs) {
        this.setTimeKs(timeKs);
        return this;
    }

    /**
     * This method sets the value of the database column xf_user_time.time_ks
     *
     * @param timeKs the value for xf_user_time.time_ks
     */
    public void setTimeKs(Integer timeKs) {
        this.timeKs = timeKs;
    }

    /**
     * This method returns the value of the database column xf_user_time.time_js
     *
     * @return the value of xf_user_time.time_js
     */
    public Integer getTimeJs() {
        return timeJs;
    }

    /**
     */
    public XfUserTimeEntity withTimeJs(Integer timeJs) {
        this.setTimeJs(timeJs);
        return this;
    }

    /**
     * This method sets the value of the database column xf_user_time.time_js
     *
     * @param timeJs the value for xf_user_time.time_js
     */
    public void setTimeJs(Integer timeJs) {
        this.timeJs = timeJs;
    }

    /**
     * This method returns the value of the database column xf_user_time.Sub_day
     *
     * @return the value of xf_user_time.Sub_day
     */
    public Integer getSubDay() {
        return subDay;
    }

    /**
     */
    public XfUserTimeEntity withSubDay(Integer subDay) {
        this.setSubDay(subDay);
        return this;
    }

    /**
     * This method sets the value of the database column xf_user_time.Sub_day
     *
     * @param subDay the value for xf_user_time.Sub_day
     */
    public void setSubDay(Integer subDay) {
        this.subDay = subDay;
    }

    /**
     * This method returns the value of the database column xf_user_time.Sub_hour
     *
     * @return the value of xf_user_time.Sub_hour
     */
    public Integer getSubHour() {
        return subHour;
    }

    /**
     */
    public XfUserTimeEntity withSubHour(Integer subHour) {
        this.setSubHour(subHour);
        return this;
    }

    /**
     * This method sets the value of the database column xf_user_time.Sub_hour
     *
     * @param subHour the value for xf_user_time.Sub_hour
     */
    public void setSubHour(Integer subHour) {
        this.subHour = subHour;
    }

    /**
     * This method returns the value of the database column xf_user_time.xf_count
     *
     * @return the value of xf_user_time.xf_count
     */
    public Integer getXfCount() {
        return xfCount;
    }

    /**
     */
    public XfUserTimeEntity withXfCount(Integer xfCount) {
        this.setXfCount(xfCount);
        return this;
    }

    /**
     * This method sets the value of the database column xf_user_time.xf_count
     *
     * @param xfCount the value for xf_user_time.xf_count
     */
    public void setXfCount(Integer xfCount) {
        this.xfCount = xfCount;
    }

    /**
     * This method returns the value of the database column xf_user_time.xf_money
     *
     * @return the value of xf_user_time.xf_money
     */
    public Integer getXfMoney() {
        return xfMoney;
    }

    /**
     */
    public XfUserTimeEntity withXfMoney(Integer xfMoney) {
        this.setXfMoney(xfMoney);
        return this;
    }

    /**
     * This method sets the value of the database column xf_user_time.xf_money
     *
     * @param xfMoney the value for xf_user_time.xf_money
     */
    public void setXfMoney(Integer xfMoney) {
        this.xfMoney = xfMoney;
    }

    /**
     * This method returns the value of the database column xf_user_time.xf_each
     *
     * @return the value of xf_user_time.xf_each
     */
    public Integer getXfEach() {
        return xfEach;
    }

    /**
     */
    public XfUserTimeEntity withXfEach(Integer xfEach) {
        this.setXfEach(xfEach);
        return this;
    }

    /**
     * This method sets the value of the database column xf_user_time.xf_each
     *
     * @param xfEach the value for xf_user_time.xf_each
     */
    public void setXfEach(Integer xfEach) {
        this.xfEach = xfEach;
    }

    /**
     * This method returns the value of the database column xf_user_time.sj
     *
     * @return the value of xf_user_time.sj
     */
    public Date getSj() {
        return sj;
    }

    /**
     */
    public XfUserTimeEntity withSj(Date sj) {
        this.setSj(sj);
        return this;
    }

    /**
     * This method sets the value of the database column xf_user_time.sj
     *
     * @param sj the value for xf_user_time.sj
     */
    public void setSj(Date sj) {
        this.sj = sj;
    }

    /**
     * This method returns the value of the database column xf_user_time.each_day
     *
     * @return the value of xf_user_time.each_day
     */
    public Integer getEachDay() {
        return eachDay;
    }

    /**
     */
    public XfUserTimeEntity withEachDay(Integer eachDay) {
        this.setEachDay(eachDay);
        return this;
    }

    /**
     * This method sets the value of the database column xf_user_time.each_day
     *
     * @param eachDay the value for xf_user_time.each_day
     */
    public void setEachDay(Integer eachDay) {
        this.eachDay = eachDay;
    }

    /**
     * This method returns the value of the database column xf_user_time.each_hour
     *
     * @return the value of xf_user_time.each_hour
     */
    public Integer getEachHour() {
        return eachHour;
    }

    /**
     */
    public XfUserTimeEntity withEachHour(Integer eachHour) {
        this.setEachHour(eachHour);
        return this;
    }

    /**
     * This method sets the value of the database column xf_user_time.each_hour
     *
     * @param eachHour the value for xf_user_time.each_hour
     */
    public void setEachHour(Integer eachHour) {
        this.eachHour = eachHour;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}