import org.example.Car.Car;
import org.example.Motorcycle.Motorcycle;
import org.example.TollStation.TollStation;
import org.example.Truck.Truck;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class TollStationTest {

    @Test
    public void testAddCar() {
        TollStation station = new TollStation("Main Street", "New York");
        Car car = new Car("ABC123");

        station.addVehicle(car);

        assertEquals(100, station.getTotalCollected());
    }

    @Test
    public void testAddMotorcycle() {
        TollStation station = new TollStation("Main Street", "New York");
        Motorcycle motorcycle = new Motorcycle("XYZ789");

        station.addVehicle(motorcycle);

        assertEquals(50, station.getTotalCollected());
    }

    @Test
    public void testAddTruck() {
        TollStation station = new TollStation("Main Street", "New York");
        Truck truck = new Truck("LMN456", 3);  // 3 axles = $150

        station.addVehicle(truck);

        assertEquals(150, station.getTotalCollected());
    }

}