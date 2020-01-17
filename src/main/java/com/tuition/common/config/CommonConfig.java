package com.tuition.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
public class CommonConfig {

	@Bean
	public CommonsMultipartResolver  createCommonMultipart() {
		return null;
		
	}
	@Bean 
	public RestTemplate restTemplate() {
		return null;
	}
}
