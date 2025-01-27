package org.example.Truck;

import org.example.Vehicle.Vehicle;

 public class Truck extends Vehicle {
    private int axles;

    public Truck(String plateNumber, int axles) {
        super(plateNumber);
        this.axles = axles;
    }

    @Override
    public int getTollAmount() {
        return 50 * axles;
    }
}
