package com.mynt.delivarycostcalculator.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeliveryConfig {

    @Value("${delivery.rules.reject.weight.threshold}")
    private double rejectWeightThreshold;

    @Value("${delivery.rules.heavy.parcel.weight.threshold}")
    private double heavyParcelWeightThreshold;

    @Value("${delivery.rules.small.parcel.volume.threshold}")
    private double smallParcelVolumeThreshold;

    @Value("${delivery.rules.medium.parcel.volume.threshold}")
    private double mediumParcelVolumeThreshold;

    @Value("${delivery.rules.heavy.parcel.cost.factor}")
    private double heavyParcelCostFactor;

    @Value("${delivery.rules.small.parcel.cost.factor}")
    private double smallParcelCostFactor;

    @Value("${delivery.rules.medium.parcel.cost.factor}")
    private double mediumParcelCostFactor;

    @Value("${delivery.rules.large.parcel.cost.factor}")
    private double largeParcelCostFactor;
    
    ////labels
    @Value("${delivery.rules.heavy.name}")
    private String heavyName;
    
    @Value("${delivery.rules.large.name}")
    private String largeName;
    
    @Value("${delivery.rules.medium.name}")
    private String mediumName;
    
    @Value("${delivery.rules.reject.name}")
    private String rejectName;
    
    @Value("${delivery.rules.small.name}")
    private String smallName;

	public double getRejectWeightThreshold() {
		return rejectWeightThreshold;
	}

	public void setRejectWeightThreshold(double rejectWeightThreshold) {
		this.rejectWeightThreshold = rejectWeightThreshold;
	}

	public double getHeavyParcelWeightThreshold() {
		return heavyParcelWeightThreshold;
	}

	public void setHeavyParcelWeightThreshold(double heavyParcelWeightThreshold) {
		this.heavyParcelWeightThreshold = heavyParcelWeightThreshold;
	}

	public double getSmallParcelVolumeThreshold() {
		return smallParcelVolumeThreshold;
	}

	public void setSmallParcelVolumeThreshold(double smallParcelVolumeThreshold) {
		this.smallParcelVolumeThreshold = smallParcelVolumeThreshold;
	}

	public double getMediumParcelVolumeThreshold() {
		return mediumParcelVolumeThreshold;
	}

	public void setMediumParcelVolumeThreshold(double mediumParcelVolumeThreshold) {
		this.mediumParcelVolumeThreshold = mediumParcelVolumeThreshold;
	}

	public double getHeavyParcelCostFactor() {
		return heavyParcelCostFactor;
	}

	public void setHeavyParcelCostFactor(double heavyParcelCostFactor) {
		this.heavyParcelCostFactor = heavyParcelCostFactor;
	}

	public double getSmallParcelCostFactor() {
		return smallParcelCostFactor;
	}

	public void setSmallParcelCostFactor(double smallParcelCostFactor) {
		this.smallParcelCostFactor = smallParcelCostFactor;
	}

	public double getMediumParcelCostFactor() {
		return mediumParcelCostFactor;
	}

	public void setMediumParcelCostFactor(double mediumParcelCostFactor) {
		this.mediumParcelCostFactor = mediumParcelCostFactor;
	}

	public double getLargeParcelCostFactor() {
		return largeParcelCostFactor;
	}

	public void setLargeParcelCostFactor(double largeParcelCostFactor) {
		this.largeParcelCostFactor = largeParcelCostFactor;
	}

	public String getHeavyName() {
		return heavyName;
	}

	public void setHeavyName(String heavyName) {
		this.heavyName = heavyName;
	}

	public String getLargeName() {
		return largeName;
	}

	public void setLargeName(String largeName) {
		this.largeName = largeName;
	}

	public String getMediumName() {
		return mediumName;
	}

	public void setMediumName(String mediumName) {
		this.mediumName = mediumName;
	}

	public String getRejectName() {
		return rejectName;
	}

	public void setRejectName(String rejectName) {
		this.rejectName = rejectName;
	}

	public String getSmallName() {
		return smallName;
	}

	public void setSmallName(String smallName) {
		this.smallName = smallName;
	}
	
	
	
	
    
    
}
