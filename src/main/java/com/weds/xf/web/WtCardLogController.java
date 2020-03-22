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

import com.weds.xf.entity .WtCardLogEntity;
import com.weds.xf.service .WtCardLogService;

/**
 * @Author
 * @Description WtCardLog管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/wtCardLog")
@Api(value = "WtCardLog管理", description = "WtCardLog管理")
public class WtCardLogController extends BaseController{
	@Resource
	private WtCardLogService wtCardLogService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增WtCardLog信息", notes = "新增WtCardLog信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid WtCardLogEntity record) {
        				wtCardLogService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新WtCardLog信息", notes = "更新WtCardLog信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid WtCardLogEntity record) {
        		wtCardLogService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除WtCardLog信息", notes = "删除WtCardLog信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam Integer xh) {
        wtCardLogService.deleteByPrimaryKey(xh);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询WtCardLog信息", notes = "查询WtCardLog信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<WtCardLogEntity> selectByPrimaryKey(@RequestParam Integer xh) {
		WtCardLogEntity entity = wtCardLogService.selectByPrimaryKey(xh);
                return succMsgData(entity);
	}
	

	
	}