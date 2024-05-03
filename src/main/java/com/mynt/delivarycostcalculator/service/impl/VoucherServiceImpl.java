package com.mynt.delivarycostcalculator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mynt.delivarycostcalculator.dto.ApplyVoucherRequest;
import com.mynt.delivarycostcalculator.dto.CostResponse;
import com.mynt.delivarycostcalculator.dto.Voucher;
import com.mynt.delivarycostcalculator.dto.VoucherItem;
import com.mynt.delivarycostcalculator.exception.ExpiredVoucherException;
import com.mynt.delivarycostcalculator.service.VoucherService;
import com.mynt.delivarycostcalculator.utils.DateUtils;
import com.mynt.delivarycostcalculator.utils.PercentageUtil;

@Service
public class VoucherServiceImpl implements VoucherService {
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Voucher getVoucherDetails(String voucherCode) {
		Voucher voucher = new Voucher();
		String endpoint = "https://6634a4899bb0df2359a2332e.mockapi.io/mock-api/v1/voucher/{code}";
		voucher.setVoucherItem(restTemplate.getForObject(endpoint, VoucherItem.class, voucherCode));
		voucher.setIsExpired(DateUtils.checkExpiration(voucher.getVoucherItem().getExpiry()));
		return voucher;
	}

	@Override
	public CostResponse applyVoucher(ApplyVoucherRequest voucherRequest) {
		Voucher voucher = getVoucherDetails(voucherRequest.getCode());
		if(voucher.getIsExpired()) {
			throw new ExpiredVoucherException("Voucher is already expired");
		}
		CostResponse cost = voucherRequest.getCost();
		cost.setDiscount(cost.getCost() * PercentageUtil.parsePercent(voucher.getVoucherItem().getDiscount()));
		cost.setTotalAmount(cost.getCost() - cost.getDiscount());
		return cost;
	}

}
