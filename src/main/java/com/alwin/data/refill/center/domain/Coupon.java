package com.alwin.data.refill.center.domain;

import lombok.Data;

import java.util.Date;

/**
 * 流量券
 * @author AlwinSu
 *
 */
@Data
public class Coupon {

	/**
	 * 主键
	 */
	private Long id;
	/**
	 * 流量券所属的用户的账号id
	 */
	private Long userAccountId;
	/**
	 * 流量券金额
	 */
	private Double couponAmount;
	/**
	 * 流量券的状态
	 */
	private Integer status;
	/**
	 * 流量券的开始生效时间
	 */
	private Date startTime;
	/**
	 * 流量券的终止过期时间
	 */
	private Date endTime;
	/**
	 * 创建时间
	 */
	private Date createdTime;
	/**
	 * 修改时间
	 */
	private Date modifiedTime;

}
