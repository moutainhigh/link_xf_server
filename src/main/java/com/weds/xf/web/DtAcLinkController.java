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

import com.weds.xf.entity .DtAcLinkEntity;
import com.weds.xf.service .DtAcLinkService;

/**
 * @Author
 * @Description DtAcLink管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/dtAcLink")
@Api(value = "DtAcLink管理", description = "DtAcLink管理")
public class DtAcLinkController extends BaseController{
	@Resource
	private DtAcLinkService dtAcLinkService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增DtAcLink信息", notes = "新增DtAcLink信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid DtAcLinkEntity record) {
        				dtAcLinkService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新DtAcLink信息", notes = "更新DtAcLink信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid DtAcLinkEntity record) {
        		dtAcLinkService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除DtAcLink信息", notes = "删除DtAcLink信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam Long userSerial) {
        dtAcLinkService.deleteByPrimaryKey(userSerial);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询DtAcLink信息", notes = "查询DtAcLink信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<DtAcLinkEntity> selectByPrimaryKey(@RequestParam Long userSerial) {
		DtAcLinkEntity entity = dtAcLinkService.selectByPrimaryKey(userSerial);
                return succMsgData(entity);
	}
	

	
	}