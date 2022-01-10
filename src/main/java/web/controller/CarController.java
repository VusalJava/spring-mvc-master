package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }
    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5", required = false) Long count, ModelMap model){
        model.addAttribute("car",carService.listCars(count));
        return "cars";
    }
}
