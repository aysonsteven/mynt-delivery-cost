package com.mynt.delivarycostcalculator.testconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.mynt.delivarycostcalculator.service.ParcelService;
import com.mynt.delivarycostcalculator.service.VoucherService;
import com.mynt.delivarycostcalculator.service.impl.ParcelServiceImpl;
import com.mynt.delivarycostcalculator.service.impl.VoucherServiceImpl;

@Configuration
public class TestConfig {
	
	@Bean
	public ParcelService parcelService(){
		return new ParcelServiceImpl();
	}
	
	@Bean
	public VoucherService voucherService() {
		return new VoucherServiceImpl();
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}

}
