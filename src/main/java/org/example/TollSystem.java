package org.example;

import org.example.Car.Car;
import org.example.Motorcycle.Motorcycle;
import org.example.TollStation.TollStation;
import org.example.Truck.Truck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TollSystem {
    public static void main(String[] args) {
        TollStation station = new TollStation("Main Street", "New York");

        station.addVehicle(new Car("ABC123"));
        station.addVehicle(new Motorcycle("XYZ789"));
        station.addVehicle(new Truck("LMN456", 3));

        station.printReport();
    }
}