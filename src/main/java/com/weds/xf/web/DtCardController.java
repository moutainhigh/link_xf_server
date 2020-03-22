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

import com.weds.xf.entity .DtCardEntity;
import com.weds.xf.service .DtCardService;

/**
 * @Author
 * @Description DtCard管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/dtCard")
@Api(value = "DtCard管理", description = "DtCard管理")
public class DtCardController extends BaseController{
	@Resource
	private DtCardService dtCardService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增DtCard信息", notes = "新增DtCard信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid DtCardEntity record) {
        				dtCardService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新DtCard信息", notes = "更新DtCard信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid DtCardEntity record) {
        		dtCardService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除DtCard信息", notes = "删除DtCard信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam String cardSerial) {
        dtCardService.deleteByPrimaryKey(cardSerial);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询DtCard信息", notes = "查询DtCard信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<DtCardEntity> selectByPrimaryKey(@RequestParam String cardSerial) {
		DtCardEntity entity = dtCardService.selectByPrimaryKey(cardSerial);
                return succMsgData(entity);
	}
	

	
	}