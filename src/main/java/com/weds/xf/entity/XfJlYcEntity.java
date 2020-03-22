package com.weds.xf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

public class XfJlYcEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer xh;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer mould;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer lx;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer type;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String jlBh;

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
    private Long userSerial;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String userCard;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String samSerial;

    /**
     *
     */
    @Size(max = 8)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String cardSerial;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal oldMoney;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal newMoney;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal moreMoney;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer discountRate;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:22:30", value = "")
    private Date jlSj;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer jlCount;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer subXh;

    /**
     *
     */
    @Size(max = 16)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String timeOrder;

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
    private Integer delType;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal subOld;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal subNew;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer eachOld;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer eachNew;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer eachUnit;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer timeSerialOld;

    /**
     *
     */
    @Size(max = 16)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String timeNoOld;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer timeSerialNew;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:22:30", value = "")
    private Date sj;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer state;

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
    private Integer identType;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acPass;

    /**
     *
     */
    @Size(max = 200)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String jlData;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer stateFlag;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer jlNumber;

    /**
     *
     */
    @Size(max = 16)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String nowBh;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer depSerial;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer resSubLx;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal resDaySub;

    /**
     *
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String addGly;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column XF_JL_YC.xh
     *
     * @return the value of XF_JL_YC.xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public XfJlYcEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.xh
     *
     * @param xh the value for XF_JL_YC.xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.mould
     *
     * @return the value of XF_JL_YC.mould
     */
    public Integer getMould() {
        return mould;
    }

    /**
     */
    public XfJlYcEntity withMould(Integer mould) {
        this.setMould(mould);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.mould
     *
     * @param mould the value for XF_JL_YC.mould
     */
    public void setMould(Integer mould) {
        this.mould = mould;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.lx
     *
     * @return the value of XF_JL_YC.lx
     */
    public Integer getLx() {
        return lx;
    }

    /**
     */
    public XfJlYcEntity withLx(Integer lx) {
        this.setLx(lx);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.lx
     *
     * @param lx the value for XF_JL_YC.lx
     */
    public void setLx(Integer lx) {
        this.lx = lx;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.type
     *
     * @return the value of XF_JL_YC.type
     */
    public Integer getType() {
        return type;
    }

    /**
     */
    public XfJlYcEntity withType(Integer type) {
        this.setType(type);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.type
     *
     * @param type the value for XF_JL_YC.type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.jl_bh
     *
     * @return the value of XF_JL_YC.jl_bh
     */
    public String getJlBh() {
        return jlBh;
    }

    /**
     */
    public XfJlYcEntity withJlBh(String jlBh) {
        this.setJlBh(jlBh);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.jl_bh
     *
     * @param jlBh the value for XF_JL_YC.jl_bh
     */
    public void setJlBh(String jlBh) {
        this.jlBh = jlBh;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.dev_serial
     *
     * @return the value of XF_JL_YC.dev_serial
     */
    public String getDevSerial() {
        return devSerial;
    }

    /**
     */
    public XfJlYcEntity withDevSerial(String devSerial) {
        this.setDevSerial(devSerial);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.dev_serial
     *
     * @param devSerial the value for XF_JL_YC.dev_serial
     */
    public void setDevSerial(String devSerial) {
        this.devSerial = devSerial;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.user_serial
     *
     * @return the value of XF_JL_YC.user_serial
     */
    public Long getUserSerial() {
        return userSerial;
    }

    /**
     */
    public XfJlYcEntity withUserSerial(Long userSerial) {
        this.setUserSerial(userSerial);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.user_serial
     *
     * @param userSerial the value for XF_JL_YC.user_serial
     */
    public void setUserSerial(Long userSerial) {
        this.userSerial = userSerial;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.user_card
     *
     * @return the value of XF_JL_YC.user_card
     */
    public String getUserCard() {
        return userCard;
    }

    /**
     */
    public XfJlYcEntity withUserCard(String userCard) {
        this.setUserCard(userCard);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.user_card
     *
     * @param userCard the value for XF_JL_YC.user_card
     */
    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.sam_serial
     *
     * @return the value of XF_JL_YC.sam_serial
     */
    public String getSamSerial() {
        return samSerial;
    }

    /**
     */
    public XfJlYcEntity withSamSerial(String samSerial) {
        this.setSamSerial(samSerial);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.sam_serial
     *
     * @param samSerial the value for XF_JL_YC.sam_serial
     */
    public void setSamSerial(String samSerial) {
        this.samSerial = samSerial;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.card_serial
     *
     * @return the value of XF_JL_YC.card_serial
     */
    public String getCardSerial() {
        return cardSerial;
    }

    /**
     */
    public XfJlYcEntity withCardSerial(String cardSerial) {
        this.setCardSerial(cardSerial);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.card_serial
     *
     * @param cardSerial the value for XF_JL_YC.card_serial
     */
    public void setCardSerial(String cardSerial) {
        this.cardSerial = cardSerial;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.old_money
     *
     * @return the value of XF_JL_YC.old_money
     */
    public BigDecimal getOldMoney() {
        return oldMoney;
    }

    /**
     */
    public XfJlYcEntity withOldMoney(BigDecimal oldMoney) {
        this.setOldMoney(oldMoney);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.old_money
     *
     * @param oldMoney the value for XF_JL_YC.old_money
     */
    public void setOldMoney(BigDecimal oldMoney) {
        this.oldMoney = oldMoney;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.new_money
     *
     * @return the value of XF_JL_YC.new_money
     */
    public BigDecimal getNewMoney() {
        return newMoney;
    }

    /**
     */
    public XfJlYcEntity withNewMoney(BigDecimal newMoney) {
        this.setNewMoney(newMoney);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.new_money
     *
     * @param newMoney the value for XF_JL_YC.new_money
     */
    public void setNewMoney(BigDecimal newMoney) {
        this.newMoney = newMoney;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.more_money
     *
     * @return the value of XF_JL_YC.more_money
     */
    public BigDecimal getMoreMoney() {
        return moreMoney;
    }

    /**
     */
    public XfJlYcEntity withMoreMoney(BigDecimal moreMoney) {
        this.setMoreMoney(moreMoney);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.more_money
     *
     * @param moreMoney the value for XF_JL_YC.more_money
     */
    public void setMoreMoney(BigDecimal moreMoney) {
        this.moreMoney = moreMoney;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.discount_rate
     *
     * @return the value of XF_JL_YC.discount_rate
     */
    public Integer getDiscountRate() {
        return discountRate;
    }

    /**
     */
    public XfJlYcEntity withDiscountRate(Integer discountRate) {
        this.setDiscountRate(discountRate);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.discount_rate
     *
     * @param discountRate the value for XF_JL_YC.discount_rate
     */
    public void setDiscountRate(Integer discountRate) {
        this.discountRate = discountRate;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.jl_sj
     *
     * @return the value of XF_JL_YC.jl_sj
     */
    public Date getJlSj() {
        return jlSj;
    }

    /**
     */
    public XfJlYcEntity withJlSj(Date jlSj) {
        this.setJlSj(jlSj);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.jl_sj
     *
     * @param jlSj the value for XF_JL_YC.jl_sj
     */
    public void setJlSj(Date jlSj) {
        this.jlSj = jlSj;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.jl_count
     *
     * @return the value of XF_JL_YC.jl_count
     */
    public Integer getJlCount() {
        return jlCount;
    }

    /**
     */
    public XfJlYcEntity withJlCount(Integer jlCount) {
        this.setJlCount(jlCount);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.jl_count
     *
     * @param jlCount the value for XF_JL_YC.jl_count
     */
    public void setJlCount(Integer jlCount) {
        this.jlCount = jlCount;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.sub_xh
     *
     * @return the value of XF_JL_YC.sub_xh
     */
    public Integer getSubXh() {
        return subXh;
    }

    /**
     */
    public XfJlYcEntity withSubXh(Integer subXh) {
        this.setSubXh(subXh);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.sub_xh
     *
     * @param subXh the value for XF_JL_YC.sub_xh
     */
    public void setSubXh(Integer subXh) {
        this.subXh = subXh;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.time_order
     *
     * @return the value of XF_JL_YC.time_order
     */
    public String getTimeOrder() {
        return timeOrder;
    }

    /**
     */
    public XfJlYcEntity withTimeOrder(String timeOrder) {
        this.setTimeOrder(timeOrder);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.time_order
     *
     * @param timeOrder the value for XF_JL_YC.time_order
     */
    public void setTimeOrder(String timeOrder) {
        this.timeOrder = timeOrder;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.time_no
     *
     * @return the value of XF_JL_YC.time_no
     */
    public String getTimeNo() {
        return timeNo;
    }

    /**
     */
    public XfJlYcEntity withTimeNo(String timeNo) {
        this.setTimeNo(timeNo);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.time_no
     *
     * @param timeNo the value for XF_JL_YC.time_no
     */
    public void setTimeNo(String timeNo) {
        this.timeNo = timeNo;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.del_type
     *
     * @return the value of XF_JL_YC.del_type
     */
    public Integer getDelType() {
        return delType;
    }

    /**
     */
    public XfJlYcEntity withDelType(Integer delType) {
        this.setDelType(delType);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.del_type
     *
     * @param delType the value for XF_JL_YC.del_type
     */
    public void setDelType(Integer delType) {
        this.delType = delType;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.sub_old
     *
     * @return the value of XF_JL_YC.sub_old
     */
    public BigDecimal getSubOld() {
        return subOld;
    }

    /**
     */
    public XfJlYcEntity withSubOld(BigDecimal subOld) {
        this.setSubOld(subOld);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.sub_old
     *
     * @param subOld the value for XF_JL_YC.sub_old
     */
    public void setSubOld(BigDecimal subOld) {
        this.subOld = subOld;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.sub_new
     *
     * @return the value of XF_JL_YC.sub_new
     */
    public BigDecimal getSubNew() {
        return subNew;
    }

    /**
     */
    public XfJlYcEntity withSubNew(BigDecimal subNew) {
        this.setSubNew(subNew);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.sub_new
     *
     * @param subNew the value for XF_JL_YC.sub_new
     */
    public void setSubNew(BigDecimal subNew) {
        this.subNew = subNew;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.each_old
     *
     * @return the value of XF_JL_YC.each_old
     */
    public Integer getEachOld() {
        return eachOld;
    }

    /**
     */
    public XfJlYcEntity withEachOld(Integer eachOld) {
        this.setEachOld(eachOld);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.each_old
     *
     * @param eachOld the value for XF_JL_YC.each_old
     */
    public void setEachOld(Integer eachOld) {
        this.eachOld = eachOld;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.each_new
     *
     * @return the value of XF_JL_YC.each_new
     */
    public Integer getEachNew() {
        return eachNew;
    }

    /**
     */
    public XfJlYcEntity withEachNew(Integer eachNew) {
        this.setEachNew(eachNew);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.each_new
     *
     * @param eachNew the value for XF_JL_YC.each_new
     */
    public void setEachNew(Integer eachNew) {
        this.eachNew = eachNew;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.each_unit
     *
     * @return the value of XF_JL_YC.each_unit
     */
    public Integer getEachUnit() {
        return eachUnit;
    }

    /**
     */
    public XfJlYcEntity withEachUnit(Integer eachUnit) {
        this.setEachUnit(eachUnit);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.each_unit
     *
     * @param eachUnit the value for XF_JL_YC.each_unit
     */
    public void setEachUnit(Integer eachUnit) {
        this.eachUnit = eachUnit;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.time_serial_old
     *
     * @return the value of XF_JL_YC.time_serial_old
     */
    public Integer getTimeSerialOld() {
        return timeSerialOld;
    }

    /**
     */
    public XfJlYcEntity withTimeSerialOld(Integer timeSerialOld) {
        this.setTimeSerialOld(timeSerialOld);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.time_serial_old
     *
     * @param timeSerialOld the value for XF_JL_YC.time_serial_old
     */
    public void setTimeSerialOld(Integer timeSerialOld) {
        this.timeSerialOld = timeSerialOld;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.time_no_old
     *
     * @return the value of XF_JL_YC.time_no_old
     */
    public String getTimeNoOld() {
        return timeNoOld;
    }

    /**
     */
    public XfJlYcEntity withTimeNoOld(String timeNoOld) {
        this.setTimeNoOld(timeNoOld);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.time_no_old
     *
     * @param timeNoOld the value for XF_JL_YC.time_no_old
     */
    public void setTimeNoOld(String timeNoOld) {
        this.timeNoOld = timeNoOld;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.time_serial_new
     *
     * @return the value of XF_JL_YC.time_serial_new
     */
    public Integer getTimeSerialNew() {
        return timeSerialNew;
    }

    /**
     */
    public XfJlYcEntity withTimeSerialNew(Integer timeSerialNew) {
        this.setTimeSerialNew(timeSerialNew);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.time_serial_new
     *
     * @param timeSerialNew the value for XF_JL_YC.time_serial_new
     */
    public void setTimeSerialNew(Integer timeSerialNew) {
        this.timeSerialNew = timeSerialNew;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.sj
     *
     * @return the value of XF_JL_YC.sj
     */
    public Date getSj() {
        return sj;
    }

    /**
     */
    public XfJlYcEntity withSj(Date sj) {
        this.setSj(sj);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.sj
     *
     * @param sj the value for XF_JL_YC.sj
     */
    public void setSj(Date sj) {
        this.sj = sj;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.state
     *
     * @return the value of XF_JL_YC.state
     */
    public Integer getState() {
        return state;
    }

    /**
     */
    public XfJlYcEntity withState(Integer state) {
        this.setState(state);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.state
     *
     * @param state the value for XF_JL_YC.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.gly_no
     *
     * @return the value of XF_JL_YC.gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public XfJlYcEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.gly_no
     *
     * @param glyNo the value for XF_JL_YC.gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.ident_type
     *
     * @return the value of XF_JL_YC.ident_type
     */
    public Integer getIdentType() {
        return identType;
    }

    /**
     */
    public XfJlYcEntity withIdentType(Integer identType) {
        this.setIdentType(identType);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.ident_type
     *
     * @param identType the value for XF_JL_YC.ident_type
     */
    public void setIdentType(Integer identType) {
        this.identType = identType;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.ac_pass
     *
     * @return the value of XF_JL_YC.ac_pass
     */
    public Integer getAcPass() {
        return acPass;
    }

    /**
     */
    public XfJlYcEntity withAcPass(Integer acPass) {
        this.setAcPass(acPass);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.ac_pass
     *
     * @param acPass the value for XF_JL_YC.ac_pass
     */
    public void setAcPass(Integer acPass) {
        this.acPass = acPass;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.jl_data
     *
     * @return the value of XF_JL_YC.jl_data
     */
    public String getJlData() {
        return jlData;
    }

    /**
     */
    public XfJlYcEntity withJlData(String jlData) {
        this.setJlData(jlData);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.jl_data
     *
     * @param jlData the value for XF_JL_YC.jl_data
     */
    public void setJlData(String jlData) {
        this.jlData = jlData;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.state_flag
     *
     * @return the value of XF_JL_YC.state_flag
     */
    public Integer getStateFlag() {
        return stateFlag;
    }

    /**
     */
    public XfJlYcEntity withStateFlag(Integer stateFlag) {
        this.setStateFlag(stateFlag);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.state_flag
     *
     * @param stateFlag the value for XF_JL_YC.state_flag
     */
    public void setStateFlag(Integer stateFlag) {
        this.stateFlag = stateFlag;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.jl_number
     *
     * @return the value of XF_JL_YC.jl_number
     */
    public Integer getJlNumber() {
        return jlNumber;
    }

    /**
     */
    public XfJlYcEntity withJlNumber(Integer jlNumber) {
        this.setJlNumber(jlNumber);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.jl_number
     *
     * @param jlNumber the value for XF_JL_YC.jl_number
     */
    public void setJlNumber(Integer jlNumber) {
        this.jlNumber = jlNumber;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.now_bh
     *
     * @return the value of XF_JL_YC.now_bh
     */
    public String getNowBh() {
        return nowBh;
    }

    /**
     */
    public XfJlYcEntity withNowBh(String nowBh) {
        this.setNowBh(nowBh);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.now_bh
     *
     * @param nowBh the value for XF_JL_YC.now_bh
     */
    public void setNowBh(String nowBh) {
        this.nowBh = nowBh;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.dep_serial
     *
     * @return the value of XF_JL_YC.dep_serial
     */
    public Integer getDepSerial() {
        return depSerial;
    }

    /**
     */
    public XfJlYcEntity withDepSerial(Integer depSerial) {
        this.setDepSerial(depSerial);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.dep_serial
     *
     * @param depSerial the value for XF_JL_YC.dep_serial
     */
    public void setDepSerial(Integer depSerial) {
        this.depSerial = depSerial;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.res_sub_lx
     *
     * @return the value of XF_JL_YC.res_sub_lx
     */
    public Integer getResSubLx() {
        return resSubLx;
    }

    /**
     */
    public XfJlYcEntity withResSubLx(Integer resSubLx) {
        this.setResSubLx(resSubLx);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.res_sub_lx
     *
     * @param resSubLx the value for XF_JL_YC.res_sub_lx
     */
    public void setResSubLx(Integer resSubLx) {
        this.resSubLx = resSubLx;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.res_day_sub
     *
     * @return the value of XF_JL_YC.res_day_sub
     */
    public BigDecimal getResDaySub() {
        return resDaySub;
    }

    /**
     */
    public XfJlYcEntity withResDaySub(BigDecimal resDaySub) {
        this.setResDaySub(resDaySub);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.res_day_sub
     *
     * @param resDaySub the value for XF_JL_YC.res_day_sub
     */
    public void setResDaySub(BigDecimal resDaySub) {
        this.resDaySub = resDaySub;
    }

    /**
     * This method returns the value of the database column XF_JL_YC.add_gly
     *
     * @return the value of XF_JL_YC.add_gly
     */
    public String getAddGly() {
        return addGly;
    }

    /**
     */
    public XfJlYcEntity withAddGly(String addGly) {
        this.setAddGly(addGly);
        return this;
    }

    /**
     * This method sets the value of the database column XF_JL_YC.add_gly
     *
     * @param addGly the value for XF_JL_YC.add_gly
     */
    public void setAddGly(String addGly) {
        this.addGly = addGly;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}