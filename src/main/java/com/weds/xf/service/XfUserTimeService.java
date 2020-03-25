package com.weds.xf.service;

import javax.annotation.Resource;

import com.weds.core.resp.JsonResult;
import com.weds.xf.entity.TradEntity;
import com.weds.xf.entity.TradReqEntity;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper.XfUserTimeMapper;
import com.weds.xf.entity.XfUserTimeEntity;

/**
 * @Author
 * @Description XfUserTime管理
 * @Date 2020-03-22
 */
@Service
public class XfUserTimeService extends BaseService {

    @Resource
    private XfUserTimeMapper xfUserTimeMapper;

    private Logger log = LogManager.getLogger();

    public int deleteByPrimaryKey(Integer xh) {
        return xfUserTimeMapper.deleteByPrimaryKey(xh);
    }

    public int insert(XfUserTimeEntity record) {
        return xfUserTimeMapper.insert(record);
    }

    public int insertSelective(XfUserTimeEntity record) {
        return xfUserTimeMapper.insertSelective(record);
    }

    public XfUserTimeEntity selectByPrimaryKey(Long userSerial) {
        return xfUserTimeMapper.selectByPrimaryKey(userSerial);
    }

    public int updateByPrimaryKeySelective(XfUserTimeEntity record) {
        return xfUserTimeMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(XfUserTimeEntity record) {
        return xfUserTimeMapper.updateByPrimaryKey(record);
    }

    /**
     * 更新日补贴信息到消费累计表
     *
     * @return
     */
    public JsonResult updateTradTotal(TradReqEntity tradReqEntity, TradEntity tradEntity) throws Exception {
        XfUserTimeEntity xfUserTimeEntity = selectByPrimaryKey(tradEntity.getUserSerial());
        if (null == xfUserTimeEntity) {
            xfUserTimeEntity = new XfUserTimeEntity();
            xfUserTimeEntity.setUserSerial(tradEntity.getUserSerial());
            xfUserTimeEntity.setRq(new Date());
            xfUserTimeEntity.setDayCount(1);
            xfUserTimeEntity.setDayMoney(tradEntity.getRealMoney());
            xfUserTimeEntity.setTimeNo(tradEntity.getTimeNo());
            xfUserTimeEntity.setTimeXh(tradEntity.getXfAcTimeXh());
            xfUserTimeEntity.setTimeKs(tradEntity.getTimeBegin());
            xfUserTimeEntity.setTimeJs(tradEntity.getTimeEnd());
            xfUserTimeEntity.setSubDay(tradEntity.getDaySubAmt().intValue() > 0 ? 1 : 0);
            xfUserTimeEntity.setEachDay(tradEntity.getDaySubEach().intValue() > 0 ? 1 : 0);
            xfUserTimeEntity.setSubHour(tradEntity.getMealSubAmt().intValue() > 0 ? 1 : 0);
            xfUserTimeEntity.setEachHour(tradEntity.getMealSubEach().intValue() > 0 ? 1 : 0);
            xfUserTimeEntity.setXfCount(1);
            xfUserTimeEntity.setXfMoney(tradReqEntity.getTradType() == 1 ? tradEntity.getRealMoney() : BigDecimal.valueOf(0));
            xfUserTimeEntity.setXfEach(tradReqEntity.getTradType() == 41 ? 1 : 0);
            xfUserTimeEntity.setSj(new Date());
            insert(xfUserTimeEntity);
        } else {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String curDate = dateFormat.format(date);
            if (xfUserTimeEntity.getRq().toString().equals(curDate)) {
                if (xfUserTimeEntity.getTimeNo().equals(tradEntity.getTimeNo())) {
                    xfUserTimeEntity.setXfCount(xfUserTimeEntity.getXfCount() + 1);
                    xfUserTimeEntity.setXfMoney(tradReqEntity.getTradType() == 1 ? xfUserTimeEntity.getXfMoney().add(tradEntity.getRealMoney()) : xfUserTimeEntity.getXfMoney());
                    xfUserTimeEntity.setXfEach(tradReqEntity.getTradType() == 41 ? xfUserTimeEntity.getXfEach() + 1 : xfUserTimeEntity.getXfEach());
                } else {
                    xfUserTimeEntity.setDayMoney(xfUserTimeEntity.getDayMoney().add(tradEntity.getRealMoney()));
                    xfUserTimeEntity.setDayCount(xfUserTimeEntity.getDayCount() + 1);
                    xfUserTimeEntity.setSubDay(tradEntity.getDaySubAmt().intValue() > 0 ? 1 : 0);
                    xfUserTimeEntity.setEachDay(tradEntity.getDaySubEach().intValue() > 0 ? 1 : 0);
                    xfUserTimeEntity.setTimeNo(tradEntity.getTimeNo());
                    xfUserTimeEntity.setTimeXh(tradEntity.getXfAcTimeXh());
                    xfUserTimeEntity.setTimeKs(tradEntity.getTimeBegin());
                    xfUserTimeEntity.setTimeJs(tradEntity.getTimeEnd());
                }
            } else {
                xfUserTimeEntity.setRq(new Date());
                xfUserTimeEntity.setDayCount(0);
                xfUserTimeEntity.setDayMoney(tradEntity.getRealMoney());
                xfUserTimeEntity.setTimeNo(tradEntity.getTimeNo());
                xfUserTimeEntity.setTimeXh(tradEntity.getXfAcTimeXh());
                xfUserTimeEntity.setTimeKs(tradEntity.getTimeBegin());
                xfUserTimeEntity.setTimeJs(tradEntity.getTimeEnd());
                xfUserTimeEntity.setSubHour(tradEntity.getMealSubAmt().intValue() > 0 ? 1 : 0);
                xfUserTimeEntity.setEachHour(tradEntity.getMealSubEach().intValue() > 0 ? 1 : 0);
                xfUserTimeEntity.setXfCount(1);
                xfUserTimeEntity.setXfMoney(tradReqEntity.getTradType() == 1 ? tradEntity.getRealMoney() : BigDecimal.valueOf(0));
                xfUserTimeEntity.setXfEach(tradReqEntity.getTradType() == 41 ? 1 : 0);
                xfUserTimeEntity.setSj(new Date());
            }
            updateByPrimaryKey(xfUserTimeEntity);
        }
        return succMsg("success");
    }

}
