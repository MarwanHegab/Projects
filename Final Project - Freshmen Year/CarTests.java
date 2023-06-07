import org.junit.Test;
import static org.junit.Assert.*;

public class CarTests {

    @Test
    public void testConstructor() {
        Car car = new Car(75, 1, 55.99f); // setting random car example
        assertEquals(75, car.getId()); // testing the getId() method
        assertEquals(1, car.getPowerSource()); // testing the getPowerSource() method
        assertEquals(55.99f, car.getPricePerDay(), 0.0f); // testing the getPricePerDay() method
    }

    @Test
    public void testSetAndGet() {
        Car car = new Car(75, 1, 55.99f); // setting random car example
        car.setId(8); // setting new id
        assertEquals(8, car.getId()); // testing the getId() method after changing it
        car.setPowerSource(3); // setting new power source
        assertEquals(3, car.getPowerSource()); // testing the getPowerSource() method after changing it
        car.setPricePerDay(4.77f); // setting new price per day
        assertEquals(4.77f, car.getPricePerDay(), 0.0f); // testing the getPricePerDay() method after changing it
    }
}
