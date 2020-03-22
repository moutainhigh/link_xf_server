package com.weds.xf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Size;

public class DtAcDepUserEntity implements Serializable {
    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer xh;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer depSerial;

    /**
     *
     */
    @Size(max = 200)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String depLname;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Long userSerial;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:15:21", value = "")
    private Date sj;

    /**
     *
     */
    @Size(max = 10)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String moduleId;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer lx;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Long bmSerial;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String glyNo;

    /**
     *
     */
    @Size(max = 6)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String userMj;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer perLx;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer depType;

    /**
     *
     */
    @Size(max = 12)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String mjgz;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:15:21", value = "")
    private Date outsj;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column dt_ac_dep_user.xh
     *
     * @return the value of dt_ac_dep_user.xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public DtAcDepUserEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_dep_user.xh
     *
     * @param xh the value for dt_ac_dep_user.xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column dt_ac_dep_user.dep_serial
     *
     * @return the value of dt_ac_dep_user.dep_serial
     */
    public Integer getDepSerial() {
        return depSerial;
    }

    /**
     */
    public DtAcDepUserEntity withDepSerial(Integer depSerial) {
        this.setDepSerial(depSerial);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_dep_user.dep_serial
     *
     * @param depSerial the value for dt_ac_dep_user.dep_serial
     */
    public void setDepSerial(Integer depSerial) {
        this.depSerial = depSerial;
    }

    /**
     * This method returns the value of the database column dt_ac_dep_user.dep_lname
     *
     * @return the value of dt_ac_dep_user.dep_lname
     */
    public String getDepLname() {
        return depLname;
    }

    /**
     */
    public DtAcDepUserEntity withDepLname(String depLname) {
        this.setDepLname(depLname);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_dep_user.dep_lname
     *
     * @param depLname the value for dt_ac_dep_user.dep_lname
     */
    public void setDepLname(String depLname) {
        this.depLname = depLname;
    }

    /**
     * This method returns the value of the database column dt_ac_dep_user.user_serial
     *
     * @return the value of dt_ac_dep_user.user_serial
     */
    public Long getUserSerial() {
        return userSerial;
    }

    /**
     */
    public DtAcDepUserEntity withUserSerial(Long userSerial) {
        this.setUserSerial(userSerial);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_dep_user.user_serial
     *
     * @param userSerial the value for dt_ac_dep_user.user_serial
     */
    public void setUserSerial(Long userSerial) {
        this.userSerial = userSerial;
    }

    /**
     * This method returns the value of the database column dt_ac_dep_user.sj
     *
     * @return the value of dt_ac_dep_user.sj
     */
    public Date getSj() {
        return sj;
    }

    /**
     */
    public DtAcDepUserEntity withSj(Date sj) {
        this.setSj(sj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_dep_user.sj
     *
     * @param sj the value for dt_ac_dep_user.sj
     */
    public void setSj(Date sj) {
        this.sj = sj;
    }

    /**
     * This method returns the value of the database column dt_ac_dep_user.module_id
     *
     * @return the value of dt_ac_dep_user.module_id
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     */
    public DtAcDepUserEntity withModuleId(String moduleId) {
        this.setModuleId(moduleId);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_dep_user.module_id
     *
     * @param moduleId the value for dt_ac_dep_user.module_id
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * This method returns the value of the database column dt_ac_dep_user.lx
     *
     * @return the value of dt_ac_dep_user.lx
     */
    public Integer getLx() {
        return lx;
    }

    /**
     */
    public DtAcDepUserEntity withLx(Integer lx) {
        this.setLx(lx);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_dep_user.lx
     *
     * @param lx the value for dt_ac_dep_user.lx
     */
    public void setLx(Integer lx) {
        this.lx = lx;
    }

    /**
     * This method returns the value of the database column dt_ac_dep_user.bm_serial
     *
     * @return the value of dt_ac_dep_user.bm_serial
     */
    public Long getBmSerial() {
        return bmSerial;
    }

    /**
     */
    public DtAcDepUserEntity withBmSerial(Long bmSerial) {
        this.setBmSerial(bmSerial);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_dep_user.bm_serial
     *
     * @param bmSerial the value for dt_ac_dep_user.bm_serial
     */
    public void setBmSerial(Long bmSerial) {
        this.bmSerial = bmSerial;
    }

    /**
     * This method returns the value of the database column dt_ac_dep_user.gly_no
     *
     * @return the value of dt_ac_dep_user.gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public DtAcDepUserEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_dep_user.gly_no
     *
     * @param glyNo the value for dt_ac_dep_user.gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    /**
     * This method returns the value of the database column dt_ac_dep_user.user_mj
     *
     * @return the value of dt_ac_dep_user.user_mj
     */
    public String getUserMj() {
        return userMj;
    }

    /**
     */
    public DtAcDepUserEntity withUserMj(String userMj) {
        this.setUserMj(userMj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_dep_user.user_mj
     *
     * @param userMj the value for dt_ac_dep_user.user_mj
     */
    public void setUserMj(String userMj) {
        this.userMj = userMj;
    }

    /**
     * This method returns the value of the database column dt_ac_dep_user.per_lx
     *
     * @return the value of dt_ac_dep_user.per_lx
     */
    public Integer getPerLx() {
        return perLx;
    }

    /**
     */
    public DtAcDepUserEntity withPerLx(Integer perLx) {
        this.setPerLx(perLx);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_dep_user.per_lx
     *
     * @param perLx the value for dt_ac_dep_user.per_lx
     */
    public void setPerLx(Integer perLx) {
        this.perLx = perLx;
    }

    /**
     * This method returns the value of the database column dt_ac_dep_user.dep_type
     *
     * @return the value of dt_ac_dep_user.dep_type
     */
    public Integer getDepType() {
        return depType;
    }

    /**
     */
    public DtAcDepUserEntity withDepType(Integer depType) {
        this.setDepType(depType);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_dep_user.dep_type
     *
     * @param depType the value for dt_ac_dep_user.dep_type
     */
    public void setDepType(Integer depType) {
        this.depType = depType;
    }

    /**
     * This method returns the value of the database column dt_ac_dep_user.mjgz
     *
     * @return the value of dt_ac_dep_user.mjgz
     */
    public String getMjgz() {
        return mjgz;
    }

    /**
     */
    public DtAcDepUserEntity withMjgz(String mjgz) {
        this.setMjgz(mjgz);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_dep_user.mjgz
     *
     * @param mjgz the value for dt_ac_dep_user.mjgz
     */
    public void setMjgz(String mjgz) {
        this.mjgz = mjgz;
    }

    /**
     * This method returns the value of the database column dt_ac_dep_user.outsj
     *
     * @return the value of dt_ac_dep_user.outsj
     */
    public Date getOutsj() {
        return outsj;
    }

    /**
     */
    public DtAcDepUserEntity withOutsj(Date outsj) {
        this.setOutsj(outsj);
        return this;
    }

    /**
     * This method sets the value of the database column dt_ac_dep_user.outsj
     *
     * @param outsj the value for dt_ac_dep_user.outsj
     */
    public void setOutsj(Date outsj) {
        this.outsj = outsj;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}