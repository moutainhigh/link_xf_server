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

import com.weds.xf.entity .DtAcUserEntity;
import com.weds.xf.service .DtAcUserService;

/**
 * @Author
 * @Description DtAcUser管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/dtAcUser")
@Api(value = "DtAcUser管理", description = "DtAcUser管理")
public class DtAcUserController extends BaseController{
	@Resource
	private DtAcUserService dtAcUserService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增DtAcUser信息", notes = "新增DtAcUser信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid DtAcUserEntity record) {
        				dtAcUserService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新DtAcUser信息", notes = "更新DtAcUser信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid DtAcUserEntity record) {
        		dtAcUserService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除DtAcUser信息", notes = "删除DtAcUser信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam Long userSerial) {
        dtAcUserService.deleteByPrimaryKey(userSerial);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询DtAcUser信息", notes = "查询DtAcUser信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<DtAcUserEntity> selectByPrimaryKey(@RequestParam Long userSerial) {
		DtAcUserEntity entity = dtAcUserService.selectByPrimaryKey(userSerial);
                return succMsgData(entity);
	}
	

	
	}