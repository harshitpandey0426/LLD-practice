package org.example.parkingLot.service;

import org.example.parkingLot.model.Ticket;

public class FixedPricingStrategy implements PricingStrategy {
    @Override
    public Double calculateParkingCost(Ticket ticket, Long currentPrice) {
        return Double.valueOf(currentPrice);

    }
}
