package org.example;

import org.example.parkingLot.controller.ParkingSpotController;
import org.example.parkingLot.model.ParkingSpot;
import org.example.parkingLot.model.Vehicle;
import org.example.parkingLot.model.VehicleCategory;
import org.example.parkingLot.model.VehicleType;
import org.example.parkingLot.service.ParkingSpotService;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("MP04-9090", VehicleType.Electric, VehicleCategory.SUV);
        ParkingSpotController parkingSpotController = new ParkingSpotController();
        createParkingSpots(parkingSpotController);
        ParkingSpot parkingSpot =  parkingSpotController.findEmptyParkingLot(vehicle);
    }
    public static void createParkingSpots(ParkingSpotController parkingSpotController){
        ParkingSpot parkingSpot1 = new ParkingSpot(1, VehicleCategory.SUV,VehicleType.Electric,false);
        ParkingSpot parkingSpot2 = new ParkingSpot(2, VehicleCategory.Compact,VehicleType.Hybrid,false);
        ParkingSpot parkingSpot3 = new ParkingSpot(3, VehicleCategory.Compact,VehicleType.Petrol,false);
        ParkingSpot parkingSpot4 = new ParkingSpot(4, VehicleCategory.SUV,VehicleType.Electric,false);

        parkingSpotController.addParkingSpot(parkingSpot1);
        parkingSpotController.addParkingSpot(parkingSpot2);
        parkingSpotController.addParkingSpot(parkingSpot3);
        parkingSpotController.addParkingSpot(parkingSpot4);
    }
}