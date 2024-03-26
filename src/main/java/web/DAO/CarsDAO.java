package web.DAO;

import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", 1990, "Black"));
        cars.add(new Car("QMW", 2020, "White"));
        cars.add(new Car("WMW", 1999, "Red"));
        cars.add(new Car("EMW", 1090, "Blue"));
        cars.add(new Car("RMW", 990, "Green"));
    }

    public List<Car> index() {
        return cars;
    }

    public List<Car> showCar(int count) {
        if (count >= cars.size() || count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
