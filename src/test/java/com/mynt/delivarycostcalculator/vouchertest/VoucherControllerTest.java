//package com.mynt.delivarycostcalculator.vouchertest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.http.ResponseEntity;
//
//import com.mynt.delivarycostcalculator.config.DeliveryConfig;
//import com.mynt.delivarycostcalculator.controller.VoucherController;
//import com.mynt.delivarycostcalculator.dto.Voucher;
//import com.mynt.delivarycostcalculator.dto.VoucherItem;
//import com.mynt.delivarycostcalculator.service.VoucherService;
//
//
//
//public class VoucherControllerTest {
//
//
//	private VoucherService voucherService = mock(VoucherService.class);
//	
//    @Autowired
//    private MockMvc mockMvc;
//    
//    @MockBean
//    private DeliveryConfig deliveryConfig;
//    
//    @InjectMocks
//    private VoucherController voucherController;
//    
//    @BeforeEach
//    public void setup() {
//        MockitoAnnotations.openMocks(this);
//    }
//    
//    @Test
//    public void testVerifyVoucherDetails() throws Exception {
//        // Mock voucher details
//        String voucherCode = "1";
//        VoucherItem item = new VoucherItem("1", 20.0, "2024-05-03T23:38:37.113Z");
//        Voucher voucher = new Voucher(item, null, true);
//        // Stubbing the behavior of VoucherService
//        when(voucherService.getVoucherDetails(voucherCode)).thenReturn(voucher);
//
//        // Call controller method
//        mockMvc.perform(MockMvcRequestBuilders.post("/cost")
//                .content(voucherCode)
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.status").value("Success"))
//                .andExpect(jsonPath("$.voucherItem").value(item))
//                .andExpect(jsonPath("$.isExpired").value(true)); // Adjust expected result based on your test case
//  
//    }
//
//}
