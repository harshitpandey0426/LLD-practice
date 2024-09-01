package org.example.parkingLot.service;

import org.example.parkingLot.model.ParkingSpot;
import org.example.parkingLot.model.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingSpotService {
    //All CRUD op for parking spot
    Map<ParkingSpot,Boolean> emptyParkingSpot;

    public ParkingSpotService(){
        emptyParkingSpot = new HashMap<>();
    }
    public void addParkingSpot(ParkingSpot parkingSpot){
        emptyParkingSpot.put(parkingSpot,false);
    }
    public Boolean removeParkingSpot(ParkingSpot parkingSpot){
        if(emptyParkingSpot.containsKey(parkingSpot)){
            emptyParkingSpot.remove(parkingSpot);
            return true;
        }
        return false;
    }
    public ParkingSpot findEmptyParkingLot(Vehicle vehicle){
        for(Map.Entry<ParkingSpot, Boolean> spot : emptyParkingSpot.entrySet()){
            System.out.println("Found an Empty parking lot :: "+spot.getKey());
            ParkingSpot parkingSpot = spot.getKey();
            if(parkingSpot.getVehicleCategory().equals(vehicle.getVehicleCategory()) && parkingSpot.getVehicleType().equals(vehicle.getVehicleType())){
                if(parkingSpot.isVacant()==true){
                    System.out.println("Found an Empty parking lot :: "+parkingSpot.getId());
                    return spot.getKey();
                }
            }
        }
        System.out.println("No empty parking lot found");
        return null;
    }
}
