package com.mynt.delivarycostcalculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mynt.delivarycostcalculator.dto.CostResponse;
import com.mynt.delivarycostcalculator.dto.Parcel;
import com.mynt.delivarycostcalculator.service.ParcelService;

@RestController
@RequestMapping("/api/parcel")
public class ParcelController {
	
	@Autowired
	private ParcelService parcelService;
	
    @PostMapping("/cost")
    public ResponseEntity<CostResponse> calculateDeliveryCost(@RequestBody Parcel parcel) {
        CostResponse cost = parcelService.calculateCostBasedOnRules(parcel);
        return ResponseEntity.ok(cost);
    }

}
