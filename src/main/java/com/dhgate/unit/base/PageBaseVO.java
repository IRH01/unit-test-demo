package com.dhgate.unit.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Description 业务描叙信息
 *
 * @author Created by Iritchie.ren on 2020/5/18.
 */
@Data
@ApiModel
public class PageBaseVO implements Serializable {

    /**
     * 页大小
     */
    @NotNull
    @ApiModelProperty(value = "页大小")
    @Size(min = 0, max = 100)
    private Integer pageSize;

    /**
     * 页码
     */
    @NotNull
    @ApiModelProperty(value = "页码")
    @Min(value = 1)
    private Integer pageNum;
}
