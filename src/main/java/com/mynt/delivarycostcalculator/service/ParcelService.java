package com.mynt.delivarycostcalculator.service;

import com.mynt.delivarycostcalculator.dto.CostResponse;
import com.mynt.delivarycostcalculator.dto.Parcel;

public interface ParcelService {

	public CostResponse calculateCostBasedOnRules(Parcel parcel);
}
