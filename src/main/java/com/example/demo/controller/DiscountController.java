package com.example.demo.controller;

import com.example.demo.service.EarlyBirdDiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("api/discount")
public class DiscountController {

    private final EarlyBirdDiscountService earlyBirdDiscountService;

    public DiscountController(@Autowired(required = false)EarlyBirdDiscountService earlyBirdDiscountService) {
        this.earlyBirdDiscountService = earlyBirdDiscountService;
    }

    @GetMapping
    public ResponseEntity<String> getDiscount(@RequestParam String bookingDate, @RequestParam String eventDate){
        if(earlyBirdDiscountService == null){
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("Discount service is not enabled");
        }

        LocalDate booking = LocalDate.parse(bookingDate);
        LocalDate event = LocalDate.parse(eventDate);

        double discount = earlyBirdDiscountService.calculateDiscount(booking, event);
        return ResponseEntity.ok(String.valueOf(discount));
    }
}
