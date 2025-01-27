package org.example.Vehicle;

public abstract class Vehicle {

    protected String plateNumber;

    public Vehicle(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public abstract int getTollAmount();

    public String getPlateNumber() {
        return plateNumber;
    }
}

