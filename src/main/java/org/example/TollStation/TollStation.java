package org.example.TollStation;

import org.example.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class TollStation {
    private String name;
    private String city;
    private int totalCollected;
    private List<Vehicle> vehicles;

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalCollected = 0;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        totalCollected += vehicle.getTollAmount();
    }

    public void printReport() {
        System.out.println("Toll Station: " + name + ", " + city);
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle: " + vehicle.getClass().getSimpleName() + " - " + vehicle.getPlateNumber() + " - Toll: $" + vehicle.getTollAmount());
        }
        System.out.println("Total collected: $" + totalCollected);
    }
}

