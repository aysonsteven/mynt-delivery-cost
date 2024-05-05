package com.mynt.delivarycostcalculator.dto;

public class Voucher {

	private VoucherItem voucherItem;
	
	private String status;
	
	private Boolean isExpired;
	
	public Voucher(VoucherItem voucherItem, String status, Boolean isExpired) {
		this.voucherItem = voucherItem;
		this.status = status;
		this.isExpired = isExpired;
	}
	
	public Voucher() {
		
	}

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
