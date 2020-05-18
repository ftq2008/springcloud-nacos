package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;

@SpringBootApplication
@NacosPropertySource(dataId = "springcloudnacos-dev.properties", groupId = "RTC_GROUP", autoRefreshed = true)
public class SpringcloudNacosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudNacosApplication.class, args);
	}

}
