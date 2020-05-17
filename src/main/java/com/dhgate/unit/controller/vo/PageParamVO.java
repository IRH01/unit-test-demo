package com.dhgate.unit.controller.vo;

import com.dhgate.unit.base.PageBaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Description 业务描叙信息
 *
 * @author Created by Iritchie.ren on 2020/5/18.
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel
@Data
public class PageParamVO extends PageBaseVO {

    @ApiModelProperty(value = "模糊匹配名称")
    private String taskNameLike;
}
