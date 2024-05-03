package com.mynt.delivarycostcalculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mynt.delivarycostcalculator.dto.ApplyVoucherRequest;
import com.mynt.delivarycostcalculator.dto.CostResponse;
import com.mynt.delivarycostcalculator.dto.Parcel;
import com.mynt.delivarycostcalculator.dto.Voucher;
import com.mynt.delivarycostcalculator.service.VoucherService;

@RestController
@RequestMapping("/api/voucher")
public class VoucherController {

	@Autowired
	private VoucherService voucherService;
	
    @GetMapping("/verify/{code}")
    public ResponseEntity<Voucher> calculateDeliveryCost(@PathVariable String code) {
        Voucher voucher = voucherService.getVoucherDetails(code);
        return ResponseEntity.ok(voucher);
    }
    
    @PostMapping("/apply")
    public ResponseEntity<CostResponse> applyVoucher(@RequestBody ApplyVoucherRequest applyVoucher){
    	return ResponseEntity.ok(voucherService.applyVoucher(applyVoucher));
    }
}
