insert into `credit_channel`(`id`, `task_code`, `task_name`, `task_img`, `redirect_type`, `unit_score`, `task_desc`,
                             `total_score`, `create_time`, `modify_time`, `is_deleted`)
values (1, 'open_box_given', '开盒有礼', 'http://static.dhgateglobal.com/qnUpload/frontend/pandora/credit/open.png', 1, 5,
        '登录潘多拉', 0, '2020-04-29 18:07:35', '2020-05-15 12:01:17', 0);

insert into `credit_channel`(`id`, `task_code`, `task_name`, `task_img`, `redirect_type`, `unit_score`, `task_desc`,
                             `total_score`, `create_time`, `modify_time`, `is_deleted`)
values (2, 'vote_given', '投票有礼', 'http://static.dhgateglobal.com/qnUpload/frontend/pandora/credit/vote.png', 2, 3,
        '成功参与众测投票', 0, '2020-05-06 19:11:43', '2020-05-15 12:03:27', 0);

insert into `credit_channel`(`id`, `task_code`, `task_name`, `task_img`, `redirect_type`, `unit_score`, `task_desc`,
                             `total_score`, `create_time`, `modify_time`, `is_deleted`)
values (3, 'feedback_given_for_4', '反馈有礼', 'http://static.dhgateglobal.com/qnUpload/frontend/pandora/credit/message.png',
        5, 5, '完成投递（如送到丰巢）超过4天完成试用反馈', 0, '2020-05-07 08:42:16', '2020-05-13 16:19:40', 0);

insert into `credit_channel`(`id`, `task_code`, `task_name`, `task_img`, `redirect_type`, `unit_score`, `task_desc`,
                             `total_score`, `create_time`, `modify_time`, `is_deleted`)
values (4, 'feedback_given_for_2_4', '反馈有礼',
        'http://static.dhgateglobal.com/qnUpload/frontend/pandora/credit/message.png', 5, 10, '完成投递（如送到丰巢）2天-4天内完成试用反馈',
        0, '2020-05-07 08:42:16', '2020-05-13 16:20:50', 0);

insert into `credit_channel`(`id`, `task_code`, `task_name`, `task_img`, `redirect_type`, `unit_score`, `task_desc`,
                             `total_score`, `create_time`, `modify_time`, `is_deleted`)
values (5, 'feedback_given_for_2', '反馈有礼', 'http://static.dhgateglobal.com/qnUpload/frontend/pandora/credit/message.png',
        5, 15, '完成投递（如送到丰巢）2天内完成试用反馈', 0, '2020-05-07 15:08:28', '2020-05-13 16:20:53', 0);

insert into `credit_channel`(`id`, `task_code`, `task_name`, `task_img`, `redirect_type`, `unit_score`, `task_desc`,
                             `total_score`, `create_time`, `modify_time`, `is_deleted`)
values (6, 'vomit_sign_excellent_given', '反馈有礼',
        'http://static.dhgateglobal.com/qnUpload/frontend/pandora/credit/message.png', 5, 5, '吐槽报告被评为优秀', 0,
        '2020-05-07 15:08:28', '2020-05-13 16:21:20', 0);

insert into `credit_channel`(`id`, `task_code`, `task_name`, `task_img`, `redirect_type`, `unit_score`, `task_desc`,
                             `total_score`, `create_time`, `modify_time`, `is_deleted`)
values (7, 'credit_deduct', '信用分扣减', 'http://www.baidu.com/meitu/a.jpg', 5, -5, '吐槽报告被取消评优，分值同步扣减', 0,
        '2020-05-07 15:55:22', '2020-05-11 15:27:11', 0);

insert into `credit_channel`(`id`, `task_code`, `task_name`, `task_img`, `redirect_type`, `unit_score`, `task_desc`,
                             `total_score`, `create_time`, `modify_time`, `is_deleted`)
values (8, 'seeding_given', '种草有礼', 'http://static.dhgateglobal.com/qnUpload/frontend/pandora/credit/grass.png', 5, 5,
        '为试用商品上传素材', 0, '2020-05-07 15:55:22', '2020-05-13 16:19:35', 0);

insert into `credit_channel`(`id`, `task_code`, `task_name`, `task_img`, `redirect_type`, `unit_score`, `task_desc`,
                             `total_score`, `create_time`, `modify_time`, `is_deleted`)
values (9, 'appear_given', '出单有礼', 'http://static.dhgateglobal.com/qnUpload/frontend/pandora/credit/order.png', 5, 5,
        '有效期社群出单≥1', 0, '2020-05-07 15:58:31', '2020-05-13 16:19:03', 0);

insert into `credit_channel`(`id`, `task_code`, `task_name`, `task_img`, `redirect_type`, `unit_score`, `task_desc`,
                             `total_score`, `create_time`, `modify_time`, `is_deleted`)
values (10, 'credit_deduct_for_cancel_order', '信用分扣减', 'http://www.baidu.com/tupian/task.jpg', 5, -5,
        '社群售出订单已取消，分值同步扣减', 0, '2020-05-07 15:58:31', '2020-05-15 11:26:30', 0);

insert into `credit_channel`(`id`, `task_code`, `task_name`, `task_img`, `redirect_type`, `unit_score`, `task_desc`,
                             `total_score`, `create_time`, `modify_time`, `is_deleted`)
values (11, 'credit_return', '信用分返还', 'http://www.baidu.com/meitu/a.jpg', 5, 20, '试用订单被取消，分值同步返还', 0,
        '2020-05-07 16:09:11', '2020-05-11 15:27:45', 0);

insert into `credit_channel`(`id`, `task_code`, `task_name`, `task_img`, `redirect_type`, `unit_score`, `task_desc`,
                             `total_score`, `create_time`, `modify_time`, `is_deleted`)
values (12, 'credit_deduct_expend', '试用商品', 'http://www.baidu.com/tupian/task.jpg', 5, -20, '购买试用消耗信用分，分值同步扣减', 0,
        '2020-05-07 16:09:11', '2020-05-15 11:15:30', 0);

insert into `credit_channel`(`id`, `task_code`, `task_name`, `task_img`, `redirect_type`, `unit_score`, `task_desc`,
                             `total_score`, `create_time`, `modify_time`, `is_deleted`)
values (13, 'manual_add', '运营后台手动增加积分', 'http://www.baidu.com/tupian/task.jpg', 5, 0, '运营后台手动增加积分', 0,
        '2020-05-11 15:25:42', '2020-05-11 15:26:21', 0);

insert into `credit_channel`(`id`, `task_code`, `task_name`, `task_img`, `redirect_type`, `unit_score`, `task_desc`,
                             `total_score`, `create_time`, `modify_time`, `is_deleted`)
values (14, 'manual_deduction', '运营后台手动扣减积分', 'http://www.baidu.com/tupian/task.jpg', 5, 0, '运营后台手动扣减积分', -120,
        '2020-05-11 15:25:51', '2020-05-15 22:06:51', 0);
