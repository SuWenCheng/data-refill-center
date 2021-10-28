package com.alwin.data.refill.center.service.impl;

import com.alwin.data.refill.center.mapper.credit.CreditMapper;
import com.alwin.data.refill.center.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 积分service组件
 * @author AlwinSu
 *
 */
@Service
public class CreditServiceImpl implements CreditService {

	/**
	 * 积分mapper组件
	 */
	@Autowired
	private CreditMapper creditMapper;
	
	/**
	 * 增加积分
	 * @param userAccountId 用户账号id
	 */
	public void increment(Long userAccountId, Double updatedPoint) {
		//int i = 1/0;
		creditMapper.increment(userAccountId, updatedPoint); 
	}
	
}
