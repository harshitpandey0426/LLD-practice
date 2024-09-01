package org.example.parkingLot.model;

public class Vehicle {
    String vehicleNumber;
    VehicleType vehicleType;
    VehicleCategory vehicleCategory;

    public Vehicle(String vehicleNumber, VehicleType vehicleType, VehicleCategory vehicleCategory) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.vehicleCategory = vehicleCategory;
    }

    public String getNumber() {
        return vehicleNumber;
    }

    public void setNumber(String number) {
        this.vehicleNumber = number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(VehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }
}
