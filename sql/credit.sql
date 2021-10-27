CREATE TABLE `credit` (
                          `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
                          `user_account_id` int NOT NULL COMMENT '用户账号id',
                          `point` decimal(10,2) NOT NULL COMMENT '积分',
                          `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                          `modified_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='积分表';