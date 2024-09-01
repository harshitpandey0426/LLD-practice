package org.example.parkingLot.model;

public class ParkingSpot {
    int id;
    VehicleCategory vehicleCategory;
    VehicleType vehicleType;
    boolean isVacant;

    public ParkingSpot(int id, VehicleCategory vehicleCategory, VehicleType vehicleType, boolean isVacant) {
        this.id = id;
        this.vehicleCategory = vehicleCategory;
        this.vehicleType = vehicleType;
        this.isVacant = isVacant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(VehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isVacant() {
        return isVacant;
    }

    public void setVacant(boolean vacant) {
        isVacant = vacant;
    }
}
