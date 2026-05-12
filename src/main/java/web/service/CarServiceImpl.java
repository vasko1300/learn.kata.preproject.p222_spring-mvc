package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = List.of(
            new Car("BMW", "118", 2008),
            new Car("AUDI", "Q3", 2013),
            new Car("VW", "TAYRON", 2022),
            new Car("TOYOTA", "VAN", 1996),
            new Car("HONDA", "CIVIC", 2017)
    );
    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
