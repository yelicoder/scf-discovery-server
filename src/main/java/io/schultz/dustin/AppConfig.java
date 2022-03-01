package io.schultz.dustin;

import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.commons.util.InetUtilsProperties;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.appinfo.AmazonInfo;

// This class is used if the server is deployed in AWS
@Configuration
public class AppConfig {
	
	/*
	
	@Bean
	public EurekaInstanceConfigBean eurekaInstanceConfig(InetUtilsProperties properties) {
		
		EurekaInstanceConfigBean bean = new EurekaInstanceConfigBean(new InetUtils(properties));
		AmazonInfo info = AmazonInfo.Builder.newBuilder().autoBuild("eureka");
		bean.setDataCenterInfo(info);
		return bean;
	}	
	
	*/
}
