package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private CarDAO carDAO;

    @Autowired
    public CarServiceImpl(CarDAO carDAO){
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> listCars(Long count) {
        return carDAO.listCars().stream().limit(count).collect(Collectors.toList());
    }
}
