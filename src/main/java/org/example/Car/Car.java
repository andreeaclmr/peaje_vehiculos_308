package org.example.Car;

import org.example.Vehicle.Vehicle;

 public class Car extends Vehicle {
        public Car(String plateNumber) {
            super(plateNumber);
        }

        @Override
        public int getTollAmount() {
            return 100;
        }
    }

