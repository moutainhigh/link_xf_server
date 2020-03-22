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

import com.weds.xf.entity .XfJlYcEntity;
import com.weds.xf.service .XfJlYcService;

/**
 * @Author
 * @Description XfJlYc管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/xfJlYc")
@Api(value = "XfJlYc管理", description = "XfJlYc管理")
public class XfJlYcController extends BaseController{
	@Resource
	private XfJlYcService xfJlYcService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增XfJlYc信息", notes = "新增XfJlYc信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid XfJlYcEntity record) {
        				xfJlYcService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新XfJlYc信息", notes = "更新XfJlYc信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid XfJlYcEntity record) {
        		xfJlYcService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除XfJlYc信息", notes = "删除XfJlYc信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam Integer xh) {
        xfJlYcService.deleteByPrimaryKey(xh);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询XfJlYc信息", notes = "查询XfJlYc信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<XfJlYcEntity> selectByPrimaryKey(@RequestParam Integer xh) {
		XfJlYcEntity entity = xfJlYcService.selectByPrimaryKey(xh);
                return succMsgData(entity);
	}
	

	}