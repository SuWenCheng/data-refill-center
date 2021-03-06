package com.alwin.data.refill.center.service;

import com.alwin.data.refill.center.domain.RefillRequest;

/**
 * 流量充值中心service组件
 * @author AlwinSu
 *
 */
public interface RefillDataCenterService {

	/**
	 * 完成流量充值
	 * @param refillRequest
	 */
	void finishRefillData(RefillRequest refillRequest);
	
}
