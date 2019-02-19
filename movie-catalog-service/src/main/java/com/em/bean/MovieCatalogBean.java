package com.em.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.em.properties.GlobalProperties;

@Configuration
public class MovieCatalogBean {

	@Bean
	public RestTemplate createRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public GlobalProperties getGlobalProperties() {
		return new GlobalProperties();
	}
	
}
