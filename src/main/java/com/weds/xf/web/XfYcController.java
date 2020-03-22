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

import com.weds.xf.entity .XfYcEntity;
import com.weds.xf.service .XfYcService;

/**
 * @Author
 * @Description XfYc管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/xfYc")
@Api(value = "XfYc管理", description = "XfYc管理")
public class XfYcController extends BaseController{
	@Resource
	private XfYcService xfYcService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增XfYc信息", notes = "新增XfYc信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid XfYcEntity record) {
        				xfYcService.insertSelective(record);
		return succMsg();
	}



	
	}