package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO{

    @Override
    public List<Car> listCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW","M5",2019));
        list.add(new Car("Mercedes","E63",2018));
        list.add(new Car("Audi","RS7",2021));
        list.add(new Car("Toyota","Camry",2014));
        list.add(new Car("BMW","M4",2021));
        return list;
    }
}
