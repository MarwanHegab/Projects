import java.util.ArrayList;
import java.util.List;


public class CarFleet {

    private Queue<Car> gasolineCars = new Queue<Car>();
    private Queue<Car> hybridCars = new Queue<Car>();
    private Queue<Car> electricCars = new Queue<Car>();

    public boolean addCar(Car car) {
        int powerSource = car.getPowerSource();
        if (powerSource == 1) {
            gasolineCars.enqueue(car);
            return true;
        } else if (powerSource == 2) {
            hybridCars.enqueue(car);
            return true;
        } else if (powerSource == 3) {
            electricCars.enqueue(car);
            return true;
        }
        return false;
    }

    public List<Car> processRequests(Queue<Integer> requestList) {
        List<Car> carList = new ArrayList<Car>();
        while (!requestList.isEmpty()) {
            int request = requestList.dequeue();
            if (request == 1 && !gasolineCars.isEmpty()) {
                carList.add(gasolineCars.dequeue());
            } else if (request == 2 && !hybridCars.isEmpty()) {
                carList.add(hybridCars.dequeue());
            } else if (request == 3 && !electricCars.isEmpty()) {
                carList.add(electricCars.dequeue());
            } else {
                carList.add(new Car(0, 0, 0f));
            }
        }
        return carList;
    }
}
