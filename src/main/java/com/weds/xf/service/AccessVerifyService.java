package com.weds.xf.service;

import com.weds.core.base.BaseService;
import com.weds.core.resp.JsonResult;
import com.weds.xf.entity.TradEntity;
import com.weds.xf.entity.TradReqEntity;
import org.springframework.stereotype.Service;

/**
 * @Author
 * @Description 权限判断
 * @Date 2020-03-05
 */
@Service
public class AccessVerifyService extends BaseService {

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

}
