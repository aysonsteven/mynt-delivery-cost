package com.mynt.delivarycostcalculator.dto;

public class CostResponse {
    private String ruleName;
    private double cost;
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
    
    
}
