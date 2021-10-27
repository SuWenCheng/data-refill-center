package com.alwin.data.refill.center.service.impl;

import com.alwin.data.refill.center.service.CouponActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alwin.data.refill.center.domain.CouponActivity;
import com.alwin.data.refill.center.mapper.activity.CouponActivityMapper;

/**
 * 流量券活动service组件
 * @author AlwinSu
 *
 */
@Service
public class CouponActivityServiceImpl implements CouponActivityService {
	
	/**
	 * 流量券活动mapper组件
	 */
	@Autowired
	private CouponActivityMapper couponActivityMapper;
	
	/**
	 * 查询流量套餐绑定的状态处于"进行中"的流量券活动
	 * @return 流量券活动
	 */
	public CouponActivity queryByDataPackageId(Long dataPackageId) {
		return couponActivityMapper.queryByDataPackageId(dataPackageId);
	}

}
