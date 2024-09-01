package org.example.parkingLot.service;

import org.example.parkingLot.model.Ticket;

public class EntryGateService {
    public Ticket generateTicket(String vehicleNumber){
        Long currentTime = (System.currentTimeMillis());
        Ticket ticket = new Ticket(1,currentTime);
        ticket.setVehicleNumber(vehicleNumber);
        return ticket;
    }
}
