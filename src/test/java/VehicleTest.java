import org.example.Car.Car;
import org.example.Motorcycle.Motorcycle;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    @Test
    public void testCarTollAmount() {
        Car car = new Car("CAR123");
        assertEquals(100, car.getTollAmount());
    }

    @Test
    public void testMotorcycleTollAmount() {
        Motorcycle motorcycle = new Motorcycle("BIKE456");
        assertEquals(50, motorcycle.getTollAmount());
    }
}
