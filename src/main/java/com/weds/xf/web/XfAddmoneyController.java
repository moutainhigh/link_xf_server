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

import com.weds.xf.entity .XfAddmoneyEntity;
import com.weds.xf.service .XfAddmoneyService;

/**
 * @Author
 * @Description XfAddmoney管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/xfAddmoney")
@Api(value = "XfAddmoney管理", description = "XfAddmoney管理")
public class XfAddmoneyController extends BaseController{
	@Resource
	private XfAddmoneyService xfAddmoneyService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增XfAddmoney信息", notes = "新增XfAddmoney信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid XfAddmoneyEntity record) {
        				xfAddmoneyService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新XfAddmoney信息", notes = "更新XfAddmoney信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid XfAddmoneyEntity record) {
        		xfAddmoneyService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除XfAddmoney信息", notes = "删除XfAddmoney信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam Integer xh) {
        xfAddmoneyService.deleteByPrimaryKey(xh);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询XfAddmoney信息", notes = "查询XfAddmoney信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<XfAddmoneyEntity> selectByPrimaryKey(@RequestParam Integer xh) {
		XfAddmoneyEntity entity = xfAddmoneyService.selectByPrimaryKey(xh);
                return succMsgData(entity);
	}
	


	
	}