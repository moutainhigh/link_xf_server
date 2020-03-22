package com.weds.xf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

public class XfAddeachEntity extends BaseEntity implements Serializable {
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
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Long userSerial;

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:22:07", value = "")
    private Date subKssj;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:22:07", value = "")
    private Date subJssj;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal subMoney;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer subOrder;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:22:07", value = "")
    private Date sj;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:22:07", value = "")
    private Date updateSj;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer subState;

    /**
     *
     */
    @Size(max = 100)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String bz;

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
    private Integer subNew;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer xfLx;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer sudDel;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer subDel;

    /**
     *
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String subImport;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column xf_addeach.xh
     *
     * @return the value of xf_addeach.xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public XfAddeachEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.xh
     *
     * @param xh the value for xf_addeach.xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column xf_addeach.lx
     *
     * @return the value of xf_addeach.lx
     */
    public Integer getLx() {
        return lx;
    }

    /**
     */
    public XfAddeachEntity withLx(Integer lx) {
        this.setLx(lx);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.lx
     *
     * @param lx the value for xf_addeach.lx
     */
    public void setLx(Integer lx) {
        this.lx = lx;
    }

    /**
     * This method returns the value of the database column xf_addeach.user_serial
     *
     * @return the value of xf_addeach.user_serial
     */
    public Long getUserSerial() {
        return userSerial;
    }

    /**
     */
    public XfAddeachEntity withUserSerial(Long userSerial) {
        this.setUserSerial(userSerial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.user_serial
     *
     * @param userSerial the value for xf_addeach.user_serial
     */
    public void setUserSerial(Long userSerial) {
        this.userSerial = userSerial;
    }

    /**
     * This method returns the value of the database column xf_addeach.card_serial
     *
     * @return the value of xf_addeach.card_serial
     */
    public String getCardSerial() {
        return cardSerial;
    }

    /**
     */
    public XfAddeachEntity withCardSerial(String cardSerial) {
        this.setCardSerial(cardSerial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.card_serial
     *
     * @param cardSerial the value for xf_addeach.card_serial
     */
    public void setCardSerial(String cardSerial) {
        this.cardSerial = cardSerial;
    }

    /**
     * This method returns the value of the database column xf_addeach.type
     *
     * @return the value of xf_addeach.type
     */
    public Integer getType() {
        return type;
    }

    /**
     */
    public XfAddeachEntity withType(Integer type) {
        this.setType(type);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.type
     *
     * @param type the value for xf_addeach.type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method returns the value of the database column xf_addeach.sub_kssj
     *
     * @return the value of xf_addeach.sub_kssj
     */
    public Date getSubKssj() {
        return subKssj;
    }

    /**
     */
    public XfAddeachEntity withSubKssj(Date subKssj) {
        this.setSubKssj(subKssj);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.sub_kssj
     *
     * @param subKssj the value for xf_addeach.sub_kssj
     */
    public void setSubKssj(Date subKssj) {
        this.subKssj = subKssj;
    }

    /**
     * This method returns the value of the database column xf_addeach.sub_jssj
     *
     * @return the value of xf_addeach.sub_jssj
     */
    public Date getSubJssj() {
        return subJssj;
    }

    /**
     */
    public XfAddeachEntity withSubJssj(Date subJssj) {
        this.setSubJssj(subJssj);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.sub_jssj
     *
     * @param subJssj the value for xf_addeach.sub_jssj
     */
    public void setSubJssj(Date subJssj) {
        this.subJssj = subJssj;
    }

    /**
     * This method returns the value of the database column xf_addeach.sub_money
     *
     * @return the value of xf_addeach.sub_money
     */
    public BigDecimal getSubMoney() {
        return subMoney;
    }

    /**
     */
    public XfAddeachEntity withSubMoney(BigDecimal subMoney) {
        this.setSubMoney(subMoney);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.sub_money
     *
     * @param subMoney the value for xf_addeach.sub_money
     */
    public void setSubMoney(BigDecimal subMoney) {
        this.subMoney = subMoney;
    }

    /**
     * This method returns the value of the database column xf_addeach.sub_order
     *
     * @return the value of xf_addeach.sub_order
     */
    public Integer getSubOrder() {
        return subOrder;
    }

    /**
     */
    public XfAddeachEntity withSubOrder(Integer subOrder) {
        this.setSubOrder(subOrder);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.sub_order
     *
     * @param subOrder the value for xf_addeach.sub_order
     */
    public void setSubOrder(Integer subOrder) {
        this.subOrder = subOrder;
    }

    /**
     * This method returns the value of the database column xf_addeach.sj
     *
     * @return the value of xf_addeach.sj
     */
    public Date getSj() {
        return sj;
    }

    /**
     */
    public XfAddeachEntity withSj(Date sj) {
        this.setSj(sj);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.sj
     *
     * @param sj the value for xf_addeach.sj
     */
    public void setSj(Date sj) {
        this.sj = sj;
    }

    /**
     * This method returns the value of the database column xf_addeach.update_sj
     *
     * @return the value of xf_addeach.update_sj
     */
    public Date getUpdateSj() {
        return updateSj;
    }

    /**
     */
    public XfAddeachEntity withUpdateSj(Date updateSj) {
        this.setUpdateSj(updateSj);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.update_sj
     *
     * @param updateSj the value for xf_addeach.update_sj
     */
    public void setUpdateSj(Date updateSj) {
        this.updateSj = updateSj;
    }

    /**
     * This method returns the value of the database column xf_addeach.sub_state
     *
     * @return the value of xf_addeach.sub_state
     */
    public Integer getSubState() {
        return subState;
    }

    /**
     */
    public XfAddeachEntity withSubState(Integer subState) {
        this.setSubState(subState);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.sub_state
     *
     * @param subState the value for xf_addeach.sub_state
     */
    public void setSubState(Integer subState) {
        this.subState = subState;
    }

    /**
     * This method returns the value of the database column xf_addeach.bz
     *
     * @return the value of xf_addeach.bz
     */
    public String getBz() {
        return bz;
    }

    /**
     */
    public XfAddeachEntity withBz(String bz) {
        this.setBz(bz);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.bz
     *
     * @param bz the value for xf_addeach.bz
     */
    public void setBz(String bz) {
        this.bz = bz;
    }

    /**
     * This method returns the value of the database column xf_addeach.gly_no
     *
     * @return the value of xf_addeach.gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public XfAddeachEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.gly_no
     *
     * @param glyNo the value for xf_addeach.gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    /**
     * This method returns the value of the database column xf_addeach.sub_new
     *
     * @return the value of xf_addeach.sub_new
     */
    public Integer getSubNew() {
        return subNew;
    }

    /**
     */
    public XfAddeachEntity withSubNew(Integer subNew) {
        this.setSubNew(subNew);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.sub_new
     *
     * @param subNew the value for xf_addeach.sub_new
     */
    public void setSubNew(Integer subNew) {
        this.subNew = subNew;
    }

    /**
     * This method returns the value of the database column xf_addeach.xf_lx
     *
     * @return the value of xf_addeach.xf_lx
     */
    public Integer getXfLx() {
        return xfLx;
    }

    /**
     */
    public XfAddeachEntity withXfLx(Integer xfLx) {
        this.setXfLx(xfLx);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.xf_lx
     *
     * @param xfLx the value for xf_addeach.xf_lx
     */
    public void setXfLx(Integer xfLx) {
        this.xfLx = xfLx;
    }

    /**
     * This method returns the value of the database column xf_addeach.sud_del
     *
     * @return the value of xf_addeach.sud_del
     */
    public Integer getSudDel() {
        return sudDel;
    }

    /**
     */
    public XfAddeachEntity withSudDel(Integer sudDel) {
        this.setSudDel(sudDel);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.sud_del
     *
     * @param sudDel the value for xf_addeach.sud_del
     */
    public void setSudDel(Integer sudDel) {
        this.sudDel = sudDel;
    }

    /**
     * This method returns the value of the database column xf_addeach.sub_del
     *
     * @return the value of xf_addeach.sub_del
     */
    public Integer getSubDel() {
        return subDel;
    }

    /**
     */
    public XfAddeachEntity withSubDel(Integer subDel) {
        this.setSubDel(subDel);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.sub_del
     *
     * @param subDel the value for xf_addeach.sub_del
     */
    public void setSubDel(Integer subDel) {
        this.subDel = subDel;
    }

    /**
     * This method returns the value of the database column xf_addeach.sub_import
     *
     * @return the value of xf_addeach.sub_import
     */
    public String getSubImport() {
        return subImport;
    }

    /**
     */
    public XfAddeachEntity withSubImport(String subImport) {
        this.setSubImport(subImport);
        return this;
    }

    /**
     * This method sets the value of the database column xf_addeach.sub_import
     *
     * @param subImport the value for xf_addeach.sub_import
     */
    public void setSubImport(String subImport) {
        this.subImport = subImport;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}