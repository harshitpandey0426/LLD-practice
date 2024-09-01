package org.example.parkingLot.service;

import org.example.parkingLot.model.Ticket;
import org.example.parkingLot.model.Vehicle;

public class ExitGateService {
    public Double calculateParkingPrice(Ticket ticket, Vehicle vehicle, PricingStrategy pricingStrategy, Long currentPrice){
        return pricingStrategy.calculateParkingCost(ticket,currentPrice);
    }

}
