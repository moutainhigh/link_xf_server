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

import com.weds.xf.entity .OnlineXfAcDepEntity;
import com.weds.xf.service .OnlineXfAcDepService;

/**
 * @Author
 * @Description OnlineXfAcDep管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/onlineXfAcDep")
@Api(value = "OnlineXfAcDep管理", description = "OnlineXfAcDep管理")
public class OnlineXfAcDepController extends BaseController{
	@Resource
	private OnlineXfAcDepService onlineXfAcDepService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增OnlineXfAcDep信息", notes = "新增OnlineXfAcDep信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid OnlineXfAcDepEntity record) {
        				onlineXfAcDepService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新OnlineXfAcDep信息", notes = "更新OnlineXfAcDep信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid OnlineXfAcDepEntity record) {
        		onlineXfAcDepService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除OnlineXfAcDep信息", notes = "删除OnlineXfAcDep信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam Integer depSerial, @RequestParam Integer acSerial) {
        onlineXfAcDepService.deleteByPrimaryKey(depSerial, acSerial);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询OnlineXfAcDep信息", notes = "查询OnlineXfAcDep信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<OnlineXfAcDepEntity> selectByPrimaryKey(@RequestParam Integer depSerial, @RequestParam Integer acSerial) {
		OnlineXfAcDepEntity entity = onlineXfAcDepService.selectByPrimaryKey(depSerial, acSerial);
                return succMsgData(entity);
	}
	

	
	}