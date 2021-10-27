CREATE TABLE `lottery_draw` (
                                `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
                                `user_account_id` int NOT NULL COMMENT '用户id',
                                `lottery_draw_count` int NOT NULL DEFAULT '0' COMMENT '抽奖次数',
                                `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
                                `modified_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='抽奖次数表';