package org.example.parkingLot.service;

public class DashBoardService {
    int occupiedParkingLots;
    int emptyParkingLots;

    public DashBoardService(int occupiedParkingLots, int emptyParkingLots) {
        this.occupiedParkingLots = occupiedParkingLots;
        this.emptyParkingLots = emptyParkingLots;
    }
}
