CREATE TABLE `data_package` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `price` double(10,2) NOT NULL COMMENT '售价',
  `data` int NOT NULL COMMENT '流量，单位为MB',
  `type` tinyint NOT NULL COMMENT '类型，可选值：1（省内）；2（全国）；3（境外）',
  `comment` varchar(1024) DEFAULT NULL COMMENT '说明备注',
  `created_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modified_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='流量套餐表';