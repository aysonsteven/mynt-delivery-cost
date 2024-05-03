package com.mynt.delivarycostcalculator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mynt.delivarycostcalculator.config.DeliveryConfig;
import com.mynt.delivarycostcalculator.dto.CostResponse;
import com.mynt.delivarycostcalculator.dto.Parcel;
import com.mynt.delivarycostcalculator.service.ParcelService;

@Service
public class ParcelServiceImpl implements ParcelService {
	
    @Autowired
    private DeliveryConfig deliveryConfig;

	@Override
	public CostResponse calculateCostBasedOnRules(Parcel parcel) {
        CostResponse response = new CostResponse();
        double volume = parcel.getHeight() * parcel.getWidth() * parcel.getLength();
        
        if (parcel.getWeight() > deliveryConfig.getRejectWeightThreshold()) {
            response.setRuleName(deliveryConfig.getRejectName());
        } else if (parcel.getWeight() > deliveryConfig.getHeavyParcelWeightThreshold()) {
            response.setRuleName(deliveryConfig.getHeavyName());
            response.setCost(deliveryConfig.getHeavyParcelCostFactor() * parcel.getWeight());
        } else if (volume < deliveryConfig.getSmallParcelVolumeThreshold()) {
            response.setRuleName(deliveryConfig.getSmallName());
            response.setCost(deliveryConfig.getSmallParcelCostFactor() * volume);
        } else if (volume < deliveryConfig.getMediumParcelVolumeThreshold()) {
            response.setRuleName(deliveryConfig.getMediumName());
            response.setCost(deliveryConfig.getMediumParcelCostFactor() * volume);
        } else {
            response.setRuleName(deliveryConfig.getLargeName());
            response.setCost(deliveryConfig.getLargeParcelCostFactor() * volume);
        }

        return response;
	}

}
