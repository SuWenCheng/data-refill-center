package com.alwin.data.refill.center.service;

import com.alwin.data.refill.center.domain.PromotionActivity;

/**
 * 优惠活动service组件
 * @author AlwinSu
 *
 */
public interface PromotionActivityService {

	/**
	 * 查询流量套餐绑定的状态处于"进行中"的优惠活动
	 * @return 优惠活动
	 */
	PromotionActivity queryByDataPackageId(Long dataPackageId); 
	
}
