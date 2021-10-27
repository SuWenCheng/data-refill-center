package com.alwin.data.refill.center.service.impl;

import java.util.List;

import com.alwin.data.refill.center.service.DataPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alwin.data.refill.center.domain.DataPackage;
import com.alwin.data.refill.center.mapper.datapackage.DataPackageMapper;

/**
 * 流量套餐service组件
 * @author AlwinSu
 *
 */
@Service
public class DataPackageServiceImpl implements DataPackageService {

	/**
	 * 流量套餐mapper组件
	 */
	@Autowired
	private DataPackageMapper dataPackageMapper;
	
	/**
	 * 查询所有的流量套餐
	 * @return 流量套餐
	 */
	public List<DataPackage> queryAll() {
		return dataPackageMapper.queryAll();
	}
	
}
