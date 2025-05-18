package com.example.demo;

import com.example.demo.service.EarlyBirdDiscountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EarlyBirdDiscountTest {

    @Autowired
    EarlyBirdDiscountService earlyBirdDiscountService;

    @Test
    public void testEarlyBirdDiscount(){


    }

}
