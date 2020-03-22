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

import com.weds.xf.entity .DtAcDepEntity;
import com.weds.xf.service .DtAcDepService;

/**
 * @Author
 * @Description DtAcDep管理
 * @Date 2020-03-22
 */
@RestController
@RequestMapping(value="/dtAcDep")
@Api(value = "DtAcDep管理", description = "DtAcDep管理")
public class DtAcDepController extends BaseController{
	@Resource
	private DtAcDepService dtAcDepService;

    
	
	private Logger log = LogManager.getLogger();

    @Logs
	@ApiOperation(value = "新增DtAcDep信息", notes = "新增DtAcDep信息")
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public JsonResult<Object> insert(@RequestBody @Valid DtAcDepEntity record) {
        				dtAcDepService.insertSelective(record);
		return succMsg();
	}

	@Logs
	@ApiOperation(value = "更新DtAcDep信息", notes = "更新DtAcDep信息")
	@RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
	public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid DtAcDepEntity record) {
        		dtAcDepService.updateByPrimaryKeySelective(record);
		return succMsg();
	}

	
		@Logs
	@ApiOperation(value = "删除DtAcDep信息", notes = "删除DtAcDep信息")
	@RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteByPrimaryKey(@RequestParam Integer depSerial) {
        dtAcDepService.deleteByPrimaryKey(depSerial);
        return succMsg();
	}

	@Logs
	@ApiOperation(value = "查询DtAcDep信息", notes = "查询DtAcDep信息")
	@RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
	public JsonResult<DtAcDepEntity> selectByPrimaryKey(@RequestParam Integer depSerial) {
		DtAcDepEntity entity = dtAcDepService.selectByPrimaryKey(depSerial);
                return succMsgData(entity);
	}
	

	
	}