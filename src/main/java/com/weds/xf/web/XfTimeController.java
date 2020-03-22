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

import com.weds.xf.entity .XfTimeEntity;
import com.weds.xf.service .XfTimeService;

/**
 * @Author
 * @Description XfTime管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/xfTime")
@Api(value = "XfTime管理", description = "XfTime管理")
public class XfTimeController extends BaseController{
	@Resource
	private XfTimeService xfTimeService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增XfTime信息", notes = "新增XfTime信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid XfTimeEntity record) {
        				xfTimeService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新XfTime信息", notes = "更新XfTime信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid XfTimeEntity record) {
        		xfTimeService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除XfTime信息", notes = "删除XfTime信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam String bh) {
        xfTimeService.deleteByPrimaryKey(bh);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询XfTime信息", notes = "查询XfTime信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<XfTimeEntity> selectByPrimaryKey(@RequestParam String bh) {
		XfTimeEntity entity = xfTimeService.selectByPrimaryKey(bh);
                return succMsgData(entity);
	}
	

	
	}