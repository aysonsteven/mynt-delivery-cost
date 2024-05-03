package com.mynt.delivarycostcalculator.service.impl;

import org.springframework.stereotype.Service;

import com.mynt.delivarycostcalculator.service.ParcelService;

@Service
public class ParcelServiceImpl implements ParcelService {

	@Override
	public double calculateCostBasedOnRules(double weight, double volume) {
        if (weight > 50) {
            throw new IllegalArgumentException("Parcel weight exceeds 50kg");
        } else if (weight > 10) {
            return 20 * weight;
        } else if (volume < 1500) {
            return 0.03 * volume;
        } else if (volume < 2500) {
            return 0.04 * volume;
        } else {
            return 0.05 * volume;
        }
	}

}
