CREATE TABLE `coupon` (
  `id` int NOT NULL COMMENT '主键',
  `user_account_id` int NOT NULL COMMENT '用户账号id',
  `coupon_amount` double NOT NULL COMMENT '流量券金额',
  `status` tinyint NOT NULL COMMENT '流量券状态，1（未使用）；2（已使用）；3（已过期）',
  `start_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '流量券开始生效的时间',
  `end_time` timestamp NOT NULL COMMENT '流量券过期时间',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modified_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='流量券表';