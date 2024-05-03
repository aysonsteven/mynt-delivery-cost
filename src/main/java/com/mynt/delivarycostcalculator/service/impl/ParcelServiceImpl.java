package com.mynt.delivarycostcalculator.service.impl;

import org.springframework.stereotype.Service;

import com.mynt.delivarycostcalculator.dto.CostResponse;
import com.mynt.delivarycostcalculator.dto.Parcel;
import com.mynt.delivarycostcalculator.service.ParcelService;

@Service
public class ParcelServiceImpl implements ParcelService {

	@Override
	public CostResponse calculateCostBasedOnRules(Parcel parcel) {
        CostResponse response = new CostResponse();
        double volume = parcel.getHeight() * parcel.getWidth() * parcel.getLength();
        
        if (parcel.getWeight() > 50) {
            response.setRuleName("Reject");
        } else if (parcel.getWeight() > 10) {
            response.setRuleName("Heavy Parcel");
            response.setCost(20 * parcel.getWeight());
        } else if (volume < 1500) {
            response.setRuleName("Small Parcel");
            response.setCost(0.03 * volume);
        } else if (volume < 2500) {
            response.setRuleName("Medium Parcel");
            response.setCost(0.04 * volume);
        } else {
            response.setRuleName("Large Parcel");
            response.setCost(0.05 * volume);
        }

        return response;
	}

}
