package com.dhgate.unit.controller;


import com.dhgate.unit.base.BaseController;
import com.dhgate.unit.base.DataResponse;
import com.dhgate.unit.base.NullObject;
import com.dhgate.unit.entity.CreditUserDetail;
import com.dhgate.unit.service.CreditUserDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description: 用户信用分详情 服务实现类
 *
 * @author Iritchie.ren
 * @date 2020-05-15
 */
@RestController
@RequestMapping("creditUserDetail")
@Api(value = "creditUserDetail", tags = "CreditUserDetailController")
@Slf4j
public class CreditUserDetailController extends BaseController {

    @Autowired
    private CreditUserDetailService creditUserDetailService;


    @PostMapping(value = "/add", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "新增")
    public DataResponse<NullObject> add(@RequestBody CreditUserDetail creditUserDetail) {
        this.creditUserDetailService.add(creditUserDetail);
        return DataResponse.buildSuccess();
    }

    @PostMapping(value = "/update", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "修改")
    public DataResponse<NullObject> update(@RequestBody CreditUserDetail creditUserDetail) {
        this.creditUserDetailService.update(creditUserDetail);
        return DataResponse.buildSuccess();
    }

    @GetMapping(value = "/getById", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "根据id查询详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键ID", required = true)
    })
    public DataResponse<CreditUserDetail> getById(@RequestParam Integer id) {
        CreditUserDetail creditUserDetail = this.creditUserDetailService.getById(id);
        return DataResponse.buildSuccess(creditUserDetail);
    }

    @PostMapping(value = "/findBatchIds", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "根据id列表批量查询详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "idList", value = "主键id列表", required = true)
    })
    public DataResponse<List<CreditUserDetail>> findBatchIds(@RequestParam List<Integer> idList) {
        List<CreditUserDetail> creditUserDetailList = this.creditUserDetailService.findBatchIds(idList);
        return DataResponse.buildSuccess(creditUserDetailList);
    }

}

