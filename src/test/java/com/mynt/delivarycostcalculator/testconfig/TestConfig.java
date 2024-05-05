package com.mynt.delivarycostcalculator.testconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mynt.delivarycostcalculator.service.ParcelService;
import com.mynt.delivarycostcalculator.service.impl.ParcelServiceImpl;

@Configuration
public class TestConfig {
	
	@Bean
	public ParcelService parcelService(){
		return new ParcelServiceImpl();
	}

}
