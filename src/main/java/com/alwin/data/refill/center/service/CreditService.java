package com.alwin.data.refill.center.service;

/**
 * 积分service组件
 * @author AlwinSu
 *
 */
public interface CreditService {

	/**
	 * 增加积分
	 * @param userAccountId 用户账号id
	 */
	void increment(Long userAccountId, Double updatedPoint);
	
}
