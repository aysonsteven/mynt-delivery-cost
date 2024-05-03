package com.mynt.delivarycostcalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mynt.delivarycostcalculator.config.DeliveryConfig;

@SpringBootTest
class DeliveryCalculatorApplicationTests {

	@Test
	void contextLoads() {
	}
	
    @Autowired
    private DeliveryConfig deliveryConfig;
    
    @Test
    public void testConfigValues() {
        assertEquals(50.0, deliveryConfig.getRejectWeightThreshold());
        assertEquals(10.0, deliveryConfig.getHeavyParcelWeightThreshold());
        assertEquals(1500.0, deliveryConfig.getSmallParcelVolumeThreshold());
        assertEquals(2500.0, deliveryConfig.getMediumParcelVolumeThreshold());
        assertEquals(20.0, deliveryConfig.getHeavyParcelCostFactor());
        assertEquals(0.03, deliveryConfig.getSmallParcelCostFactor());
        assertEquals(0.04, deliveryConfig.getMediumParcelCostFactor());
        assertEquals(0.05, deliveryConfig.getLargeParcelCostFactor());
    }

}
