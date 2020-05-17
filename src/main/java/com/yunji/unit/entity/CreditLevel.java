package com.yunji.unit.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * Description: 等级配置
 * @author Iritchie.ren
 * @date 2020-05-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("credit_level")
public class CreditLevel implements Serializable {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;

    /**
     * 等级编号
     */
	@TableField("level")
	private Integer level;

    /**
     * 等级名称
     */
	@TableField("level_name")
	private String levelName;

    /**
     * 等级图片地址url
     */
	@TableField("level_img")
	private String levelImg;

    /**
     * 累计获得信用分的临界值
     */
	@TableField("score_crisis")
	private Integer scoreCrisis;

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
