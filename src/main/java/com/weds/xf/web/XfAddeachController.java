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

import com.weds.xf.entity .XfAddeachEntity;
import com.weds.xf.service .XfAddeachService;

/**
 * @Author
 * @Description XfAddeach管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/xfAddeach")
@Api(value = "XfAddeach管理", description = "XfAddeach管理")
public class XfAddeachController extends BaseController{
	@Resource
	private XfAddeachService xfAddeachService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增XfAddeach信息", notes = "新增XfAddeach信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid XfAddeachEntity record) {
        				xfAddeachService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新XfAddeach信息", notes = "更新XfAddeach信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid XfAddeachEntity record) {
        		xfAddeachService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除XfAddeach信息", notes = "删除XfAddeach信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam Integer xh) {
        xfAddeachService.deleteByPrimaryKey(xh);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询XfAddeach信息", notes = "查询XfAddeach信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<XfAddeachEntity> selectByPrimaryKey(@RequestParam Integer xh) {
		XfAddeachEntity entity = xfAddeachService.selectByPrimaryKey(xh);
                return succMsgData(entity);
	}
	

	
	}