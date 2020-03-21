package com.weds.xf.web;

import com.weds.core.annotation.Logs;
import com.weds.core.base.BaseController;
import com.weds.core.resp.JsonResult;
import com.weds.xf.entity.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

/**
 * @Author zlb
 * @Description 处理终端请求
 * @Date 2020-03-21
 */
@RestController
@RequestMapping(value = "/xf")
@Api(value = "处理终端请求", description = "处理终端请求")
public class MainController extends BaseController {


    @Resource
    private HttpServletResponse response;

    private Logger log = LogManager.getLogger();

    @Logs
    @ApiOperation(value = "在线交易请求", notes = "在线交易请求")
    @RequestMapping(value = "/trad", method = RequestMethod.POST)
    public JsonResult<TradResEntity> trad(@RequestBody @Valid TradReqEntity record) {
        TradResEntity res = new TradResEntity();

        return succMsgData(res);
    }

    @Logs
    @ApiOperation(value = "撤销请求", notes = "撤销请求")
    @RequestMapping(value = "/undo", method = RequestMethod.POST)
    public JsonResult<UndoResEntity> undo(@RequestBody @Valid UndoReqEntity record) {
        UndoResEntity res = new UndoResEntity();

        return succMsgData(res);
    }

    @Logs
    @ApiOperation(value = "冲正请求", notes = "冲正请求")
    @RequestMapping(value = "/recovery", method = RequestMethod.POST)
    public JsonResult<RecoveryResEntity> recovery(@RequestBody @Valid RecoveryReqEntity record) {
        RecoveryResEntity res = new RecoveryResEntity();

        return succMsgData(res);
    }

    @Logs
    @ApiOperation(value = "查询请求", notes = "查询请求")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public JsonResult<QueryResEntity> query(@RequestBody @Valid QueryReqEntity record) {
        QueryResEntity res = new QueryResEntity();

        return succMsgData(res);
    }

    @Logs
    @ApiOperation(value = "离线记录上传", notes = "离线记录上传")
    @RequestMapping(value = "/recordUpload", method = RequestMethod.POST)
    public JsonResult recordUpload(@RequestBody @Valid List<RecordReqEntity> list) {
        TradResEntity res = new TradResEntity();
        return succMsg("success");
    }

}