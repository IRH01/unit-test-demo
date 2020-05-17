DROP TABLE IF EXISTS credit_channel;
CREATE TABLE `credit_channel`
(
    `id`            int(11)      NOT NULL AUTO_INCREMENT,
    `task_code`     varchar(50)  NOT NULL DEFAULT '' COMMENT '对外的固定唯一对接码，有含义的字符串',
    `task_name`     varchar(16)  NOT NULL DEFAULT '' COMMENT '任务名称',
    `task_img`      varchar(512) NOT NULL DEFAULT '' COMMENT '任务图片url',
    `redirect_type` tinyint(2)   NOT NULL DEFAULT '0' COMMENT '跳转链接类型（1-投票众测 2-反馈 3-上传素材 4-推广订单 5-潘多拉频道）',
    `unit_score`    int(11)      NOT NULL DEFAULT '0' COMMENT '单次额度（单次任务获得的信用分）',
    `task_desc`     varchar(256) NOT NULL DEFAULT '' COMMENT '任务概述',
    `total_score`   int(11)      NOT NULL DEFAULT '0' COMMENT '渠道信用币总额',
    `create_time`   timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_time`   timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    `is_deleted`    tinyint(1)   NOT NULL DEFAULT '0' COMMENT '(是否被删除：0-否 1-是，平台规范要求字段，业务暂时没用到 )',
    PRIMARY KEY (`id`) USING BTREE,
    UNIQUE KEY `uk_task_code` (`task_code`) USING BTREE,
    KEY `idx_create_time` (`create_time`) USING BTREE,
    KEY `idx_modify_time` (`modify_time`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = COMPACT COMMENT ='信用分渠道配置';

DROP TABLE IF EXISTS credit_level;
CREATE TABLE `credit_level`
(
    `id`           int(11)      NOT NULL AUTO_INCREMENT,
    `level`        int(11)      NOT NULL DEFAULT '0' COMMENT '等级编号',
    `level_name`   varchar(16)  NOT NULL DEFAULT '' COMMENT '等级名称',
    `level_img`    varchar(512) NOT NULL DEFAULT '' COMMENT '等级图片地址url',
    `score_crisis` int(11)      NOT NULL DEFAULT '0' COMMENT '累计获得信用分的临界值',
    `create_time`  timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_time`  timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    `is_deleted`   tinyint(1)   NOT NULL DEFAULT '0' COMMENT '(是否被删除：0-否 1-是，平台规范要求字段，业务暂时没用到 )',
    PRIMARY KEY (`id`) USING BTREE,
    KEY `idx_create_time` (`create_time`) USING BTREE,
    KEY `idx_modify_time` (`modify_time`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = COMPACT COMMENT ='等级配置';

DROP TABLE IF EXISTS credit_user_detail;
CREATE TABLE `credit_user_detail`
(
    `id`             int(11)    NOT NULL AUTO_INCREMENT,
    `consumer_id`    int(11)    NOT NULL DEFAULT '0' COMMENT '用户ID',
    `shop_id`        int(11)    NOT NULL DEFAULT '0' COMMENT '用户店铺ID',
    `total_score`    int(11)    NOT NULL DEFAULT '0' COMMENT '当前信用分余额',
    `gain_score`     int(11)    NOT NULL DEFAULT '0' COMMENT '累计获得信用分',
    `purchase_count` int(11)    NOT NULL DEFAULT '0' COMMENT '购买试用商品次数',
    `spitslot_count` int(11)    NOT NULL DEFAULT '0' COMMENT '吐槽次数',
    `version`        bigint(20) NOT NULL DEFAULT '0' COMMENT '数据版本号，用来做乐观锁',
    `login_time`     timestamp  NULL     DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近登录潘多拉时间',
    `create_time`    timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_time`    timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    `is_deleted`     tinyint(1) NOT NULL DEFAULT '0' COMMENT '(是否被删除：0-否 1-是，平台规范要求字段，业务暂时没用到 )',
    PRIMARY KEY (`id`) USING BTREE,
    UNIQUE KEY `uk_consumer_id` (`consumer_id`) USING BTREE,
    UNIQUE KEY `uk_shop_id` (`shop_id`) USING BTREE,
    KEY `idx_create_time` (`create_time`) USING BTREE,
    KEY `idx_modify_time` (`modify_time`) USING BTREE,
    KEY `idx_total_score` (`total_score`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = COMPACT COMMENT ='用户信用分详情';