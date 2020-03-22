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

import com.weds.xf.entity .XfMxEntity;
import com.weds.xf.service .XfMxService;

/**
 * @Author
 * @Description XfMx管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/xfMx")
@Api(value = "XfMx管理", description = "XfMx管理")
public class XfMxController extends BaseController{
	@Resource
	private XfMxService xfMxService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增XfMx信息", notes = "新增XfMx信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid XfMxEntity record) {
        				xfMxService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新XfMx信息", notes = "更新XfMx信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid XfMxEntity record) {
        		xfMxService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除XfMx信息", notes = "删除XfMx信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam Integer xh) {
        xfMxService.deleteByPrimaryKey(xh);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询XfMx信息", notes = "查询XfMx信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<XfMxEntity> selectByPrimaryKey(@RequestParam Integer xh) {
		XfMxEntity entity = xfMxService.selectByPrimaryKey(xh);
                return succMsgData(entity);
	}

	
	}