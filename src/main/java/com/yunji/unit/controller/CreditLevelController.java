package com.yunji.unit.controller;


import com.yunji.unit.base.BaseController;
import com.yunji.unit.base.DataResponse;
import com.yunji.unit.base.NullObject;
import com.yunji.unit.entity.CreditLevel;
import com.yunji.unit.service.CreditLevelService;
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
 * Description: 等级配置 服务实现类
 *
 * @author Iritchie.ren
 * @date 2020-05-15
 */
@RestController
@RequestMapping("creditLevel")
@Api(value = "creditLevel" , tags = "CreditLevelController")
@Slf4j
public class CreditLevelController extends BaseController {

    @Autowired
    private CreditLevelService creditLevelService;


    @PostMapping("/add")
    @ApiOperation(value = "新增")
    public DataResponse<NullObject> add(@RequestBody CreditLevel creditLevel) {
        this.creditLevelService.add(creditLevel);
        return DataResponse.buildSuccess();
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改")
    public DataResponse<NullObject> update(@RequestBody CreditLevel creditLevel) {
        this.creditLevelService.update(creditLevel);
        return DataResponse.buildSuccess();
    }

    @GetMapping("/getById")
    @ApiOperation(value = "根据id查询详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id" , value = "主键ID" , required = true)
    })
    public DataResponse<CreditLevel> getById(@RequestParam Integer id) {
        CreditLevel creditLevel = this.creditLevelService.getById(id);
        return DataResponse.buildSuccess(creditLevel);
    }

    @PostMapping("/findBatchIds")
    @ApiOperation(value = "根据id列表批量查询详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "idList" , value = "主键id列表" , required = true)
    })
    public DataResponse<List<CreditLevel>> findBatchIds(@RequestParam List<Integer> idList) {
        List<CreditLevel> creditLevelList = this.creditLevelService.findBatchIds(idList);
        return DataResponse.buildSuccess(creditLevelList);
    }

}

