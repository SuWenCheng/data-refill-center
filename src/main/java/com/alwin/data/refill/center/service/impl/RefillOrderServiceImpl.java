package com.alwin.data.refill.center.service.impl;

import com.alwin.data.refill.center.domain.RefillOrder;
import com.alwin.data.refill.center.mapper.order.RefillOrderMapper;
import com.alwin.data.refill.center.service.RefillOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 充值订单service组件
 * @author zhonghuashishan
 *
 */
@Service
public class RefillOrderServiceImpl implements RefillOrderService {

	/**
	 * 充值订单mapper组件
	 */
	@Autowired
	private RefillOrderMapper refillOrderMapper;
	
	/**
	 * 增加一个充值订单
	 * @param refillOrder 充值订单
	 */
	public void add(RefillOrder refillOrder) {
		refillOrderMapper.add(refillOrder); 
	}

	/**
	 * 查询所有的充值订单
	 * @param userAccountId 用户账号id
	 * @return
	 */
	public List<RefillOrder> queryAll(Long userAccountId) {
		return refillOrderMapper.queryAll(userAccountId);
	}

	/**
	 * 查询充值订单
	 * @param id 充值订单id
	 * @return
	 */
	@Override
	public RefillOrder queryById(Long id) {
		return refillOrderMapper.queryById(id);
	}

}
