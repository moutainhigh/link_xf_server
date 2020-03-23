package com.weds.xf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

public class XfAcTimeEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer xh;

    /**
     *
     */
    @Size(max = 7)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String devSerial;

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
    private Integer timeMaxM;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer timeMaxT;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer dayOrder;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:17:03", value = "")
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
    @Size(max = 16)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String timeNo;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer lx;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer dayOffset;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acdepSerial;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private Integer timeSub;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer discountRate;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer timeLimit;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer eachUnit;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String regserial;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer isTimeout;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer timeoutRate;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acTimeMould;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acSubAuto;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer timeEachsub;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer mouldType;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acEachtimeMould;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column xf_ac_time.xh
     *
     * @return the value of xf_ac_time.xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public XfAcTimeEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.xh
     *
     * @param xh the value for xf_ac_time.xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column xf_ac_time.dev_serial
     *
     * @return the value of xf_ac_time.dev_serial
     */
    public String getDevSerial() {
        return devSerial;
    }

    /**
     */
    public XfAcTimeEntity withDevSerial(String devSerial) {
        this.setDevSerial(devSerial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.dev_serial
     *
     * @param devSerial the value for xf_ac_time.dev_serial
     */
    public void setDevSerial(String devSerial) {
        this.devSerial = devSerial;
    }

    /**
     * This method returns the value of the database column xf_ac_time.ac_type
     *
     * @return the value of xf_ac_time.ac_type
     */
    public String getAcType() {
        return acType;
    }

    /**
     */
    public XfAcTimeEntity withAcType(String acType) {
        this.setAcType(acType);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.ac_type
     *
     * @param acType the value for xf_ac_time.ac_type
     */
    public void setAcType(String acType) {
        this.acType = acType;
    }

    /**
     * This method returns the value of the database column xf_ac_time.time_max_m
     *
     * @return the value of xf_ac_time.time_max_m
     */
    public Integer getTimeMaxM() {
        return timeMaxM;
    }

    /**
     */
    public XfAcTimeEntity withTimeMaxM(Integer timeMaxM) {
        this.setTimeMaxM(timeMaxM);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.time_max_m
     *
     * @param timeMaxM the value for xf_ac_time.time_max_m
     */
    public void setTimeMaxM(Integer timeMaxM) {
        this.timeMaxM = timeMaxM;
    }

    /**
     * This method returns the value of the database column xf_ac_time.time_max_t
     *
     * @return the value of xf_ac_time.time_max_t
     */
    public Integer getTimeMaxT() {
        return timeMaxT;
    }

    /**
     */
    public XfAcTimeEntity withTimeMaxT(Integer timeMaxT) {
        this.setTimeMaxT(timeMaxT);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.time_max_t
     *
     * @param timeMaxT the value for xf_ac_time.time_max_t
     */
    public void setTimeMaxT(Integer timeMaxT) {
        this.timeMaxT = timeMaxT;
    }

    /**
     * This method returns the value of the database column xf_ac_time.day_order
     *
     * @return the value of xf_ac_time.day_order
     */
    public Integer getDayOrder() {
        return dayOrder;
    }

    /**
     */
    public XfAcTimeEntity withDayOrder(Integer dayOrder) {
        this.setDayOrder(dayOrder);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.day_order
     *
     * @param dayOrder the value for xf_ac_time.day_order
     */
    public void setDayOrder(Integer dayOrder) {
        this.dayOrder = dayOrder;
    }

    /**
     * This method returns the value of the database column xf_ac_time.sj
     *
     * @return the value of xf_ac_time.sj
     */
    public Date getSj() {
        return sj;
    }

    /**
     */
    public XfAcTimeEntity withSj(Date sj) {
        this.setSj(sj);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.sj
     *
     * @param sj the value for xf_ac_time.sj
     */
    public void setSj(Date sj) {
        this.sj = sj;
    }

    /**
     * This method returns the value of the database column xf_ac_time.gly_no
     *
     * @return the value of xf_ac_time.gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public XfAcTimeEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.gly_no
     *
     * @param glyNo the value for xf_ac_time.gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    /**
     * This method returns the value of the database column xf_ac_time.time_no
     *
     * @return the value of xf_ac_time.time_no
     */
    public String getTimeNo() {
        return timeNo;
    }

    /**
     */
    public XfAcTimeEntity withTimeNo(String timeNo) {
        this.setTimeNo(timeNo);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.time_no
     *
     * @param timeNo the value for xf_ac_time.time_no
     */
    public void setTimeNo(String timeNo) {
        this.timeNo = timeNo;
    }

    /**
     * This method returns the value of the database column xf_ac_time.lx
     *
     * @return the value of xf_ac_time.lx
     */
    public Integer getLx() {
        return lx;
    }

    /**
     */
    public XfAcTimeEntity withLx(Integer lx) {
        this.setLx(lx);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.lx
     *
     * @param lx the value for xf_ac_time.lx
     */
    public void setLx(Integer lx) {
        this.lx = lx;
    }

    /**
     * This method returns the value of the database column xf_ac_time.day_offset
     *
     * @return the value of xf_ac_time.day_offset
     */
    public Integer getDayOffset() {
        return dayOffset;
    }

    /**
     */
    public XfAcTimeEntity withDayOffset(Integer dayOffset) {
        this.setDayOffset(dayOffset);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.day_offset
     *
     * @param dayOffset the value for xf_ac_time.day_offset
     */
    public void setDayOffset(Integer dayOffset) {
        this.dayOffset = dayOffset;
    }

    /**
     * This method returns the value of the database column xf_ac_time.acdep_serial
     *
     * @return the value of xf_ac_time.acdep_serial
     */
    public Integer getAcdepSerial() {
        return acdepSerial;
    }

    /**
     */
    public XfAcTimeEntity withAcdepSerial(Integer acdepSerial) {
        this.setAcdepSerial(acdepSerial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.acdep_serial
     *
     * @param acdepSerial the value for xf_ac_time.acdep_serial
     */
    public void setAcdepSerial(Integer acdepSerial) {
        this.acdepSerial = acdepSerial;
    }

    /**
     * This method returns the value of the database column xf_ac_time.time_sub
     *
     * @return the value of xf_ac_time.time_sub
     */
    public Integer getTimeSub() {
        return timeSub;
    }

    /**
     */
    public XfAcTimeEntity withTimeSub(Integer timeSub) {
        this.setTimeSub(timeSub);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.time_sub
     *
     * @param timeSub the value for xf_ac_time.time_sub
     */
    public void setTimeSub(Integer timeSub) {
        this.timeSub = timeSub;
    }

    /**
     * This method returns the value of the database column xf_ac_time.discount_rate
     *
     * @return the value of xf_ac_time.discount_rate
     */
    public Integer getDiscountRate() {
        return discountRate;
    }

    /**
     */
    public XfAcTimeEntity withDiscountRate(Integer discountRate) {
        this.setDiscountRate(discountRate);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.discount_rate
     *
     * @param discountRate the value for xf_ac_time.discount_rate
     */
    public void setDiscountRate(Integer discountRate) {
        this.discountRate = discountRate;
    }

    /**
     * This method returns the value of the database column xf_ac_time.time_limit
     *
     * @return the value of xf_ac_time.time_limit
     */
    public Integer getTimeLimit() {
        return timeLimit;
    }

    /**
     */
    public XfAcTimeEntity withTimeLimit(Integer timeLimit) {
        this.setTimeLimit(timeLimit);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.time_limit
     *
     * @param timeLimit the value for xf_ac_time.time_limit
     */
    public void setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
    }

    /**
     * This method returns the value of the database column xf_ac_time.each_unit
     *
     * @return the value of xf_ac_time.each_unit
     */
    public Integer getEachUnit() {
        return eachUnit;
    }

    /**
     */
    public XfAcTimeEntity withEachUnit(Integer eachUnit) {
        this.setEachUnit(eachUnit);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.each_unit
     *
     * @param eachUnit the value for xf_ac_time.each_unit
     */
    public void setEachUnit(Integer eachUnit) {
        this.eachUnit = eachUnit;
    }

    /**
     * This method returns the value of the database column xf_ac_time.regserial
     *
     * @return the value of xf_ac_time.regserial
     */
    public String getRegserial() {
        return regserial;
    }

    /**
     */
    public XfAcTimeEntity withRegserial(String regserial) {
        this.setRegserial(regserial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.regserial
     *
     * @param regserial the value for xf_ac_time.regserial
     */
    public void setRegserial(String regserial) {
        this.regserial = regserial;
    }

    /**
     * This method returns the value of the database column xf_ac_time.is_timeout
     *
     * @return the value of xf_ac_time.is_timeout
     */
    public Integer getIsTimeout() {
        return isTimeout;
    }

    /**
     */
    public XfAcTimeEntity withIsTimeout(Integer isTimeout) {
        this.setIsTimeout(isTimeout);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.is_timeout
     *
     * @param isTimeout the value for xf_ac_time.is_timeout
     */
    public void setIsTimeout(Integer isTimeout) {
        this.isTimeout = isTimeout;
    }

    /**
     * This method returns the value of the database column xf_ac_time.timeout_rate
     *
     * @return the value of xf_ac_time.timeout_rate
     */
    public Integer getTimeoutRate() {
        return timeoutRate;
    }

    /**
     */
    public XfAcTimeEntity withTimeoutRate(Integer timeoutRate) {
        this.setTimeoutRate(timeoutRate);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.timeout_rate
     *
     * @param timeoutRate the value for xf_ac_time.timeout_rate
     */
    public void setTimeoutRate(Integer timeoutRate) {
        this.timeoutRate = timeoutRate;
    }

    /**
     * This method returns the value of the database column xf_ac_time.ac_time_mould
     *
     * @return the value of xf_ac_time.ac_time_mould
     */
    public Integer getAcTimeMould() {
        return acTimeMould;
    }

    /**
     */
    public XfAcTimeEntity withAcTimeMould(Integer acTimeMould) {
        this.setAcTimeMould(acTimeMould);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.ac_time_mould
     *
     * @param acTimeMould the value for xf_ac_time.ac_time_mould
     */
    public void setAcTimeMould(Integer acTimeMould) {
        this.acTimeMould = acTimeMould;
    }

    /**
     * This method returns the value of the database column xf_ac_time.ac_sub_auto
     *
     * @return the value of xf_ac_time.ac_sub_auto
     */
    public Integer getAcSubAuto() {
        return acSubAuto;
    }

    /**
     */
    public XfAcTimeEntity withAcSubAuto(Integer acSubAuto) {
        this.setAcSubAuto(acSubAuto);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.ac_sub_auto
     *
     * @param acSubAuto the value for xf_ac_time.ac_sub_auto
     */
    public void setAcSubAuto(Integer acSubAuto) {
        this.acSubAuto = acSubAuto;
    }

    /**
     * This method returns the value of the database column xf_ac_time.time_eachsub
     *
     * @return the value of xf_ac_time.time_eachsub
     */
    public Integer getTimeEachsub() {
        return timeEachsub;
    }

    /**
     */
    public XfAcTimeEntity withTimeEachsub(Integer timeEachsub) {
        this.setTimeEachsub(timeEachsub);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.time_eachsub
     *
     * @param timeEachsub the value for xf_ac_time.time_eachsub
     */
    public void setTimeEachsub(Integer timeEachsub) {
        this.timeEachsub = timeEachsub;
    }

    /**
     * This method returns the value of the database column xf_ac_time.mould_type
     *
     * @return the value of xf_ac_time.mould_type
     */
    public Integer getMouldType() {
        return mouldType;
    }

    /**
     */
    public XfAcTimeEntity withMouldType(Integer mouldType) {
        this.setMouldType(mouldType);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.mould_type
     *
     * @param mouldType the value for xf_ac_time.mould_type
     */
    public void setMouldType(Integer mouldType) {
        this.mouldType = mouldType;
    }

    /**
     * This method returns the value of the database column xf_ac_time.ac_eachtime_mould
     *
     * @return the value of xf_ac_time.ac_eachtime_mould
     */
    public Integer getAcEachtimeMould() {
        return acEachtimeMould;
    }

    /**
     */
    public XfAcTimeEntity withAcEachtimeMould(Integer acEachtimeMould) {
        this.setAcEachtimeMould(acEachtimeMould);
        return this;
    }

    /**
     * This method sets the value of the database column xf_ac_time.ac_eachtime_mould
     *
     * @param acEachtimeMould the value for xf_ac_time.ac_eachtime_mould
     */
    public void setAcEachtimeMould(Integer acEachtimeMould) {
        this.acEachtimeMould = acEachtimeMould;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}