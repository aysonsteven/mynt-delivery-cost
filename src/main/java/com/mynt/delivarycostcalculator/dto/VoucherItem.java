package com.mynt.delivarycostcalculator.dto;

import java.util.Date;

public class VoucherItem {

	private String code;
	
	private double discount;
	
	private Date expiry;

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

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	
	
	
}
