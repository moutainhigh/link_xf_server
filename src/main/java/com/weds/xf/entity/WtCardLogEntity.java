package com.weds.xf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

public class WtCardLogEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer xh;

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
    private Integer lx;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer logType;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer logState;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer logLx;

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
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String cardOld;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String cardNew;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer logXh;

    /**
     *
     */
    @Size(max = 16)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String logGroup;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer logRow;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer logErro;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String bz;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:19:40", value = "")
    private Date logSj;

    /**
     *
     */
    @Size(max = 30)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String logIp;

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
    private Integer jlCount;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String payV2;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer payOld;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer payLjcount;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer payLjmoney;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String importNo;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column WT_CARD_LOG.Xh
     *
     * @return the value of WT_CARD_LOG.Xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public WtCardLogEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Xh
     *
     * @param xh the value for WT_CARD_LOG.Xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.Regserial
     *
     * @return the value of WT_CARD_LOG.Regserial
     */
    public String getRegserial() {
        return regserial;
    }

    /**
     */
    public WtCardLogEntity withRegserial(String regserial) {
        this.setRegserial(regserial);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Regserial
     *
     * @param regserial the value for WT_CARD_LOG.Regserial
     */
    public void setRegserial(String regserial) {
        this.regserial = regserial;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.Lx
     *
     * @return the value of WT_CARD_LOG.Lx
     */
    public Integer getLx() {
        return lx;
    }

    /**
     */
    public WtCardLogEntity withLx(Integer lx) {
        this.setLx(lx);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Lx
     *
     * @param lx the value for WT_CARD_LOG.Lx
     */
    public void setLx(Integer lx) {
        this.lx = lx;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.Log_type
     *
     * @return the value of WT_CARD_LOG.Log_type
     */
    public Integer getLogType() {
        return logType;
    }

    /**
     */
    public WtCardLogEntity withLogType(Integer logType) {
        this.setLogType(logType);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Log_type
     *
     * @param logType the value for WT_CARD_LOG.Log_type
     */
    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.Log_state
     *
     * @return the value of WT_CARD_LOG.Log_state
     */
    public Integer getLogState() {
        return logState;
    }

    /**
     */
    public WtCardLogEntity withLogState(Integer logState) {
        this.setLogState(logState);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Log_state
     *
     * @param logState the value for WT_CARD_LOG.Log_state
     */
    public void setLogState(Integer logState) {
        this.logState = logState;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.Log_lx
     *
     * @return the value of WT_CARD_LOG.Log_lx
     */
    public Integer getLogLx() {
        return logLx;
    }

    /**
     */
    public WtCardLogEntity withLogLx(Integer logLx) {
        this.setLogLx(logLx);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Log_lx
     *
     * @param logLx the value for WT_CARD_LOG.Log_lx
     */
    public void setLogLx(Integer logLx) {
        this.logLx = logLx;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.User_serial
     *
     * @return the value of WT_CARD_LOG.User_serial
     */
    public Long getUserSerial() {
        return userSerial;
    }

    /**
     */
    public WtCardLogEntity withUserSerial(Long userSerial) {
        this.setUserSerial(userSerial);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.User_serial
     *
     * @param userSerial the value for WT_CARD_LOG.User_serial
     */
    public void setUserSerial(Long userSerial) {
        this.userSerial = userSerial;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.Dev_serial
     *
     * @return the value of WT_CARD_LOG.Dev_serial
     */
    public String getDevSerial() {
        return devSerial;
    }

    /**
     */
    public WtCardLogEntity withDevSerial(String devSerial) {
        this.setDevSerial(devSerial);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Dev_serial
     *
     * @param devSerial the value for WT_CARD_LOG.Dev_serial
     */
    public void setDevSerial(String devSerial) {
        this.devSerial = devSerial;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.Card_old
     *
     * @return the value of WT_CARD_LOG.Card_old
     */
    public String getCardOld() {
        return cardOld;
    }

    /**
     */
    public WtCardLogEntity withCardOld(String cardOld) {
        this.setCardOld(cardOld);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Card_old
     *
     * @param cardOld the value for WT_CARD_LOG.Card_old
     */
    public void setCardOld(String cardOld) {
        this.cardOld = cardOld;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.Card_new
     *
     * @return the value of WT_CARD_LOG.Card_new
     */
    public String getCardNew() {
        return cardNew;
    }

    /**
     */
    public WtCardLogEntity withCardNew(String cardNew) {
        this.setCardNew(cardNew);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Card_new
     *
     * @param cardNew the value for WT_CARD_LOG.Card_new
     */
    public void setCardNew(String cardNew) {
        this.cardNew = cardNew;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.Log_xh
     *
     * @return the value of WT_CARD_LOG.Log_xh
     */
    public Integer getLogXh() {
        return logXh;
    }

    /**
     */
    public WtCardLogEntity withLogXh(Integer logXh) {
        this.setLogXh(logXh);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Log_xh
     *
     * @param logXh the value for WT_CARD_LOG.Log_xh
     */
    public void setLogXh(Integer logXh) {
        this.logXh = logXh;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.Log_group
     *
     * @return the value of WT_CARD_LOG.Log_group
     */
    public String getLogGroup() {
        return logGroup;
    }

    /**
     */
    public WtCardLogEntity withLogGroup(String logGroup) {
        this.setLogGroup(logGroup);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Log_group
     *
     * @param logGroup the value for WT_CARD_LOG.Log_group
     */
    public void setLogGroup(String logGroup) {
        this.logGroup = logGroup;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.Log_row
     *
     * @return the value of WT_CARD_LOG.Log_row
     */
    public Integer getLogRow() {
        return logRow;
    }

    /**
     */
    public WtCardLogEntity withLogRow(Integer logRow) {
        this.setLogRow(logRow);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Log_row
     *
     * @param logRow the value for WT_CARD_LOG.Log_row
     */
    public void setLogRow(Integer logRow) {
        this.logRow = logRow;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.Log_erro
     *
     * @return the value of WT_CARD_LOG.Log_erro
     */
    public Integer getLogErro() {
        return logErro;
    }

    /**
     */
    public WtCardLogEntity withLogErro(Integer logErro) {
        this.setLogErro(logErro);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Log_erro
     *
     * @param logErro the value for WT_CARD_LOG.Log_erro
     */
    public void setLogErro(Integer logErro) {
        this.logErro = logErro;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.Bz
     *
     * @return the value of WT_CARD_LOG.Bz
     */
    public String getBz() {
        return bz;
    }

    /**
     */
    public WtCardLogEntity withBz(String bz) {
        this.setBz(bz);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Bz
     *
     * @param bz the value for WT_CARD_LOG.Bz
     */
    public void setBz(String bz) {
        this.bz = bz;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.Log_sj
     *
     * @return the value of WT_CARD_LOG.Log_sj
     */
    public Date getLogSj() {
        return logSj;
    }

    /**
     */
    public WtCardLogEntity withLogSj(Date logSj) {
        this.setLogSj(logSj);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Log_sj
     *
     * @param logSj the value for WT_CARD_LOG.Log_sj
     */
    public void setLogSj(Date logSj) {
        this.logSj = logSj;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.Log_ip
     *
     * @return the value of WT_CARD_LOG.Log_ip
     */
    public String getLogIp() {
        return logIp;
    }

    /**
     */
    public WtCardLogEntity withLogIp(String logIp) {
        this.setLogIp(logIp);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Log_ip
     *
     * @param logIp the value for WT_CARD_LOG.Log_ip
     */
    public void setLogIp(String logIp) {
        this.logIp = logIp;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.Gly_no
     *
     * @return the value of WT_CARD_LOG.Gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public WtCardLogEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Gly_no
     *
     * @param glyNo the value for WT_CARD_LOG.Gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.Jl_count
     *
     * @return the value of WT_CARD_LOG.Jl_count
     */
    public Integer getJlCount() {
        return jlCount;
    }

    /**
     */
    public WtCardLogEntity withJlCount(Integer jlCount) {
        this.setJlCount(jlCount);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Jl_count
     *
     * @param jlCount the value for WT_CARD_LOG.Jl_count
     */
    public void setJlCount(Integer jlCount) {
        this.jlCount = jlCount;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.Pay_v2
     *
     * @return the value of WT_CARD_LOG.Pay_v2
     */
    public String getPayV2() {
        return payV2;
    }

    /**
     */
    public WtCardLogEntity withPayV2(String payV2) {
        this.setPayV2(payV2);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.Pay_v2
     *
     * @param payV2 the value for WT_CARD_LOG.Pay_v2
     */
    public void setPayV2(String payV2) {
        this.payV2 = payV2;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.pay_old
     *
     * @return the value of WT_CARD_LOG.pay_old
     */
    public Integer getPayOld() {
        return payOld;
    }

    /**
     */
    public WtCardLogEntity withPayOld(Integer payOld) {
        this.setPayOld(payOld);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.pay_old
     *
     * @param payOld the value for WT_CARD_LOG.pay_old
     */
    public void setPayOld(Integer payOld) {
        this.payOld = payOld;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.pay_ljcount
     *
     * @return the value of WT_CARD_LOG.pay_ljcount
     */
    public Integer getPayLjcount() {
        return payLjcount;
    }

    /**
     */
    public WtCardLogEntity withPayLjcount(Integer payLjcount) {
        this.setPayLjcount(payLjcount);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.pay_ljcount
     *
     * @param payLjcount the value for WT_CARD_LOG.pay_ljcount
     */
    public void setPayLjcount(Integer payLjcount) {
        this.payLjcount = payLjcount;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.pay_ljmoney
     *
     * @return the value of WT_CARD_LOG.pay_ljmoney
     */
    public Integer getPayLjmoney() {
        return payLjmoney;
    }

    /**
     */
    public WtCardLogEntity withPayLjmoney(Integer payLjmoney) {
        this.setPayLjmoney(payLjmoney);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.pay_ljmoney
     *
     * @param payLjmoney the value for WT_CARD_LOG.pay_ljmoney
     */
    public void setPayLjmoney(Integer payLjmoney) {
        this.payLjmoney = payLjmoney;
    }

    /**
     * This method returns the value of the database column WT_CARD_LOG.import_no
     *
     * @return the value of WT_CARD_LOG.import_no
     */
    public String getImportNo() {
        return importNo;
    }

    /**
     */
    public WtCardLogEntity withImportNo(String importNo) {
        this.setImportNo(importNo);
        return this;
    }

    /**
     * This method sets the value of the database column WT_CARD_LOG.import_no
     *
     * @param importNo the value for WT_CARD_LOG.import_no
     */
    public void setImportNo(String importNo) {
        this.importNo = importNo;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}