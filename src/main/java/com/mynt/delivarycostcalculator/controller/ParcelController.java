package com.mynt.delivarycostcalculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mynt.delivarycostcalculator.dto.Parcel;
import com.mynt.delivarycostcalculator.service.ParcelService;

@RestController
@RequestMapping("/api/parcel")
public class ParcelController {
	
	@Autowired
	private ParcelService parcelService;
	
    @PostMapping("/calculateCost")
    public ResponseEntity<Double> calculateDeliveryCost(@RequestBody Parcel parcel) {
        double volume = parcel.getHeight() * parcel.getWidth() * parcel.getLength();
        double cost = parcelService.calculateCostBasedOnRules(parcel.getWeight(), volume);
        return ResponseEntity.ok(cost);
    }

}
