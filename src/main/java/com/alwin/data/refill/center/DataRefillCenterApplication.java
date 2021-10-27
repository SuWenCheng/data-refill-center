package com.alwin.data.refill.center;

import com.alwin.data.refill.center.db.ActivityDataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;

/**
 * 流量充值中心启动类
 * @author AlwinSu
 *
 */
@SpringBootApplication
@ServletComponentScan
@Import(ActivityDataSourceConfig.class)
public class DataRefillCenterApplication {
	
	public static void main(String[] args) { 
		SpringApplication.run(DataRefillCenterApplication.class, args);
	}

}
