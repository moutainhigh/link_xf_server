package com.weds.xf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

public class XfJlEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer xh;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer lx;

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:22:26", value = "")
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:22:26", value = "")
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
    @Size(max = 8)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String cardSerial;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer type;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer state;

    /**
     *
     */
    @Size(max = 16)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String timeNo;

    /**
     *
     */
    @Size(max = 16)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String timeOrder;

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
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer mould;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer depSerial;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Long acdepSerial;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal corMoney;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal corSub;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column xf_jl.xh
     *
     * @return the value of xf_jl.xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public XfJlEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.xh
     *
     * @param xh the value for xf_jl.xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column xf_jl.lx
     *
     * @return the value of xf_jl.lx
     */
    public Integer getLx() {
        return lx;
    }

    /**
     */
    public XfJlEntity withLx(Integer lx) {
        this.setLx(lx);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.lx
     *
     * @param lx the value for xf_jl.lx
     */
    public void setLx(Integer lx) {
        this.lx = lx;
    }

    /**
     * This method returns the value of the database column xf_jl.jl_bh
     *
     * @return the value of xf_jl.jl_bh
     */
    public String getJlBh() {
        return jlBh;
    }

    /**
     */
    public XfJlEntity withJlBh(String jlBh) {
        this.setJlBh(jlBh);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.jl_bh
     *
     * @param jlBh the value for xf_jl.jl_bh
     */
    public void setJlBh(String jlBh) {
        this.jlBh = jlBh;
    }

    /**
     * This method returns the value of the database column xf_jl.dev_serial
     *
     * @return the value of xf_jl.dev_serial
     */
    public String getDevSerial() {
        return devSerial;
    }

    /**
     */
    public XfJlEntity withDevSerial(String devSerial) {
        this.setDevSerial(devSerial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.dev_serial
     *
     * @param devSerial the value for xf_jl.dev_serial
     */
    public void setDevSerial(String devSerial) {
        this.devSerial = devSerial;
    }

    /**
     * This method returns the value of the database column xf_jl.user_serial
     *
     * @return the value of xf_jl.user_serial
     */
    public Long getUserSerial() {
        return userSerial;
    }

    /**
     */
    public XfJlEntity withUserSerial(Long userSerial) {
        this.setUserSerial(userSerial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.user_serial
     *
     * @param userSerial the value for xf_jl.user_serial
     */
    public void setUserSerial(Long userSerial) {
        this.userSerial = userSerial;
    }

    /**
     * This method returns the value of the database column xf_jl.user_card
     *
     * @return the value of xf_jl.user_card
     */
    public String getUserCard() {
        return userCard;
    }

    /**
     */
    public XfJlEntity withUserCard(String userCard) {
        this.setUserCard(userCard);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.user_card
     *
     * @param userCard the value for xf_jl.user_card
     */
    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }

    /**
     * This method returns the value of the database column xf_jl.sam_serial
     *
     * @return the value of xf_jl.sam_serial
     */
    public String getSamSerial() {
        return samSerial;
    }

    /**
     */
    public XfJlEntity withSamSerial(String samSerial) {
        this.setSamSerial(samSerial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.sam_serial
     *
     * @param samSerial the value for xf_jl.sam_serial
     */
    public void setSamSerial(String samSerial) {
        this.samSerial = samSerial;
    }

    /**
     * This method returns the value of the database column xf_jl.old_money
     *
     * @return the value of xf_jl.old_money
     */
    public BigDecimal getOldMoney() {
        return oldMoney;
    }

    /**
     */
    public XfJlEntity withOldMoney(BigDecimal oldMoney) {
        this.setOldMoney(oldMoney);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.old_money
     *
     * @param oldMoney the value for xf_jl.old_money
     */
    public void setOldMoney(BigDecimal oldMoney) {
        this.oldMoney = oldMoney;
    }

    /**
     * This method returns the value of the database column xf_jl.new_money
     *
     * @return the value of xf_jl.new_money
     */
    public BigDecimal getNewMoney() {
        return newMoney;
    }

    /**
     */
    public XfJlEntity withNewMoney(BigDecimal newMoney) {
        this.setNewMoney(newMoney);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.new_money
     *
     * @param newMoney the value for xf_jl.new_money
     */
    public void setNewMoney(BigDecimal newMoney) {
        this.newMoney = newMoney;
    }

    /**
     * This method returns the value of the database column xf_jl.jl_sj
     *
     * @return the value of xf_jl.jl_sj
     */
    public Date getJlSj() {
        return jlSj;
    }

    /**
     */
    public XfJlEntity withJlSj(Date jlSj) {
        this.setJlSj(jlSj);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.jl_sj
     *
     * @param jlSj the value for xf_jl.jl_sj
     */
    public void setJlSj(Date jlSj) {
        this.jlSj = jlSj;
    }

    /**
     * This method returns the value of the database column xf_jl.jl_count
     *
     * @return the value of xf_jl.jl_count
     */
    public Integer getJlCount() {
        return jlCount;
    }

    /**
     */
    public XfJlEntity withJlCount(Integer jlCount) {
        this.setJlCount(jlCount);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.jl_count
     *
     * @param jlCount the value for xf_jl.jl_count
     */
    public void setJlCount(Integer jlCount) {
        this.jlCount = jlCount;
    }

    /**
     * This method returns the value of the database column xf_jl.sub_xh
     *
     * @return the value of xf_jl.sub_xh
     */
    public Integer getSubXh() {
        return subXh;
    }

    /**
     */
    public XfJlEntity withSubXh(Integer subXh) {
        this.setSubXh(subXh);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.sub_xh
     *
     * @param subXh the value for xf_jl.sub_xh
     */
    public void setSubXh(Integer subXh) {
        this.subXh = subXh;
    }

    /**
     * This method returns the value of the database column xf_jl.sj
     *
     * @return the value of xf_jl.sj
     */
    public Date getSj() {
        return sj;
    }

    /**
     */
    public XfJlEntity withSj(Date sj) {
        this.setSj(sj);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.sj
     *
     * @param sj the value for xf_jl.sj
     */
    public void setSj(Date sj) {
        this.sj = sj;
    }

    /**
     * This method returns the value of the database column xf_jl.gly_no
     *
     * @return the value of xf_jl.gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public XfJlEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.gly_no
     *
     * @param glyNo the value for xf_jl.gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    /**
     * This method returns the value of the database column xf_jl.card_serial
     *
     * @return the value of xf_jl.card_serial
     */
    public String getCardSerial() {
        return cardSerial;
    }

    /**
     */
    public XfJlEntity withCardSerial(String cardSerial) {
        this.setCardSerial(cardSerial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.card_serial
     *
     * @param cardSerial the value for xf_jl.card_serial
     */
    public void setCardSerial(String cardSerial) {
        this.cardSerial = cardSerial;
    }

    /**
     * This method returns the value of the database column xf_jl.type
     *
     * @return the value of xf_jl.type
     */
    public Integer getType() {
        return type;
    }

    /**
     */
    public XfJlEntity withType(Integer type) {
        this.setType(type);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.type
     *
     * @param type the value for xf_jl.type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method returns the value of the database column xf_jl.state
     *
     * @return the value of xf_jl.state
     */
    public Integer getState() {
        return state;
    }

    /**
     */
    public XfJlEntity withState(Integer state) {
        this.setState(state);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.state
     *
     * @param state the value for xf_jl.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method returns the value of the database column xf_jl.time_no
     *
     * @return the value of xf_jl.time_no
     */
    public String getTimeNo() {
        return timeNo;
    }

    /**
     */
    public XfJlEntity withTimeNo(String timeNo) {
        this.setTimeNo(timeNo);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.time_no
     *
     * @param timeNo the value for xf_jl.time_no
     */
    public void setTimeNo(String timeNo) {
        this.timeNo = timeNo;
    }

    /**
     * This method returns the value of the database column xf_jl.time_order
     *
     * @return the value of xf_jl.time_order
     */
    public String getTimeOrder() {
        return timeOrder;
    }

    /**
     */
    public XfJlEntity withTimeOrder(String timeOrder) {
        this.setTimeOrder(timeOrder);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.time_order
     *
     * @param timeOrder the value for xf_jl.time_order
     */
    public void setTimeOrder(String timeOrder) {
        this.timeOrder = timeOrder;
    }

    /**
     * This method returns the value of the database column xf_jl.del_type
     *
     * @return the value of xf_jl.del_type
     */
    public Integer getDelType() {
        return delType;
    }

    /**
     */
    public XfJlEntity withDelType(Integer delType) {
        this.setDelType(delType);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.del_type
     *
     * @param delType the value for xf_jl.del_type
     */
    public void setDelType(Integer delType) {
        this.delType = delType;
    }

    /**
     * This method returns the value of the database column xf_jl.sub_old
     *
     * @return the value of xf_jl.sub_old
     */
    public BigDecimal getSubOld() {
        return subOld;
    }

    /**
     */
    public XfJlEntity withSubOld(BigDecimal subOld) {
        this.setSubOld(subOld);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.sub_old
     *
     * @param subOld the value for xf_jl.sub_old
     */
    public void setSubOld(BigDecimal subOld) {
        this.subOld = subOld;
    }

    /**
     * This method returns the value of the database column xf_jl.sub_new
     *
     * @return the value of xf_jl.sub_new
     */
    public BigDecimal getSubNew() {
        return subNew;
    }

    /**
     */
    public XfJlEntity withSubNew(BigDecimal subNew) {
        this.setSubNew(subNew);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.sub_new
     *
     * @param subNew the value for xf_jl.sub_new
     */
    public void setSubNew(BigDecimal subNew) {
        this.subNew = subNew;
    }

    /**
     * This method returns the value of the database column xf_jl.each_old
     *
     * @return the value of xf_jl.each_old
     */
    public Integer getEachOld() {
        return eachOld;
    }

    /**
     */
    public XfJlEntity withEachOld(Integer eachOld) {
        this.setEachOld(eachOld);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.each_old
     *
     * @param eachOld the value for xf_jl.each_old
     */
    public void setEachOld(Integer eachOld) {
        this.eachOld = eachOld;
    }

    /**
     * This method returns the value of the database column xf_jl.each_new
     *
     * @return the value of xf_jl.each_new
     */
    public Integer getEachNew() {
        return eachNew;
    }

    /**
     */
    public XfJlEntity withEachNew(Integer eachNew) {
        this.setEachNew(eachNew);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.each_new
     *
     * @param eachNew the value for xf_jl.each_new
     */
    public void setEachNew(Integer eachNew) {
        this.eachNew = eachNew;
    }

    /**
     * This method returns the value of the database column xf_jl.each_unit
     *
     * @return the value of xf_jl.each_unit
     */
    public Integer getEachUnit() {
        return eachUnit;
    }

    /**
     */
    public XfJlEntity withEachUnit(Integer eachUnit) {
        this.setEachUnit(eachUnit);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.each_unit
     *
     * @param eachUnit the value for xf_jl.each_unit
     */
    public void setEachUnit(Integer eachUnit) {
        this.eachUnit = eachUnit;
    }

    /**
     * This method returns the value of the database column xf_jl.more_money
     *
     * @return the value of xf_jl.more_money
     */
    public BigDecimal getMoreMoney() {
        return moreMoney;
    }

    /**
     */
    public XfJlEntity withMoreMoney(BigDecimal moreMoney) {
        this.setMoreMoney(moreMoney);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.more_money
     *
     * @param moreMoney the value for xf_jl.more_money
     */
    public void setMoreMoney(BigDecimal moreMoney) {
        this.moreMoney = moreMoney;
    }

    /**
     * This method returns the value of the database column xf_jl.discount_rate
     *
     * @return the value of xf_jl.discount_rate
     */
    public Integer getDiscountRate() {
        return discountRate;
    }

    /**
     */
    public XfJlEntity withDiscountRate(Integer discountRate) {
        this.setDiscountRate(discountRate);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.discount_rate
     *
     * @param discountRate the value for xf_jl.discount_rate
     */
    public void setDiscountRate(Integer discountRate) {
        this.discountRate = discountRate;
    }

    /**
     * This method returns the value of the database column xf_jl.mould
     *
     * @return the value of xf_jl.mould
     */
    public Integer getMould() {
        return mould;
    }

    /**
     */
    public XfJlEntity withMould(Integer mould) {
        this.setMould(mould);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.mould
     *
     * @param mould the value for xf_jl.mould
     */
    public void setMould(Integer mould) {
        this.mould = mould;
    }

    /**
     * This method returns the value of the database column xf_jl.dep_serial
     *
     * @return the value of xf_jl.dep_serial
     */
    public Integer getDepSerial() {
        return depSerial;
    }

    /**
     */
    public XfJlEntity withDepSerial(Integer depSerial) {
        this.setDepSerial(depSerial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.dep_serial
     *
     * @param depSerial the value for xf_jl.dep_serial
     */
    public void setDepSerial(Integer depSerial) {
        this.depSerial = depSerial;
    }

    /**
     * This method returns the value of the database column xf_jl.acdep_serial
     *
     * @return the value of xf_jl.acdep_serial
     */
    public Long getAcdepSerial() {
        return acdepSerial;
    }

    /**
     */
    public XfJlEntity withAcdepSerial(Long acdepSerial) {
        this.setAcdepSerial(acdepSerial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.acdep_serial
     *
     * @param acdepSerial the value for xf_jl.acdep_serial
     */
    public void setAcdepSerial(Long acdepSerial) {
        this.acdepSerial = acdepSerial;
    }

    /**
     * This method returns the value of the database column xf_jl.cor_money
     *
     * @return the value of xf_jl.cor_money
     */
    public BigDecimal getCorMoney() {
        return corMoney;
    }

    /**
     */
    public XfJlEntity withCorMoney(BigDecimal corMoney) {
        this.setCorMoney(corMoney);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.cor_money
     *
     * @param corMoney the value for xf_jl.cor_money
     */
    public void setCorMoney(BigDecimal corMoney) {
        this.corMoney = corMoney;
    }

    /**
     * This method returns the value of the database column xf_jl.cor_sub
     *
     * @return the value of xf_jl.cor_sub
     */
    public BigDecimal getCorSub() {
        return corSub;
    }

    /**
     */
    public XfJlEntity withCorSub(BigDecimal corSub) {
        this.setCorSub(corSub);
        return this;
    }

    /**
     * This method sets the value of the database column xf_jl.cor_sub
     *
     * @param corSub the value for xf_jl.cor_sub
     */
    public void setCorSub(BigDecimal corSub) {
        this.corSub = corSub;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}