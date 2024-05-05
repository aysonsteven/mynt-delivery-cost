package com.mynt.delivarycostcalculator.dto;

import java.util.Date;

public class VoucherItem {

	private String code;
	
	private double discount;
	
	private String expiry;
	
	public VoucherItem(String code, double discount, String expiry) {
		this.code = code;
		this.discount = discount;
		this.expiry = expiry;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	
	
	
}
