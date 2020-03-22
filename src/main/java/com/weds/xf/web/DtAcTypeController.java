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

import com.weds.xf.entity .DtAcTypeEntity;
import com.weds.xf.service .DtAcTypeService;

/**
 * @Author
 * @Description DtAcType管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/dtAcType")
@Api(value = "DtAcType管理", description = "DtAcType管理")
public class DtAcTypeController extends BaseController{
	@Resource
	private DtAcTypeService dtAcTypeService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增DtAcType信息", notes = "新增DtAcType信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid DtAcTypeEntity record) {
        				dtAcTypeService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新DtAcType信息", notes = "更新DtAcType信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid DtAcTypeEntity record) {
        		dtAcTypeService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除DtAcType信息", notes = "删除DtAcType信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam String acBh) {
        dtAcTypeService.deleteByPrimaryKey(acBh);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询DtAcType信息", notes = "查询DtAcType信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<DtAcTypeEntity> selectByPrimaryKey(@RequestParam String acBh) {
		DtAcTypeEntity entity = dtAcTypeService.selectByPrimaryKey(acBh);
                return succMsgData(entity);
	}
	

	
	}