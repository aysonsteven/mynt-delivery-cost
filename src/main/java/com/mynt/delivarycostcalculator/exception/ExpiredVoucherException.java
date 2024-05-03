package com.mynt.delivarycostcalculator.exception;

public class ExpiredVoucherException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExpiredVoucherException(String msg) {
		super(msg);
	}

}
