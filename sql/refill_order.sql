CREATE TABLE `refill_order` (
                                `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
                                `order_no` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单号',
                                `user_account_id` int NOT NULL COMMENT '用户id',
                                `business_account_id` int NOT NULL COMMENT '商户账号id',
                                `business_name` varchar(1024) DEFAULT NULL COMMENT '商户名称',
                                `amount` double NOT NULL COMMENT '支付金额',
                                `title` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单标题',
                                `type` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单分类',
                                `status` tinyint NOT NULL COMMENT '订单状态，1（交易成功），2（交易失败）',
                                `pay_type` tinyint NOT NULL COMMENT '支付方式',
                                `refill_comment` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '充值说明',
                                `refill_phone_number` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '充值号码',
                                `refill_data` int NOT NULL COMMENT '充值流量',
                                `credit` double DEFAULT NULL COMMENT '奖励积分',
                                `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                `modified_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='流量充值订单表';