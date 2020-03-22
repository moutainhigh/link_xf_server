package com.weds.xf .web;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import javax.validation.Valid;

import com.weds.core.base.BaseController;
import com.weds.core.annotation.Logs;
import com.weds.core.resp.JsonResult;
import com.weds.core.base.BaseCommPager;
import com.weds.core.base.BasePageSearch;

import com.weds.xf.entity .DtUserEntity;
import com.weds.xf.service .DtUserService;

/**
 * @Author
 * @Description DtUser管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/dtUser")
@Api(value = "DtUser管理", description = "DtUser管理")
public class DtUserController extends BaseController{
	@Resource
	private DtUserService dtUserService;

    
	
	private Logger log = LogManager.getLogger();


	@Logs
	@ApiOperation(value = "查询DtUser信息", notes = "查询DtUser信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<DtUserEntity> selectByPrimaryKey() {
		DtUserEntity entity = dtUserService.selectByPrimaryKey();
                return succMsgData(entity);
	}
	

	
	}