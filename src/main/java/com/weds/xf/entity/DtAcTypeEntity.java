package com.weds.xf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

public class DtAcTypeEntity implements Serializable {
    /**
     *
     */
    @Size(max = 16)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String acBh;

    /**
     *
     */
    @Size(max = 100)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String acName;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer moneyType;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal regMoney;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer regManage;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer regRatio;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acLimit;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:15:05", value = "")
    private Date acJssj;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String acPass;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String acPassRule;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private BigDecimal acSubsidy;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acSubRule;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acSubLimit;

    /**
     *
     */
    @Size(max = 10)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String discountRate;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal moneyMax;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal moneyMin;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal dayMaxM;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer dayMaxT;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private BigDecimal mealMaxM;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private BigDecimal mealMaxT;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal timeMaxM;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acUnit;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acSubUnit;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acEarmark;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acSubAuto;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal subMoney;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal acOverdraw;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal subMaxM;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal makeMaxM;

    /**
     *是否允许时段外消费
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acTimeState;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acEach;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acEachRule;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acTimeOffset;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acTimeType;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal acTimeDay;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acTimeMould;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer passMax;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer tallyMaxM;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer tallyMaxT;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String acRegserial;

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
    private Integer acTimeeachType;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acTimeeachDay;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acTimeeachMould;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acEachAuto;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column dt_ac_type.ac_bh
     *
     * @return the value of dt_ac_type.ac_bh
     */
    public String getAcBh() {
        return acBh;
    }

    /**
     */
    public DtAcTypeEntity withAcBh(String acBh) {
        this.setAcBh(acBh);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_bh
     *
     * @param acBh the value for dt_ac_type.ac_bh
     */
    public void setAcBh(String acBh) {
        this.acBh = acBh;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_name
     *
     * @return the value of dt_ac_type.ac_name
     */
    public String getAcName() {
        return acName;
    }

    /**
     */
    public DtAcTypeEntity withAcName(String acName) {
        this.setAcName(acName);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_name
     *
     * @param acName the value for dt_ac_type.ac_name
     */
    public void setAcName(String acName) {
        this.acName = acName;
    }

    /**
     * This method returns the value of the database column dt_ac_type.money_type
     *
     * @return the value of dt_ac_type.money_type
     */
    public Integer getMoneyType() {
        return moneyType;
    }

    /**
     */
    public DtAcTypeEntity withMoneyType(Integer moneyType) {
        this.setMoneyType(moneyType);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.money_type
     *
     * @param moneyType the value for dt_ac_type.money_type
     */
    public void setMoneyType(Integer moneyType) {
        this.moneyType = moneyType;
    }

    /**
     * This method returns the value of the database column dt_ac_type.reg_money
     *
     * @return the value of dt_ac_type.reg_money
     */
    public BigDecimal getRegMoney() {
        return regMoney;
    }

    /**
     */
    public DtAcTypeEntity withRegMoney(BigDecimal regMoney) {
        this.setRegMoney(regMoney);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.reg_money
     *
     * @param regMoney the value for dt_ac_type.reg_money
     */
    public void setRegMoney(BigDecimal regMoney) {
        this.regMoney = regMoney;
    }

    /**
     * This method returns the value of the database column dt_ac_type.reg_manage
     *
     * @return the value of dt_ac_type.reg_manage
     */
    public Integer getRegManage() {
        return regManage;
    }

    /**
     */
    public DtAcTypeEntity withRegManage(Integer regManage) {
        this.setRegManage(regManage);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.reg_manage
     *
     * @param regManage the value for dt_ac_type.reg_manage
     */
    public void setRegManage(Integer regManage) {
        this.regManage = regManage;
    }

    /**
     * This method returns the value of the database column dt_ac_type.reg_ratio
     *
     * @return the value of dt_ac_type.reg_ratio
     */
    public Integer getRegRatio() {
        return regRatio;
    }

    /**
     */
    public DtAcTypeEntity withRegRatio(Integer regRatio) {
        this.setRegRatio(regRatio);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.reg_ratio
     *
     * @param regRatio the value for dt_ac_type.reg_ratio
     */
    public void setRegRatio(Integer regRatio) {
        this.regRatio = regRatio;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_limit
     *
     * @return the value of dt_ac_type.ac_limit
     */
    public Integer getAcLimit() {
        return acLimit;
    }

    /**
     */
    public DtAcTypeEntity withAcLimit(Integer acLimit) {
        this.setAcLimit(acLimit);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_limit
     *
     * @param acLimit the value for dt_ac_type.ac_limit
     */
    public void setAcLimit(Integer acLimit) {
        this.acLimit = acLimit;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_jssj
     *
     * @return the value of dt_ac_type.ac_jssj
     */
    public Date getAcJssj() {
        return acJssj;
    }

    /**
     */
    public DtAcTypeEntity withAcJssj(Date acJssj) {
        this.setAcJssj(acJssj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_jssj
     *
     * @param acJssj the value for dt_ac_type.ac_jssj
     */
    public void setAcJssj(Date acJssj) {
        this.acJssj = acJssj;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_pass
     *
     * @return the value of dt_ac_type.ac_pass
     */
    public String getAcPass() {
        return acPass;
    }

    /**
     */
    public DtAcTypeEntity withAcPass(String acPass) {
        this.setAcPass(acPass);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_pass
     *
     * @param acPass the value for dt_ac_type.ac_pass
     */
    public void setAcPass(String acPass) {
        this.acPass = acPass;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_pass_rule
     *
     * @return the value of dt_ac_type.ac_pass_rule
     */
    public String getAcPassRule() {
        return acPassRule;
    }

    /**
     */
    public DtAcTypeEntity withAcPassRule(String acPassRule) {
        this.setAcPassRule(acPassRule);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_pass_rule
     *
     * @param acPassRule the value for dt_ac_type.ac_pass_rule
     */
    public void setAcPassRule(String acPassRule) {
        this.acPassRule = acPassRule;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_subsidy
     *
     * @return the value of dt_ac_type.ac_subsidy
     */
    public BigDecimal getAcSubsidy() {
        return acSubsidy;
    }

    /**
     */
    public DtAcTypeEntity withAcSubsidy(BigDecimal acSubsidy) {
        this.setAcSubsidy(acSubsidy);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_subsidy
     *
     * @param acSubsidy the value for dt_ac_type.ac_subsidy
     */
    public void setAcSubsidy(BigDecimal acSubsidy) {
        this.acSubsidy = acSubsidy;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_sub_rule
     *
     * @return the value of dt_ac_type.ac_sub_rule
     */
    public Integer getAcSubRule() {
        return acSubRule;
    }

    /**
     */
    public DtAcTypeEntity withAcSubRule(Integer acSubRule) {
        this.setAcSubRule(acSubRule);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_sub_rule
     *
     * @param acSubRule the value for dt_ac_type.ac_sub_rule
     */
    public void setAcSubRule(Integer acSubRule) {
        this.acSubRule = acSubRule;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_sub_limit
     *
     * @return the value of dt_ac_type.ac_sub_limit
     */
    public Integer getAcSubLimit() {
        return acSubLimit;
    }

    /**
     */
    public DtAcTypeEntity withAcSubLimit(Integer acSubLimit) {
        this.setAcSubLimit(acSubLimit);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_sub_limit
     *
     * @param acSubLimit the value for dt_ac_type.ac_sub_limit
     */
    public void setAcSubLimit(Integer acSubLimit) {
        this.acSubLimit = acSubLimit;
    }

    /**
     * This method returns the value of the database column dt_ac_type.discount_rate
     *
     * @return the value of dt_ac_type.discount_rate
     */
    public String getDiscountRate() {
        return discountRate;
    }

    /**
     */
    public DtAcTypeEntity withDiscountRate(String discountRate) {
        this.setDiscountRate(discountRate);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.discount_rate
     *
     * @param discountRate the value for dt_ac_type.discount_rate
     */
    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }

    /**
     * This method returns the value of the database column dt_ac_type.money_max
     *
     * @return the value of dt_ac_type.money_max
     */
    public BigDecimal getMoneyMax() {
        return moneyMax;
    }

    /**
     */
    public DtAcTypeEntity withMoneyMax(BigDecimal moneyMax) {
        this.setMoneyMax(moneyMax);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.money_max
     *
     * @param moneyMax the value for dt_ac_type.money_max
     */
    public void setMoneyMax(BigDecimal moneyMax) {
        this.moneyMax = moneyMax;
    }

    /**
     * This method returns the value of the database column dt_ac_type.money_min
     *
     * @return the value of dt_ac_type.money_min
     */
    public BigDecimal getMoneyMin() {
        return moneyMin;
    }

    /**
     */
    public DtAcTypeEntity withMoneyMin(BigDecimal moneyMin) {
        this.setMoneyMin(moneyMin);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.money_min
     *
     * @param moneyMin the value for dt_ac_type.money_min
     */
    public void setMoneyMin(BigDecimal moneyMin) {
        this.moneyMin = moneyMin;
    }

    /**
     * This method returns the value of the database column dt_ac_type.day_max_m
     *
     * @return the value of dt_ac_type.day_max_m
     */
    public BigDecimal getDayMaxM() {
        return dayMaxM;
    }

    /**
     */
    public DtAcTypeEntity withDayMaxM(BigDecimal dayMaxM) {
        this.setDayMaxM(dayMaxM);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.day_max_m
     *
     * @param dayMaxM the value for dt_ac_type.day_max_m
     */
    public void setDayMaxM(BigDecimal dayMaxM) {
        this.dayMaxM = dayMaxM;
    }

    /**
     * This method returns the value of the database column dt_ac_type.day_max_t
     *
     * @return the value of dt_ac_type.day_max_t
     */
    public Integer getDayMaxT() {
        return dayMaxT;
    }

    /**
     */
    public DtAcTypeEntity withDayMaxT(Integer dayMaxT) {
        this.setDayMaxT(dayMaxT);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.day_max_t
     *
     * @param dayMaxT the value for dt_ac_type.day_max_t
     */
    public void setDayMaxT(Integer dayMaxT) {
        this.dayMaxT = dayMaxT;
    }

    /**
     * This method returns the value of the database column dt_ac_type.meal_max_m
     *
     * @return the value of dt_ac_type.meal_max_m
     */
    public BigDecimal getMealMaxM() {
        return mealMaxM;
    }

    /**
     */
    public DtAcTypeEntity withMealMaxM(BigDecimal mealMaxM) {
        this.setMealMaxM(mealMaxM);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.meal_max_m
     *
     * @param mealMaxM the value for dt_ac_type.meal_max_m
     */
    public void setMealMaxM(BigDecimal mealMaxM) {
        this.mealMaxM = mealMaxM;
    }

    /**
     * This method returns the value of the database column dt_ac_type.meal_max_t
     *
     * @return the value of dt_ac_type.meal_max_t
     */
    public BigDecimal getMealMaxT() {
        return mealMaxT;
    }

    /**
     */
    public DtAcTypeEntity withMealMaxT(BigDecimal mealMaxT) {
        this.setMealMaxT(mealMaxT);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.meal_max_t
     *
     * @param mealMaxT the value for dt_ac_type.meal_max_t
     */
    public void setMealMaxT(BigDecimal mealMaxT) {
        this.mealMaxT = mealMaxT;
    }

    /**
     * This method returns the value of the database column dt_ac_type.time_max_m
     *
     * @return the value of dt_ac_type.time_max_m
     */
    public BigDecimal getTimeMaxM() {
        return timeMaxM;
    }

    /**
     */
    public DtAcTypeEntity withTimeMaxM(BigDecimal timeMaxM) {
        this.setTimeMaxM(timeMaxM);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.time_max_m
     *
     * @param timeMaxM the value for dt_ac_type.time_max_m
     */
    public void setTimeMaxM(BigDecimal timeMaxM) {
        this.timeMaxM = timeMaxM;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_unit
     *
     * @return the value of dt_ac_type.ac_unit
     */
    public Integer getAcUnit() {
        return acUnit;
    }

    /**
     */
    public DtAcTypeEntity withAcUnit(Integer acUnit) {
        this.setAcUnit(acUnit);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_unit
     *
     * @param acUnit the value for dt_ac_type.ac_unit
     */
    public void setAcUnit(Integer acUnit) {
        this.acUnit = acUnit;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_sub_unit
     *
     * @return the value of dt_ac_type.ac_sub_unit
     */
    public Integer getAcSubUnit() {
        return acSubUnit;
    }

    /**
     */
    public DtAcTypeEntity withAcSubUnit(Integer acSubUnit) {
        this.setAcSubUnit(acSubUnit);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_sub_unit
     *
     * @param acSubUnit the value for dt_ac_type.ac_sub_unit
     */
    public void setAcSubUnit(Integer acSubUnit) {
        this.acSubUnit = acSubUnit;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_earmark
     *
     * @return the value of dt_ac_type.ac_earmark
     */
    public Integer getAcEarmark() {
        return acEarmark;
    }

    /**
     */
    public DtAcTypeEntity withAcEarmark(Integer acEarmark) {
        this.setAcEarmark(acEarmark);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_earmark
     *
     * @param acEarmark the value for dt_ac_type.ac_earmark
     */
    public void setAcEarmark(Integer acEarmark) {
        this.acEarmark = acEarmark;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_sub_auto
     *
     * @return the value of dt_ac_type.ac_sub_auto
     */
    public Integer getAcSubAuto() {
        return acSubAuto;
    }

    /**
     */
    public DtAcTypeEntity withAcSubAuto(Integer acSubAuto) {
        this.setAcSubAuto(acSubAuto);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_sub_auto
     *
     * @param acSubAuto the value for dt_ac_type.ac_sub_auto
     */
    public void setAcSubAuto(Integer acSubAuto) {
        this.acSubAuto = acSubAuto;
    }

    /**
     * This method returns the value of the database column dt_ac_type.sub_money
     *
     * @return the value of dt_ac_type.sub_money
     */
    public BigDecimal getSubMoney() {
        return subMoney;
    }

    /**
     */
    public DtAcTypeEntity withSubMoney(BigDecimal subMoney) {
        this.setSubMoney(subMoney);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.sub_money
     *
     * @param subMoney the value for dt_ac_type.sub_money
     */
    public void setSubMoney(BigDecimal subMoney) {
        this.subMoney = subMoney;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_overdraw
     *
     * @return the value of dt_ac_type.ac_overdraw
     */
    public BigDecimal getAcOverdraw() {
        return acOverdraw;
    }

    /**
     */
    public DtAcTypeEntity withAcOverdraw(BigDecimal acOverdraw) {
        this.setAcOverdraw(acOverdraw);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_overdraw
     *
     * @param acOverdraw the value for dt_ac_type.ac_overdraw
     */
    public void setAcOverdraw(BigDecimal acOverdraw) {
        this.acOverdraw = acOverdraw;
    }

    /**
     * This method returns the value of the database column dt_ac_type.sub_max_m
     *
     * @return the value of dt_ac_type.sub_max_m
     */
    public BigDecimal getSubMaxM() {
        return subMaxM;
    }

    /**
     */
    public DtAcTypeEntity withSubMaxM(BigDecimal subMaxM) {
        this.setSubMaxM(subMaxM);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.sub_max_m
     *
     * @param subMaxM the value for dt_ac_type.sub_max_m
     */
    public void setSubMaxM(BigDecimal subMaxM) {
        this.subMaxM = subMaxM;
    }

    /**
     * This method returns the value of the database column dt_ac_type.make_max_m
     *
     * @return the value of dt_ac_type.make_max_m
     */
    public BigDecimal getMakeMaxM() {
        return makeMaxM;
    }

    /**
     */
    public DtAcTypeEntity withMakeMaxM(BigDecimal makeMaxM) {
        this.setMakeMaxM(makeMaxM);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.make_max_m
     *
     * @param makeMaxM the value for dt_ac_type.make_max_m
     */
    public void setMakeMaxM(BigDecimal makeMaxM) {
        this.makeMaxM = makeMaxM;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_time_state
     *
     * @return the value of dt_ac_type.ac_time_state
     */
    public Integer getAcTimeState() {
        return acTimeState;
    }

    /**
     */
    public DtAcTypeEntity withAcTimeState(Integer acTimeState) {
        this.setAcTimeState(acTimeState);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_time_state
     *
     * @param acTimeState the value for dt_ac_type.ac_time_state
     */
    public void setAcTimeState(Integer acTimeState) {
        this.acTimeState = acTimeState;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_each
     *
     * @return the value of dt_ac_type.ac_each
     */
    public Integer getAcEach() {
        return acEach;
    }

    /**
     */
    public DtAcTypeEntity withAcEach(Integer acEach) {
        this.setAcEach(acEach);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_each
     *
     * @param acEach the value for dt_ac_type.ac_each
     */
    public void setAcEach(Integer acEach) {
        this.acEach = acEach;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_each_rule
     *
     * @return the value of dt_ac_type.ac_each_rule
     */
    public Integer getAcEachRule() {
        return acEachRule;
    }

    /**
     */
    public DtAcTypeEntity withAcEachRule(Integer acEachRule) {
        this.setAcEachRule(acEachRule);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_each_rule
     *
     * @param acEachRule the value for dt_ac_type.ac_each_rule
     */
    public void setAcEachRule(Integer acEachRule) {
        this.acEachRule = acEachRule;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_time_offset
     *
     * @return the value of dt_ac_type.ac_time_offset
     */
    public Integer getAcTimeOffset() {
        return acTimeOffset;
    }

    /**
     */
    public DtAcTypeEntity withAcTimeOffset(Integer acTimeOffset) {
        this.setAcTimeOffset(acTimeOffset);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_time_offset
     *
     * @param acTimeOffset the value for dt_ac_type.ac_time_offset
     */
    public void setAcTimeOffset(Integer acTimeOffset) {
        this.acTimeOffset = acTimeOffset;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_time_type
     *
     * @return the value of dt_ac_type.ac_time_type
     */
    public Integer getAcTimeType() {
        return acTimeType;
    }

    /**
     */
    public DtAcTypeEntity withAcTimeType(Integer acTimeType) {
        this.setAcTimeType(acTimeType);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_time_type
     *
     * @param acTimeType the value for dt_ac_type.ac_time_type
     */
    public void setAcTimeType(Integer acTimeType) {
        this.acTimeType = acTimeType;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_time_day
     *
     * @return the value of dt_ac_type.ac_time_day
     */
    public BigDecimal getAcTimeDay() {
        return acTimeDay;
    }

    /**
     */
    public DtAcTypeEntity withAcTimeDay(BigDecimal acTimeDay) {
        this.setAcTimeDay(acTimeDay);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_time_day
     *
     * @param acTimeDay the value for dt_ac_type.ac_time_day
     */
    public void setAcTimeDay(BigDecimal acTimeDay) {
        this.acTimeDay = acTimeDay;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_time_mould
     *
     * @return the value of dt_ac_type.ac_time_mould
     */
    public Integer getAcTimeMould() {
        return acTimeMould;
    }

    /**
     */
    public DtAcTypeEntity withAcTimeMould(Integer acTimeMould) {
        this.setAcTimeMould(acTimeMould);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_time_mould
     *
     * @param acTimeMould the value for dt_ac_type.ac_time_mould
     */
    public void setAcTimeMould(Integer acTimeMould) {
        this.acTimeMould = acTimeMould;
    }

    /**
     * This method returns the value of the database column dt_ac_type.pass_max
     *
     * @return the value of dt_ac_type.pass_max
     */
    public Integer getPassMax() {
        return passMax;
    }

    /**
     */
    public DtAcTypeEntity withPassMax(Integer passMax) {
        this.setPassMax(passMax);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.pass_max
     *
     * @param passMax the value for dt_ac_type.pass_max
     */
    public void setPassMax(Integer passMax) {
        this.passMax = passMax;
    }

    /**
     * This method returns the value of the database column dt_ac_type.tally_max_m
     *
     * @return the value of dt_ac_type.tally_max_m
     */
    public Integer getTallyMaxM() {
        return tallyMaxM;
    }

    /**
     */
    public DtAcTypeEntity withTallyMaxM(Integer tallyMaxM) {
        this.setTallyMaxM(tallyMaxM);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.tally_max_m
     *
     * @param tallyMaxM the value for dt_ac_type.tally_max_m
     */
    public void setTallyMaxM(Integer tallyMaxM) {
        this.tallyMaxM = tallyMaxM;
    }

    /**
     * This method returns the value of the database column dt_ac_type.tally_max_t
     *
     * @return the value of dt_ac_type.tally_max_t
     */
    public Integer getTallyMaxT() {
        return tallyMaxT;
    }

    /**
     */
    public DtAcTypeEntity withTallyMaxT(Integer tallyMaxT) {
        this.setTallyMaxT(tallyMaxT);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.tally_max_t
     *
     * @param tallyMaxT the value for dt_ac_type.tally_max_t
     */
    public void setTallyMaxT(Integer tallyMaxT) {
        this.tallyMaxT = tallyMaxT;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_regserial
     *
     * @return the value of dt_ac_type.ac_regserial
     */
    public String getAcRegserial() {
        return acRegserial;
    }

    /**
     */
    public DtAcTypeEntity withAcRegserial(String acRegserial) {
        this.setAcRegserial(acRegserial);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_regserial
     *
     * @param acRegserial the value for dt_ac_type.ac_regserial
     */
    public void setAcRegserial(String acRegserial) {
        this.acRegserial = acRegserial;
    }

    /**
     * This method returns the value of the database column dt_ac_type.regserial
     *
     * @return the value of dt_ac_type.regserial
     */
    public String getRegserial() {
        return regserial;
    }

    /**
     */
    public DtAcTypeEntity withRegserial(String regserial) {
        this.setRegserial(regserial);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.regserial
     *
     * @param regserial the value for dt_ac_type.regserial
     */
    public void setRegserial(String regserial) {
        this.regserial = regserial;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_timeeach_type
     *
     * @return the value of dt_ac_type.ac_timeeach_type
     */
    public Integer getAcTimeeachType() {
        return acTimeeachType;
    }

    /**
     */
    public DtAcTypeEntity withAcTimeeachType(Integer acTimeeachType) {
        this.setAcTimeeachType(acTimeeachType);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_timeeach_type
     *
     * @param acTimeeachType the value for dt_ac_type.ac_timeeach_type
     */
    public void setAcTimeeachType(Integer acTimeeachType) {
        this.acTimeeachType = acTimeeachType;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_timeeach_day
     *
     * @return the value of dt_ac_type.ac_timeeach_day
     */
    public Integer getAcTimeeachDay() {
        return acTimeeachDay;
    }

    /**
     */
    public DtAcTypeEntity withAcTimeeachDay(Integer acTimeeachDay) {
        this.setAcTimeeachDay(acTimeeachDay);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_timeeach_day
     *
     * @param acTimeeachDay the value for dt_ac_type.ac_timeeach_day
     */
    public void setAcTimeeachDay(Integer acTimeeachDay) {
        this.acTimeeachDay = acTimeeachDay;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_timeeach_mould
     *
     * @return the value of dt_ac_type.ac_timeeach_mould
     */
    public Integer getAcTimeeachMould() {
        return acTimeeachMould;
    }

    /**
     */
    public DtAcTypeEntity withAcTimeeachMould(Integer acTimeeachMould) {
        this.setAcTimeeachMould(acTimeeachMould);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_timeeach_mould
     *
     * @param acTimeeachMould the value for dt_ac_type.ac_timeeach_mould
     */
    public void setAcTimeeachMould(Integer acTimeeachMould) {
        this.acTimeeachMould = acTimeeachMould;
    }

    /**
     * This method returns the value of the database column dt_ac_type.ac_each_auto
     *
     * @return the value of dt_ac_type.ac_each_auto
     */
    public Integer getAcEachAuto() {
        return acEachAuto;
    }

    /**
     */
    public DtAcTypeEntity withAcEachAuto(Integer acEachAuto) {
        this.setAcEachAuto(acEachAuto);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_type.ac_each_auto
     *
     * @param acEachAuto the value for dt_ac_type.ac_each_auto
     */
    public void setAcEachAuto(Integer acEachAuto) {
        this.acEachAuto = acEachAuto;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}