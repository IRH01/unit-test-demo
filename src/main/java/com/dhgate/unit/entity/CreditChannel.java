package com.dhgate.unit.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

/**
 * Description: 信用分渠道配置
 * @author Iritchie.ren
 * @date 2020-05-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("credit_channel")
public class CreditChannel implements Serializable {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;

    /**
     * 对外的固定唯一对接码，有含义的字符串
     */
	@TableField("task_code")
	private String taskCode;

    /**
     * 任务名称
     */
	@TableField("task_name")
	private String taskName;

    /**
     * 任务图片url
     */
	@TableField("task_img")
	private String taskImg;

    /**
     * 跳转链接类型（1-投票众测 2-反馈 3-上传素材 4-推广订单 5-潘多拉频道）
     */
	@TableField("redirect_type")
	private Integer redirectType;

    /**
     * 单次额度（单次任务获得的信用分）
     */
	@TableField("unit_score")
	private Integer unitScore;

    /**
     * 任务概述
     */
	@TableField("task_desc")
	private String taskDesc;

    /**
     * 渠道信用币总额
     */
	@TableField("total_score")
	private Integer totalScore;

    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;

    /**
     * 修改时间
     */
	@TableField("modify_time")
	private Date modifyTime;

    /**
     * (是否被删除：0-否 1-是，平台规范要求字段，业务暂时没用到 )
     */
	@TableField("is_deleted")
	private Boolean isDeleted;



}
