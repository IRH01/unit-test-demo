package com.yunji.unit.controller;


import com.yunji.unit.base.BaseController;
import com.yunji.unit.base.DataResponse;
import com.yunji.unit.base.NullObject;
import com.yunji.unit.entity.CreditChannel;
import com.yunji.unit.service.CreditChannelService;
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
 * Description: 信用分渠道配置 服务实现类
 *
 * @author Iritchie.ren
 * @date 2020-05-15
 */
@RestController
@RequestMapping("creditChannel")
@Api(value = "creditChannel", tags = "CreditChannelController")
@Slf4j
public class CreditChannelController extends BaseController {

    @Autowired
    private CreditChannelService creditChannelService;


    @PostMapping("/add")
    @ApiOperation(value = "新增")
    public DataResponse<NullObject> add(@RequestBody CreditChannel creditChannel) {
        this.creditChannelService.add(creditChannel);
        return DataResponse.buildSuccess();
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改")
    public DataResponse<NullObject> update(@RequestBody CreditChannel creditChannel) {
        this.creditChannelService.update(creditChannel);
        return DataResponse.buildSuccess();
    }

    @GetMapping(value = "/getById")
    @ApiOperation(value = "根据id查询详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键ID", required = true)
    })
    public DataResponse<CreditChannel> getById(@RequestParam Integer id) {
        CreditChannel creditChannel = this.creditChannelService.getById(id);
        return DataResponse.buildSuccess(creditChannel);
    }

    @PostMapping("/findBatchIds")
    @ApiOperation(value = "根据id列表批量查询详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "idList", value = "主键id列表", required = true)
    })
    public DataResponse<List<CreditChannel>> findBatchIds(@RequestBody List<Integer> idList) {
        List<CreditChannel> creditChannelList = this.creditChannelService.findBatchIds(idList);
        return DataResponse.buildSuccess(creditChannelList);
    }

    @GetMapping("/mock/demo")
    @ApiOperation(value = "根据id查询详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键ID", required = true)
    })
    public DataResponse<CreditChannel> mockDemo() {
        Integer id = 1;
        CreditChannel creditChannel = this.creditChannelService.findData(id);
        return DataResponse.buildSuccess(creditChannel);
    }

}

