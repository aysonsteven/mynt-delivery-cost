package com.mynt.delivarycostcalculator.parceltest;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mynt.delivarycostcalculator.config.DeliveryConfig;
import com.mynt.delivarycostcalculator.controller.ParcelController;
import com.mynt.delivarycostcalculator.dto.Parcel;

@WebMvcTest(controllers = ParcelController.class)
public class ParcelControllerTest {
	
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DeliveryConfig deliveryConfig;

    @InjectMocks
    private ParcelController parcelController;
    
    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    
    @Test
    public void testCalculateCost() throws Exception {
        Parcel request = new Parcel(8, 10, 20, 30); // Adjust parameters as needed
        when(deliveryConfig.getRejectWeightThreshold()).thenReturn(50.0); // Mock your config values
        when(deliveryConfig.getHeavyParcelWeightThreshold()).thenReturn(10.0);
        when(deliveryConfig.getSmallParcelVolumeThreshold()).thenReturn(1500.0);
        when(deliveryConfig.getMediumParcelVolumeThreshold()).thenReturn(2500.0);
        when(deliveryConfig.getHeavyParcelCostFactor()).thenReturn(20.0);
        when(deliveryConfig.getSmallParcelCostFactor()).thenReturn(0.03);
        when(deliveryConfig.getMediumParcelCostFactor()).thenReturn(0.04);
        when(deliveryConfig.getLargeParcelCostFactor()).thenReturn(0.05);

        mockMvc.perform(MockMvcRequestBuilders.post("/calculateCost")
                .content(asJsonString(request))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value("Success"))
                .andExpect(jsonPath("$.cost").value(120.0)); // Adjust expected result based on your test case
    }
    
    
    // Utility method to convert object to JSON string
    private static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
