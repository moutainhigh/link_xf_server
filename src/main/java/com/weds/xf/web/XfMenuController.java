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

import com.weds.xf.entity .XfMenuEntity;
import com.weds.xf.service .XfMenuService;

/**
 * @Author
 * @Description XfMenu管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/xfMenu")
@Api(value = "XfMenu管理", description = "XfMenu管理")
public class XfMenuController extends BaseController{
	@Resource
	private XfMenuService xfMenuService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增XfMenu信息", notes = "新增XfMenu信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid XfMenuEntity record) {
        				xfMenuService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新XfMenu信息", notes = "更新XfMenu信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid XfMenuEntity record) {
        		xfMenuService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除XfMenu信息", notes = "删除XfMenu信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam Integer xh) {
        xfMenuService.deleteByPrimaryKey(xh);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询XfMenu信息", notes = "查询XfMenu信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<XfMenuEntity> selectByPrimaryKey(@RequestParam Integer xh) {
		XfMenuEntity entity = xfMenuService.selectByPrimaryKey(xh);
                return succMsgData(entity);
	}
	

	
	}