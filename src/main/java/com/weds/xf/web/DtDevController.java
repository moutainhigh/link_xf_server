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

import com.weds.xf.entity .DtDevEntity;
import com.weds.xf.service .DtDevService;

/**
 * @Author
 * @Description DtDev管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/dtDev")
@Api(value = "DtDev管理", description = "DtDev管理")
public class DtDevController extends BaseController{
	@Resource
	private DtDevService dtDevService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增DtDev信息", notes = "新增DtDev信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid DtDevEntity record) {
        				dtDevService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新DtDev信息", notes = "更新DtDev信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid DtDevEntity record) {
        		dtDevService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除DtDev信息", notes = "删除DtDev信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam Integer xh) {
        dtDevService.deleteByPrimaryKey(xh);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询DtDev信息", notes = "查询DtDev信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<DtDevEntity> selectByPrimaryKey(@RequestParam Integer xh) {
		DtDevEntity entity = dtDevService.selectByPrimaryKey(xh);
                return succMsgData(entity);
	}
	

	
	}