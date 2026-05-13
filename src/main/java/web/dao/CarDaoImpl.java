package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars = List.of(
            new Car("BMW", "118", 2008),
            new Car("AUDI", "Q3", 2013),
            new Car("VW", "TAYRON", 2022),
            new Car("TOYOTA", "VAN", 1996),
            new Car("HONDA", "CIVIC", 2017)
    );

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}