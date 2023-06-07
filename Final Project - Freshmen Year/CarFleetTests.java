import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class CarFleetTests {

    @Test
    public void testAddCar() {
        CarFleet fleet = new CarFleet();
        assertTrue(fleet.addCar(new Car(99, 1, 99.99f))); // test adding a gasoline car
        assertTrue(fleet.addCar(new Car(50, 2, 500.05f))); // test adding a hybrid car
        assertTrue(fleet.addCar(new Car(45, 3,49f))); // test adding a electric car
        assertFalse(fleet.addCar(new Car(80, 4, 70.3f))); // test adding an invalid power source car
    }

    @Test
    public void testProcessRequests() {
        CarFleet fleet = new CarFleet();
        fleet.addCar(new Car(30, 1, 100.99f)); // test adding a gasoline car
        fleet.addCar(new Car(20, 2, 40.89f)); // test adding a hybrid car
        fleet.addCar(new Car(60, 3, 73f)); // test adding a electric car

        Queue<Integer> requests = new Queue<Integer>();
        requests.enqueue(1); // requesting a gasoline car
        requests.enqueue(2); // requesting a hybrid car
        requests.enqueue(3); // requesting a electric car
        requests.enqueue(4); // invalid request

        List<Car> cars = fleet.processRequests(requests);
        assertEquals(4, cars.size());
        assertEquals(30, cars.get(0).getId()); // testing valid gasoline car
        assertEquals(20, cars.get(1).getId()); // testing valid hybrid car
        assertEquals(60, cars.get(2).getId()); // testing valid electric car
        assertEquals(0, cars.get(3).getId()); // testing invalid car
    }

}
