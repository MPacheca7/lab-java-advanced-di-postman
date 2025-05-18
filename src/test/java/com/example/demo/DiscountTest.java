package com.example.demo;


import com.example.demo.service.EarlyBirdDiscountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class DiscountTest {

    @Autowired
    EarlyBirdDiscountService earlyBirdDiscountService;

    @Test
    public void discount(){
        LocalDate booking = LocalDate.of(2024, 1, 1);
        LocalDate event = LocalDate.of(2024, 2, 15);

        double finalPrice = earlyBirdDiscountService.calculateDiscount(booking, event);

        System.out.println("Descuento: " + finalPrice);
    }
}
