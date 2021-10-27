package com.alwin.data.refill.center.service.impl;

import com.alwin.data.refill.center.service.PromotionActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alwin.data.refill.center.domain.PromotionActivity;
import com.alwin.data.refill.center.mapper.activity.PromotionActivityMapper;

/**
 * 优惠活动service组件
 * @author AlwinSu
 *
 */
@Service
public class PromotionActivityServiceImpl implements PromotionActivityService {
	
	/**
	 * 优惠活动mapper组件
	 */
	@Autowired
	private PromotionActivityMapper promotionActivityMapper;
	
	/**
	 * 查询流量套餐绑定的状态处于"进行中"的优惠活动
	 * @return 优惠活动
	 */
	public PromotionActivity queryByDataPackageId(Long dataPackageId) {
		return promotionActivityMapper.queryByDataPackageId(dataPackageId);
	}

}
