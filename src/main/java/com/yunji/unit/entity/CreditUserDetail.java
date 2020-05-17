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
 * Description: 用户信用分详情
 * @author Iritchie.ren
 * @date 2020-05-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("credit_user_detail")
public class CreditUserDetail implements Serializable {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;

    /**
     * 用户ID
     */
	@TableField("consumer_id")
	private Integer consumerId;

    /**
     * 用户店铺ID
     */
	@TableField("shop_id")
	private Integer shopId;

    /**
     * 当前信用分余额
     */
	@TableField("total_score")
	private Integer totalScore;

    /**
     * 累计获得信用分
     */
	@TableField("gain_score")
	private Integer gainScore;

    /**
     * 购买试用商品次数
     */
	@TableField("purchase_count")
	private Integer purchaseCount;

    /**
     * 吐槽次数
     */
	@TableField("spitslot_count")
	private Integer spitslotCount;

    /**
     * 数据版本号，用来做乐观锁
     */
	@TableField("version")
	private Long version;

    /**
     * 最近登录潘多拉时间
     */
	@TableField("login_time")
	private Date loginTime;

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
