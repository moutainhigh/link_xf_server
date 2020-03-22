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

import com.weds.xf.entity .LinkOfflineCzEntity;
import com.weds.xf.service .LinkOfflineCzService;

/**
 * @Author
 * @Description LinkOfflineCz管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/linkOfflineCz")
@Api(value = "LinkOfflineCz管理", description = "LinkOfflineCz管理")
public class LinkOfflineCzController extends BaseController{
	@Resource
	private LinkOfflineCzService linkOfflineCzService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增LinkOfflineCz信息", notes = "新增LinkOfflineCz信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid LinkOfflineCzEntity record) {
        				linkOfflineCzService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新LinkOfflineCz信息", notes = "更新LinkOfflineCz信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid LinkOfflineCzEntity record) {
        		linkOfflineCzService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除LinkOfflineCz信息", notes = "删除LinkOfflineCz信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam Integer xh) {
        linkOfflineCzService.deleteByPrimaryKey(xh);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询LinkOfflineCz信息", notes = "查询LinkOfflineCz信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<LinkOfflineCzEntity> selectByPrimaryKey(@RequestParam Integer xh) {
		LinkOfflineCzEntity entity = linkOfflineCzService.selectByPrimaryKey(xh);
                return succMsgData(entity);
	}
	

	
	}