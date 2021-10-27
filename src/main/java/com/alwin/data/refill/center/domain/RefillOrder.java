package com.alwin.data.refill.center.domain;

import lombok.Data;

import java.util.Date;

/**
 * 流量充值订单
 * @author AlwinSu
 *
 */
@Data
public class RefillOrder {

	/**
	 * id
	 */
	private Long id;
	/**
	 * 订单号
	 */
	private String orderNo;
	/**
	 * 用户账号id
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
	 * 支付金额
	 */
	private Double amount;
	/**
	 * 订单标题
	 */
	private String title;
	/**
	 * 订单分类
	 */
	private String type;
	/**
	 * 订单状态
	 */
	private Integer status;
	/**
	 * 支付方式类型
	 */
	private Integer payType;
	/**
	 * 充值说明
	 */
	private String refillComment;
	/**
	 * 充值手机号码
	 */
	private String refillPhoneNumber;
	/**
	 * 充值流量
	 */
	private Long refillData;
	/**
	 * 赠送积分
	 */
	private Double credit;
	/**
	 * 创建时间
	 */
	private Date createdTime;
	/**
	 * 修改时间
	 */
	private Date modifiedTime;
	
}
