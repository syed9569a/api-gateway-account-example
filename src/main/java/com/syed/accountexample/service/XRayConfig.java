package com.syed.accountexample.service;import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.xray.javax.servlet.AWSXRayServletFilter;

@Configuration
public class XRayConfig {

	@Bean
	public Filter TracingFilter() {
		return new AWSXRayServletFilter("account-management");
	}
}

