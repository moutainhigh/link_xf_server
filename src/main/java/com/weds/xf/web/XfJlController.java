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

import com.weds.xf.entity .XfJlEntity;
import com.weds.xf.service .XfJlService;

/**
 * @Author
 * @Description XfJl管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/xfJl")
@Api(value = "XfJl管理", description = "XfJl管理")
public class XfJlController extends BaseController{
	@Resource
	private XfJlService xfJlService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增XfJl信息", notes = "新增XfJl信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid XfJlEntity record) {
        				xfJlService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新XfJl信息", notes = "更新XfJl信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid XfJlEntity record) {
        		xfJlService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除XfJl信息", notes = "删除XfJl信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam Integer xh) {
        xfJlService.deleteByPrimaryKey(xh);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询XfJl信息", notes = "查询XfJl信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<XfJlEntity> selectByPrimaryKey(@RequestParam Integer xh) {
		XfJlEntity entity = xfJlService.selectByPrimaryKey(xh);
                return succMsgData(entity);
	}
	


	
	}