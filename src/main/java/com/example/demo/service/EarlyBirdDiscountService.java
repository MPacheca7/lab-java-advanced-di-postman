package com.example.demo.service;

import lombok.AllArgsConstructor;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@AllArgsConstructor
public class EarlyBirdDiscountService {

    private final double discountRate;
    private final int daysInAdvance;

    public double calculateDiscount(LocalDate bookingDate, LocalDate eventDate) {
        long daysBetween = ChronoUnit.DAYS.between(bookingDate, eventDate);

        if (daysBetween >= daysInAdvance) {
            return discountRate;
        }
        return 0.0;
    }
}
