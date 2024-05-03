package com.mynt.delivarycostcalculator.service;

import com.mynt.delivarycostcalculator.dto.ApplyVoucherRequest;
import com.mynt.delivarycostcalculator.dto.CostResponse;
import com.mynt.delivarycostcalculator.dto.Voucher;

public interface VoucherService {
	Voucher getVoucherDetails(String voucherCode);
	
	CostResponse applyVoucher(ApplyVoucherRequest voucherRequest);
}
