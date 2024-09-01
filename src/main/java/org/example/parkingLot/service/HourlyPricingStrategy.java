package org.example.parkingLot.service;

import org.example.parkingLot.model.Ticket;

public class HourlyPricingStrategy implements PricingStrategy {
    @Override
    public Double calculateParkingCost(Ticket ticket, Long currentPrice) {
        Long inTime = ticket.getTime();
        Long outTime = System.currentTimeMillis();
        Long millisToHours = 3600000L;
        Long totalTimeSpent = (outTime - inTime)/millisToHours;
        return Double.valueOf(totalTimeSpent*currentPrice);
    }
}
