package com.weds.xf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weds.core.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

public class XfMenuEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer xh;

    /**
     *
     */
    @Size(max = 16)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String bh;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer lx;

    /**
     *
     */
    @Size(max = 16)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String parentBh;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String menuName;

    /**
     *
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String keyNo;

    /**
     *
     */
    @Digits(integer = 15, fraction = 4)
    @ApiModelProperty(required = true, dataType = "number", example = "-1", value = "")
    private BigDecimal menuMoney;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer menuRate;

    /**
     *
     */
    @Size(max = 100)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String bz;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-22 11:17:10", value = "")
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
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String regserial;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column xf_menu.xh
     *
     * @return the value of xf_menu.xh
     */
    public Integer getXh() {
        return xh;
    }

    /**
     */
    public XfMenuEntity withXh(Integer xh) {
        this.setXh(xh);
        return this;
    }

    /**
     * This method sets the value of the database column xf_menu.xh
     *
     * @param xh the value for xf_menu.xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * This method returns the value of the database column xf_menu.bh
     *
     * @return the value of xf_menu.bh
     */
    public String getBh() {
        return bh;
    }

    /**
     */
    public XfMenuEntity withBh(String bh) {
        this.setBh(bh);
        return this;
    }

    /**
     * This method sets the value of the database column xf_menu.bh
     *
     * @param bh the value for xf_menu.bh
     */
    public void setBh(String bh) {
        this.bh = bh;
    }

    /**
     * This method returns the value of the database column xf_menu.lx
     *
     * @return the value of xf_menu.lx
     */
    public Integer getLx() {
        return lx;
    }

    /**
     */
    public XfMenuEntity withLx(Integer lx) {
        this.setLx(lx);
        return this;
    }

    /**
     * This method sets the value of the database column xf_menu.lx
     *
     * @param lx the value for xf_menu.lx
     */
    public void setLx(Integer lx) {
        this.lx = lx;
    }

    /**
     * This method returns the value of the database column xf_menu.parent_bh
     *
     * @return the value of xf_menu.parent_bh
     */
    public String getParentBh() {
        return parentBh;
    }

    /**
     */
    public XfMenuEntity withParentBh(String parentBh) {
        this.setParentBh(parentBh);
        return this;
    }

    /**
     * This method sets the value of the database column xf_menu.parent_bh
     *
     * @param parentBh the value for xf_menu.parent_bh
     */
    public void setParentBh(String parentBh) {
        this.parentBh = parentBh;
    }

    /**
     * This method returns the value of the database column xf_menu.menu_name
     *
     * @return the value of xf_menu.menu_name
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     */
    public XfMenuEntity withMenuName(String menuName) {
        this.setMenuName(menuName);
        return this;
    }

    /**
     * This method sets the value of the database column xf_menu.menu_name
     *
     * @param menuName the value for xf_menu.menu_name
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * This method returns the value of the database column xf_menu.key_no
     *
     * @return the value of xf_menu.key_no
     */
    public String getKeyNo() {
        return keyNo;
    }

    /**
     */
    public XfMenuEntity withKeyNo(String keyNo) {
        this.setKeyNo(keyNo);
        return this;
    }

    /**
     * This method sets the value of the database column xf_menu.key_no
     *
     * @param keyNo the value for xf_menu.key_no
     */
    public void setKeyNo(String keyNo) {
        this.keyNo = keyNo;
    }

    /**
     * This method returns the value of the database column xf_menu.menu_money
     *
     * @return the value of xf_menu.menu_money
     */
    public BigDecimal getMenuMoney() {
        return menuMoney;
    }

    /**
     */
    public XfMenuEntity withMenuMoney(BigDecimal menuMoney) {
        this.setMenuMoney(menuMoney);
        return this;
    }

    /**
     * This method sets the value of the database column xf_menu.menu_money
     *
     * @param menuMoney the value for xf_menu.menu_money
     */
    public void setMenuMoney(BigDecimal menuMoney) {
        this.menuMoney = menuMoney;
    }

    /**
     * This method returns the value of the database column xf_menu.menu_rate
     *
     * @return the value of xf_menu.menu_rate
     */
    public Integer getMenuRate() {
        return menuRate;
    }

    /**
     */
    public XfMenuEntity withMenuRate(Integer menuRate) {
        this.setMenuRate(menuRate);
        return this;
    }

    /**
     * This method sets the value of the database column xf_menu.menu_rate
     *
     * @param menuRate the value for xf_menu.menu_rate
     */
    public void setMenuRate(Integer menuRate) {
        this.menuRate = menuRate;
    }

    /**
     * This method returns the value of the database column xf_menu.bz
     *
     * @return the value of xf_menu.bz
     */
    public String getBz() {
        return bz;
    }

    /**
     */
    public XfMenuEntity withBz(String bz) {
        this.setBz(bz);
        return this;
    }

    /**
     * This method sets the value of the database column xf_menu.bz
     *
     * @param bz the value for xf_menu.bz
     */
    public void setBz(String bz) {
        this.bz = bz;
    }

    /**
     * This method returns the value of the database column xf_menu.sj
     *
     * @return the value of xf_menu.sj
     */
    public Date getSj() {
        return sj;
    }

    /**
     */
    public XfMenuEntity withSj(Date sj) {
        this.setSj(sj);
        return this;
    }

    /**
     * This method sets the value of the database column xf_menu.sj
     *
     * @param sj the value for xf_menu.sj
     */
    public void setSj(Date sj) {
        this.sj = sj;
    }

    /**
     * This method returns the value of the database column xf_menu.gly_no
     *
     * @return the value of xf_menu.gly_no
     */
    public String getGlyNo() {
        return glyNo;
    }

    /**
     */
    public XfMenuEntity withGlyNo(String glyNo) {
        this.setGlyNo(glyNo);
        return this;
    }

    /**
     * This method sets the value of the database column xf_menu.gly_no
     *
     * @param glyNo the value for xf_menu.gly_no
     */
    public void setGlyNo(String glyNo) {
        this.glyNo = glyNo;
    }

    /**
     * This method returns the value of the database column xf_menu.regserial
     *
     * @return the value of xf_menu.regserial
     */
    public String getRegserial() {
        return regserial;
    }

    /**
     */
    public XfMenuEntity withRegserial(String regserial) {
        this.setRegserial(regserial);
        return this;
    }

    /**
     * This method sets the value of the database column xf_menu.regserial
     *
     * @param regserial the value for xf_menu.regserial
     */
    public void setRegserial(String regserial) {
        this.regserial = regserial;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}