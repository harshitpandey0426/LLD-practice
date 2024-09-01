package org.example.parkingLot.service;

import org.example.parkingLot.model.Ticket;

public interface PricingStrategy {
    public Double calculateParkingCost(Ticket ticket, Long currentPrice);
}
