package com.weds.xf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

public class OnlineXfAcDepEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer depSerial;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer acSerial;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer xh;

    /**
     *
     */
    @Size(max = 100)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String depName;

    /**
     *
     */
    @Size(max = 100)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String acName;

    /**
     *
     */
    @Size(max = 100)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String glyNo;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:19:07", value = "")
    private Date sj;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column online_xf_ac_dep.dep_serial
     *
     * @return the value of online_xf_ac_dep.dep_serial
     */
    public Integer getDepSerial() {
        return depSerial;
    }

    /**
     */
    public OnlineXfAcDepEntity withDepSerial(Integer depSerial) {
        this.setDepSerial(depSerial);
        return this;
    }

    /**
     * This method sets the value of the database column online_xf_ac_dep.dep_serial
     *
     * @param depSerial the value for online_xf_ac_dep.dep_serial
     */
    public void setDepSerial(Integer depSerial) {
        this.depSerial = depSerial;
    }

    /**
     * This method returns the value of the database column online_xf_ac_dep.ac_serial
     *
     * @return the value of online_xf_ac_dep.ac_serial
     */
    public Integer getAcSerial() {
        return acSerial;
    }

    /**
     */
    public OnlineXfAcDepEntity withAcSerial(Integer acSerial) {
        this.setAcSerial(acSerial);
        return this;
    }

    /**
     * This method sets the value of the database column online_xf_ac_dep.ac_serial
     *
     * @param acSerial the value for online_xf_ac_dep.ac_serial
     */
    public void setAcSerial(Integer acSerial) {
        this.acSerial = acSerial;
    }

    /**
     * This method returns the value of the database column online_xf_ac_dep.xh
     *
     * @return the value of online_xf_ac_dep.xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public OnlineXfAcDepEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column online_xf_ac_dep.xh
     *
     * @param xh the value for online_xf_ac_dep.xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column online_xf_ac_dep.dep_name
     *
     * @return the value of online_xf_ac_dep.dep_name
     */
    public String getDepName() {
        return depName;
    }

    /**
     */
    public OnlineXfAcDepEntity withDepName(String depName) {
        this.setDepName(depName);
        return this;
    }

    /**
     * This method sets the value of the database column online_xf_ac_dep.dep_name
     *
     * @param depName the value for online_xf_ac_dep.dep_name
     */
    public void setDepName(String depName) {
        this.depName = depName;
    }

    /**
     * This method returns the value of the database column online_xf_ac_dep.ac_name
     *
     * @return the value of online_xf_ac_dep.ac_name
     */
    public String getAcName() {
        return acName;
    }

    /**
     */
    public OnlineXfAcDepEntity withAcName(String acName) {
        this.setAcName(acName);
        return this;
    }

    /**
     * This method sets the value of the database column online_xf_ac_dep.ac_name
     *
     * @param acName the value for online_xf_ac_dep.ac_name
     */
    public void setAcName(String acName) {
        this.acName = acName;
    }

    /**
     * This method returns the value of the database column online_xf_ac_dep.gly_no
     *
     * @return the value of online_xf_ac_dep.gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public OnlineXfAcDepEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column online_xf_ac_dep.gly_no
     *
     * @param glyNo the value for online_xf_ac_dep.gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    /**
     * This method returns the value of the database column online_xf_ac_dep.sj
     *
     * @return the value of online_xf_ac_dep.sj
     */
    public Date getSj() {
        return sj;
    }

    /**
     */
    public OnlineXfAcDepEntity withSj(Date sj) {
        this.setSj(sj);
        return this;
    }

    /**
     * This method sets the value of the database column online_xf_ac_dep.sj
     *
     * @param sj the value for online_xf_ac_dep.sj
     */
    public void setSj(Date sj) {
        this.sj = sj;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}