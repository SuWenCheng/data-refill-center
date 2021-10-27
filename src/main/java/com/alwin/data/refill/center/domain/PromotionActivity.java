package com.alwin.data.refill.center.domain;

import lombok.Data;

import java.util.Date;

/**
 * 优惠活动
 * @author AlwinSu
 *
 */
@Data
public class PromotionActivity {

	/**
	 * 优惠活动id
	 */
	private Long id;
	/**
	 * 流量套餐id
	 */
	private Long dataPackageId;
	/**
	 * 优惠价格
	 */
	private Double discountPrice;
	/**
	 * 优惠活动的开始时间
	 */
	private Date startTime;
	/**
	 * 优惠活动的结束时间
	 */
	private Date endTime;
	/**
	 * 优惠活动的状态
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
