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

import com.weds.xf.entity .DtAcDepUserEntity;
import com.weds.xf.service .DtAcDepUserService;

/**
 * @Author
 * @Description DtAcDepUser管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/dtAcDepUser")
@Api(value = "DtAcDepUser管理", description = "DtAcDepUser管理")
public class DtAcDepUserController extends BaseController{
	@Resource
	private DtAcDepUserService dtAcDepUserService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增DtAcDepUser信息", notes = "新增DtAcDepUser信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid DtAcDepUserEntity record) {
        				dtAcDepUserService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新DtAcDepUser信息", notes = "更新DtAcDepUser信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid DtAcDepUserEntity record) {
        		dtAcDepUserService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除DtAcDepUser信息", notes = "删除DtAcDepUser信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam Integer xh) {
        dtAcDepUserService.deleteByPrimaryKey(xh);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询DtAcDepUser信息", notes = "查询DtAcDepUser信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<DtAcDepUserEntity> selectByPrimaryKey(@RequestParam Integer xh) {
		DtAcDepUserEntity entity = dtAcDepUserService.selectByPrimaryKey(xh);
                return succMsgData(entity);
	}
	

	
	}