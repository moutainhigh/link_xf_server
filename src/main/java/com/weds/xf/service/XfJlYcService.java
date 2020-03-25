package com.weds.xf.service;

import javax.annotation.Resource;

import com.weds.core.resp.JsonResult;
import com.weds.xf.entity.TradEntity;
import com.weds.xf.entity.TradReqEntity;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.xf.mapper.XfJlYcMapper;
import com.weds.xf.entity.XfJlYcEntity;

/**
 * @Author
 * @Description XfJlYc管理
 * @Date 2020-03-22
 */
@Service
public class XfJlYcService extends BaseService {

    @Resource
    private XfJlYcMapper xfJlYcMapper;

    private Logger log = LogManager.getLogger();

    public int deleteByPrimaryKey(Integer xh) {
        return xfJlYcMapper.deleteByPrimaryKey(xh);
    }

    public int insert(XfJlYcEntity record) {
        return xfJlYcMapper.insert(record);
    }

    public int insertSelective(XfJlYcEntity record) {
        return xfJlYcMapper.insertSelective(record);
    }

    public XfJlYcEntity selectByPrimaryKey(String devSerial) {
        return xfJlYcMapper.selectByPrimaryKey(devSerial);
    }

    public int updateByPrimaryKeySelective(XfJlYcEntity record) {
        return xfJlYcMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(XfJlYcEntity record) {
        return xfJlYcMapper.updateByPrimaryKey(record);
    }

    private int getSubUndoLx(TradEntity tradEntity, TradReqEntity tradReqEntity) {
        if (tradReqEntity.getTradType() == 1) {
            if (tradEntity.getDaySubAmt().intValue() > 0 && tradEntity.getMealSubAmt().intValue() > 0) {
                return 35;   // 待优化
            } else if (tradEntity.getDaySubAmt().intValue() > 0) {
                return 34;
            } else if (tradEntity.getMealSubAmt().intValue() > 0) {
                return 35;
            }
        } else if (tradReqEntity.getTradType() == 41) {
            if (tradEntity.getDaySubEach() > 0 && tradEntity.getMealSubEach() > 0) {
                return 35;   // 待优化
            } else if (tradEntity.getDaySubEach() > 0) {
                return 34;
            } else if (tradEntity.getMealSubEach() > 0) {
                return 35;
            }
        }
        return 0;
    }

    private BigDecimal getUndoSubAmt(TradEntity tradEntity, TradReqEntity tradReqEntity, Integer subUndoLx) {
        if (tradReqEntity.getTradType() == 1) {
            if (subUndoLx == 34) {
                return tradEntity.getDaySubAmt();
            } else if (subUndoLx == 35) {
                return tradEntity.getMealSubAmt();
            } else {
                return BigDecimal.valueOf(0);
            }
        } else if (tradReqEntity.getTradType() == 41) {
            if (subUndoLx == 34) {
                return BigDecimal.valueOf(tradEntity.getDaySubEach());
            } else if (subUndoLx == 35) {
                return BigDecimal.valueOf(tradEntity.getMealSubEach());
            } else {
                return BigDecimal.valueOf(0);
            }
        }
    }


    public JsonResult<TradEntity> updateDevControl(TradReqEntity tradReqEntity,TradEntity tradEntity) throws Exception {
        XfJlYcEntity xfJlYcEntity = selectByPrimaryKey(tradReqEntity.getDevSerial());
        if (null == xfJlYcEntity) {
            xfJlYcEntity = new XfJlYcEntity();
            xfJlYcEntity.setMould(tradReqEntity.getTradType() == 1 ? 0 : 1);
            xfJlYcEntity.setLx(1);
            xfJlYcEntity.setType(4);
            xfJlYcEntity.setJlBh(tradReqEntity.getTradFlow().toString());
            xfJlYcEntity.setDevSerial(tradReqEntity.getDevSerial());
            xfJlYcEntity.setUserSerial(tradEntity.getUserSerial());
            xfJlYcEntity.setUserCard(tradReqEntity.getCardNo());
            xfJlYcEntity.setCardSerial(tradEntity.getCardSerial());
            xfJlYcEntity.setOldMoney(tradEntity.getCashAmt().add(tradEntity.getSubAmt()));
            xfJlYcEntity.setNewMoney(tradEntity.getRealMoney());
            xfJlYcEntity.setMoreMoney(tradReqEntity.getMoney());
            xfJlYcEntity.setDiscountRate(tradEntity.getRate());
            xfJlYcEntity.setJlSj(new Date());
            xfJlYcEntity.setJlCount(tradEntity.getJlCount());
            xfJlYcEntity.setTimeNo(tradEntity.getTimeNo());
            xfJlYcEntity.setTimeOrder(tradEntity.getTimeNo());
            xfJlYcEntity.setDelType(tradEntity.getChargeType());
            xfJlYcEntity.setSubOld(tradEntity.getSubAmt().add(tradEntity.getDaySubAmt()).add(tradEntity.getMealSubAmt()));
            xfJlYcEntity.setSubNew(tradEntity.getChargeSub());
            xfJlYcEntity.setEachOld(tradEntity.getEach() + tradEntity.getDaySubEach() + tradEntity.getMealSubEach());
            xfJlYcEntity.setEachNew(tradReqEntity.getTradType() == 41 ? 1 : 0);
            xfJlYcEntity.setEachUnit(0);
            xfJlYcEntity.setState(1);  //??????????
            xfJlYcEntity.setIdentType(tradReqEntity.getIdentityType());
            xfJlYcEntity.setAcPass(0);
            xfJlYcEntity.setJlData("");
            xfJlYcEntity.setJlNumber(0);
            xfJlYcEntity.setNowBh(tradEntity.getJlCount().toString());
            xfJlYcEntity.setDepSerial(tradEntity.getUserDep());
            Integer subUndoLx = getSubUndoLx(tradEntity, tradReqEntity);
            xfJlYcEntity.setResSubLx(subUndoLx);
            xfJlYcEntity.setResDaySub(getUndoSubAmt(tradEntity, tradReqEntity, subUndoLx));
            insert(xfJlYcEntity);
        } else {
            xfJlYcEntity.setMould(tradReqEntity.getTradType() == 1 ? 0 : 1);
            xfJlYcEntity.setLx(1);
            xfJlYcEntity.setType(4);
            xfJlYcEntity.setJlBh(tradReqEntity.getTradFlow().toString());
            xfJlYcEntity.setDevSerial(tradReqEntity.getDevSerial());
            xfJlYcEntity.setUserSerial(tradEntity.getUserSerial());
            xfJlYcEntity.setUserCard(tradReqEntity.getCardNo());
            xfJlYcEntity.setCardSerial(tradEntity.getCardSerial());
            xfJlYcEntity.setOldMoney(tradEntity.getCashAmt().add(tradEntity.getSubAmt()));
            xfJlYcEntity.setNewMoney(tradEntity.getRealMoney());
            xfJlYcEntity.setMoreMoney(tradReqEntity.getMoney());
            xfJlYcEntity.setDiscountRate(tradEntity.getRate());
            xfJlYcEntity.setJlSj(new Date());
            xfJlYcEntity.setJlCount(tradEntity.getJlCount());
            xfJlYcEntity.setTimeNo(tradEntity.getTimeNo());
            xfJlYcEntity.setTimeOrder(tradEntity.getTimeNo());
            xfJlYcEntity.setDelType(tradEntity.getChargeType());
            xfJlYcEntity.setSubOld(tradEntity.getSubAmt().add(tradEntity.getDaySubAmt()).add(tradEntity.getMealSubAmt()));
            xfJlYcEntity.setSubNew(tradEntity.getChargeSub());
            xfJlYcEntity.setEachOld(tradEntity.getEach() + tradEntity.getDaySubEach() + tradEntity.getMealSubEach());
            xfJlYcEntity.setEachNew(tradReqEntity.getTradType() == 41 ? 1 : 0);
            xfJlYcEntity.setEachUnit(0);
            xfJlYcEntity.setState(1);  //??????????
            xfJlYcEntity.setIdentType(tradReqEntity.getIdentityType());
            xfJlYcEntity.setAcPass(0);
            xfJlYcEntity.setJlData("");
            xfJlYcEntity.setJlNumber(0);
            xfJlYcEntity.setNowBh(tradEntity.getJlCount().toString());
            xfJlYcEntity.setDepSerial(tradEntity.getUserDep());
            Integer subUndoLx = getSubUndoLx(tradEntity, tradReqEntity);
            xfJlYcEntity.setResSubLx(subUndoLx);
            xfJlYcEntity.setResDaySub(getUndoSubAmt(tradEntity, tradReqEntity, subUndoLx));
            updateByPrimaryKey(xfJlYcEntity);
        }
        return succMsgData(tradEntity);
    }
}
