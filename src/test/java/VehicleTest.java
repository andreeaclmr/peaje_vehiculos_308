import org.example.Car.Car;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    @Test
    public void testCarTollAmount() {
        Car car = new Car("CAR123");
        assertEquals(100, car.getTollAmount());
    }
}
