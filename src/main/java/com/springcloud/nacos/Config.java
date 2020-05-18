package com.springcloud.nacos;

import org.springframework.stereotype.Component;

import com.alibaba.nacos.api.config.annotation.NacosValue;

@Component
public class Config {
	
	@NacosValue(value = "${environment:moren}", autoRefreshed = true)
	public String environment;
}
