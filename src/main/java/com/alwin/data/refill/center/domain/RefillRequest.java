package com.alwin.data.refill.center.domain;

import lombok.Data;

/**
 * 充值请求
 * @author AlwinSu
 *
 */
@Data
public class RefillRequest {

	/**
	 * 充值的用户账号id
	 */
	private Long userAccountId;
	/**
	 * 商户账号id
	 */
	private Long businessAccountId;
	/**
	 * 商户名称
	 */
	private String businessName;
	/**
	 * 实际支付的金额
	 */
	private Double payAmount;
	/**
	 * 支付类型
	 */
	private Integer payType;
	/**
	 * 手机号
	 */
	private String phoneNumber;
	/**
	 * 流量
	 */
	private Long data;
	/**
	 * 流量套餐
	 */
	private DataPackage dataPackage;
	/**
	 * 使用的流量券
	 */
	private Coupon coupon;
	
}
