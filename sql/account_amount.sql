CREATE TABLE `account_amount` (
                                  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
                                  `user_account_id` int NOT NULL COMMENT '用户id',
                                  `amount` double NOT NULL COMMENT '金额',
                                  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                  `modified_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                                  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账号金额表';