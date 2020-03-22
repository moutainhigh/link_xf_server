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

import com.weds.xf.entity .StDeviceEntity;
import com.weds.xf.service .StDeviceService;

/**
 * @Author
 * @Description StDevice管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/stDevice")
@Api(value = "StDevice管理", description = "StDevice管理")
public class StDeviceController extends BaseController{
	@Resource
	private StDeviceService stDeviceService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增StDevice信息", notes = "新增StDevice信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid StDeviceEntity record) {
        				stDeviceService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新StDevice信息", notes = "更新StDevice信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid StDeviceEntity record) {
        		stDeviceService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除StDevice信息", notes = "删除StDevice信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam String bh) {
        stDeviceService.deleteByPrimaryKey(bh);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询StDevice信息", notes = "查询StDevice信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<StDeviceEntity> selectByPrimaryKey(@RequestParam String bh) {
		StDeviceEntity entity = stDeviceService.selectByPrimaryKey(bh);
                return succMsgData(entity);
	}
	

	
	}