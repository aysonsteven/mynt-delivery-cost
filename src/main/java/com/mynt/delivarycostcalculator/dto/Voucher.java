package com.mynt.delivarycostcalculator.dto;

public class Voucher {

	private VoucherItem voucherItem;
	
	private String status;
	
	private Boolean isExpired;

	public VoucherItem getVoucherItem() {
		return voucherItem;
	}

	public void setVoucherItem(VoucherItem voucherItem) {
		this.voucherItem = voucherItem;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getIsExpired() {
		return isExpired;
	}

	public void setIsExpired(Boolean isExpired) {
		this.isExpired = isExpired;
	}

	
	
	
}
