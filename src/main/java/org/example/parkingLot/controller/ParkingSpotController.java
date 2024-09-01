package org.example.parkingLot.controller;

import org.example.parkingLot.model.ParkingSpot;
import org.example.parkingLot.model.Vehicle;
import org.example.parkingLot.service.ParkingSpotService;

public class ParkingSpotController {
    ParkingSpotService parkingSpotService;
    public ParkingSpotController(){
        parkingSpotService = new ParkingSpotService();
    }
    public void addParkingSpot(ParkingSpot parkingSpot){
        parkingSpotService.addParkingSpot(parkingSpot);
    }
    public Boolean removeParkingSpot(ParkingSpot parkingSpot){
        return parkingSpotService.removeParkingSpot(parkingSpot);
    }
    public ParkingSpot findEmptyParkingLot(Vehicle vehicle){
        return parkingSpotService.findEmptyParkingLot(vehicle);
    }
}
