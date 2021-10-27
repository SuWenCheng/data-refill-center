package com.alwin.data.refill.center.domain;

import lombok.Data;

import java.util.Date;

/**
 * 流量券活动
 * @author AlwinSu
 *
 */
@Data
public class CouponActivity {

	/**
	 * 流量券活动id
	 */
	private Long id;
	/**
	 * 流量套餐id
	 */
	private Long dataPackageId;
	/**
	 * 流量券金额
	 */
	private Double couponAmount;
	/**
	 * 流量券活动的开始时间
	 */
	private Date startTime;
	/**
	 * 流量券活动的结束时间
	 */
	private Date endTime;
	/**
	 * 流量券活动的状态
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date createdTime;
	/**
	 * 修改时间
	 */
	private Date modifiedTime;
	
}
