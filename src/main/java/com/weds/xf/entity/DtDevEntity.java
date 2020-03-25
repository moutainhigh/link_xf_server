package com.weds.xf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

public class DtDevEntity extends BaseEntity implements Serializable {
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
    @Size(max = 7)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String devSerial;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer depSerial;

    /**
     *
     */
    @Size(max = 100)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String glyNo;

    /**
     *
     */
    @Size(max = 4)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String moduleId;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Long acdepSerial;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:17:36", value = "")
    private Date sj;

    /**
     *
     */
    @Size(max = 16)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String groupNo;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column dt_dev.xh
     *
     * @return the value of dt_dev.xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public DtDevEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column dt_dev.xh
     *
     * @param xh the value for dt_dev.xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column dt_dev.lx
     *
     * @return the value of dt_dev.lx
     */
    public Integer getLx() {
        return lx;
    }

    /**
     */
    public DtDevEntity withLx(Integer lx) {
        this.setLx(lx);
        return this;
    }

    /**
     * This method sets the value of the database column dt_dev.lx
     *
     * @param lx the value for dt_dev.lx
     */
    public void setLx(Integer lx) {
        this.lx = lx;
    }

    /**
     * This method returns the value of the database column dt_dev.dev_serial
     *
     * @return the value of dt_dev.dev_serial
     */
    public String getDevSerial() {
        return devSerial;
    }

    /**
     */
    public DtDevEntity withDevSerial(String devSerial) {
        this.setDevSerial(devSerial);
        return this;
    }

    /**
     * This method sets the value of the database column dt_dev.dev_serial
     *
     * @param devSerial the value for dt_dev.dev_serial
     */
    public void setDevSerial(String devSerial) {
        this.devSerial = devSerial;
    }

    /**
     * This method returns the value of the database column dt_dev.dep_serial
     *
     * @return the value of dt_dev.dep_serial
     */
    public Integer getDepSerial() {
        return depSerial;
    }

    /**
     */
    public DtDevEntity withDepSerial(Integer depSerial) {
        this.setDepSerial(depSerial);
        return this;
    }

    /**
     * This method sets the value of the database column dt_dev.dep_serial
     *
     * @param depSerial the value for dt_dev.dep_serial
     */
    public void setDepSerial(Integer depSerial) {
        this.depSerial = depSerial;
    }

    /**
     * This method returns the value of the database column dt_dev.gly_no
     *
     * @return the value of dt_dev.gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public DtDevEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column dt_dev.gly_no
     *
     * @param glyNo the value for dt_dev.gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    /**
     * This method returns the value of the database column dt_dev.module_id
     *
     * @return the value of dt_dev.module_id
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     */
    public DtDevEntity withModuleId(String moduleId) {
        this.setModuleId(moduleId);
        return this;
    }

    /**
     * This method sets the value of the database column dt_dev.module_id
     *
     * @param moduleId the value for dt_dev.module_id
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * This method returns the value of the database column dt_dev.acdep_serial
     *
     * @return the value of dt_dev.acdep_serial
     */
    public Long getAcdepSerial() {
        return acdepSerial;
    }

    /**
     */
    public DtDevEntity withAcdepSerial(Long acdepSerial) {
        this.setAcdepSerial(acdepSerial);
        return this;
    }

    /**
     * This method sets the value of the database column dt_dev.acdep_serial
     *
     * @param acdepSerial the value for dt_dev.acdep_serial
     */
    public void setAcdepSerial(Long acdepSerial) {
        this.acdepSerial = acdepSerial;
    }

    /**
     * This method returns the value of the database column dt_dev.sj
     *
     * @return the value of dt_dev.sj
     */
    public Date getSj() {
        return sj;
    }

    /**
     */
    public DtDevEntity withSj(Date sj) {
        this.setSj(sj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_dev.sj
     *
     * @param sj the value for dt_dev.sj
     */
    public void setSj(Date sj) {
        this.sj = sj;
    }

    /**
     * This method returns the value of the database column dt_dev.Group_no
     *
     * @return the value of dt_dev.Group_no
     */
    public String getGroupNo() {
        return groupNo;
    }

    /**
     */
    public DtDevEntity withGroupNo(String groupNo) {
        this.setGroupNo(groupNo);
        return this;
    }

    /**
     * This method sets the value of the database column dt_dev.Group_no
     *
     * @param groupNo the value for dt_dev.Group_no
     */
    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}