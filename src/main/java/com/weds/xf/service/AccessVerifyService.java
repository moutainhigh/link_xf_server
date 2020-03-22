package com.weds.xf.service;

import com.weds.core.base.BaseService;
import com.weds.core.resp.JsonResult;
import com.weds.xf.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author
 * @Description 权限判断
 * @Date 2020-03-05
 */
@Service
public class AccessVerifyService extends BaseService {

    @Autowired DtAcDepUserService dtAcDepUserService;
    @Autowired OnlineXfAcDepService onlineXfAcDepService;
    @Autowired DtAcTypeService dtAcTypeService;
    @Autowired XfUserTimeService xfUserTimeService;


    public JsonResult<TradEntity> accessVerify(TradReqEntity tradReqEntity, TradEntity tradEntity){
        String userPassword = tradReqEntity.getUserPassword();
        String dbUserPassword = tradEntity.getDbUserPassword();
        boolean bRes = userPasswordVerify(dbUserPassword,userPassword);
        if(!bRes){
            return failMsg("密码错误");
        }

        short userType = tradEntity.getUserType();
        bRes = userStateVerify(userType);
        if(!bRes){
            return failMsg("人员类别错误");
        }

        Long userSerial = tradEntity.getUserSerial();
        String devSerial = tradReqEntity.getDevSerial();
        Integer userDep = tradEntity.getUserDep();
        Integer acDepSerial = tradEntity.getAcDepSerial();
        bRes = acDepVerify(userSerial,devSerial,userDep,acDepSerial);
        if(!bRes){
            return failMsg("没有场所权限");
        }



        return succMsg("success");
    }

    private boolean userPasswordVerify(String dbUserPassword, String userPassword){
        if(!userPassword.equals("")){
            return userPassword.equals(dbUserPassword);
        }
        return true;
    }

    private boolean userStateVerify(Short userType){
        return userType > 50?false:true;
    }

    private boolean cardStateVerify(Integer cardType){
        return cardType == 0?true:false;
    }

    private boolean acDepVerify(Long userSerial,String devSerial,Integer userDep,Integer acDepSerial){
        DtAcDepUserEntity dtAcDepUserEntity = dtAcDepUserService.selectByPrimaryKey(userSerial,devSerial);
        if(null != dtAcDepUserEntity){
            return true;
        }

        OnlineXfAcDepEntity onlineXfAcDepEntity = onlineXfAcDepService.selectByPrimaryKey(userDep,acDepSerial);
        if(null != onlineXfAcDepEntity){
            return true;
        }
        return false;
    }


    private JsonResult limitVerify(String acType){

        DtAcTypeEntity dtAcTypeEntity = dtAcTypeService.selectByPrimaryKey(acType);
        if(null == dtAcTypeEntity){
            return failMsg("未找到账户类型信息");
        }

        xfUserTimeService.selectByPrimaryKey()

        boolean bRes = dayLimitVerify();
        if(bRes){
            return failMsg("超日限");
        }
    }

    private boolean dayLimitVerify(){

    }

    private boolean mealLimitVerify(){

    }


}
