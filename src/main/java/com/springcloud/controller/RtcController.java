package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.nacos.Config;

@RequestMapping("/rtc")
@RestController
public class RtcController {

	@Autowired
	Config config;

	@GetMapping("/nacos")
	public String get() {
		return config.environment;
	}

}
