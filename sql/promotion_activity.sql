CREATE TABLE `promotion_activity` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `data_package_id` int NOT NULL COMMENT '流量套餐id',
  `discount_price` double NOT NULL COMMENT '优惠价',
  `start_time` timestamp NOT NULL COMMENT '优惠活动开始时间',
  `end_time` timestamp NOT NULL COMMENT '优惠活动结束时间',
  `status` tinyint NOT NULL COMMENT '优惠活动的状态，1（未开始）；2（进行中）；3（已结束）',
  `created_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modified_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='优惠活动表';