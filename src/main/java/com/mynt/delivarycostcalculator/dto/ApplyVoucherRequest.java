package com.mynt.delivarycostcalculator.dto;

public class ApplyVoucherRequest {

	private CostResponse cost;
	
	private String code;

	public CostResponse getCost() {
		return cost;
	}

	public void setCost(CostResponse cost) {
		this.cost = cost;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}
