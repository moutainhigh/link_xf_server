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

import com.weds.xf.entity .XfUserTimeEntity;
import com.weds.xf.service .XfUserTimeService;

/**
 * @Author
 * @Description XfUserTime管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/xfUserTime")
@Api(value = "XfUserTime管理", description = "XfUserTime管理")
public class XfUserTimeController extends BaseController{
	@Resource
	private XfUserTimeService xfUserTimeService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增XfUserTime信息", notes = "新增XfUserTime信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid XfUserTimeEntity record) {
        				xfUserTimeService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新XfUserTime信息", notes = "更新XfUserTime信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid XfUserTimeEntity record) {
        		xfUserTimeService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除XfUserTime信息", notes = "删除XfUserTime信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam Integer xh) {
        xfUserTimeService.deleteByPrimaryKey(xh);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询XfUserTime信息", notes = "查询XfUserTime信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<XfUserTimeEntity> selectByPrimaryKey(@RequestParam Integer xh) {
		XfUserTimeEntity entity = xfUserTimeService.selectByPrimaryKey(xh);
                return succMsgData(entity);
	}
	

	
	}