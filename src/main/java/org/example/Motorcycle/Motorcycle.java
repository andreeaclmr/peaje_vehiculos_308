package org.example.Motorcycle;

import org.example.Vehicle.Vehicle;

 public class Motorcycle extends Vehicle {
    public Motorcycle(String plateNumber) {
        super(plateNumber);
    }

    @Override
    public int getTollAmount() {
        return 50;
    }
}