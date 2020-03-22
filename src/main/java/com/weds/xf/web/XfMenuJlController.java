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

import com.weds.xf.entity .XfMenuJlEntity;
import com.weds.xf.service .XfMenuJlService;

/**
 * @Author
 * @Description XfMenuJl管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/xfMenuJl")
@Api(value = "XfMenuJl管理", description = "XfMenuJl管理")
public class XfMenuJlController extends BaseController{
	@Resource
	private XfMenuJlService xfMenuJlService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增XfMenuJl信息", notes = "新增XfMenuJl信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid XfMenuJlEntity record) {
        				xfMenuJlService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新XfMenuJl信息", notes = "更新XfMenuJl信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid XfMenuJlEntity record) {
        		xfMenuJlService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除XfMenuJl信息", notes = "删除XfMenuJl信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam Integer xh) {
        xfMenuJlService.deleteByPrimaryKey(xh);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询XfMenuJl信息", notes = "查询XfMenuJl信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<XfMenuJlEntity> selectByPrimaryKey(@RequestParam Integer xh) {
		XfMenuJlEntity entity = xfMenuJlService.selectByPrimaryKey(xh);
                return succMsgData(entity);
	}

	
	}