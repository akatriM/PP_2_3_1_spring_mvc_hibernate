package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String getCars(@RequestParam(value = "count", required = false) Integer count, ModelMap modelMap) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("1", 1, 1));
        cars.add(new Car("2", 2, 2));
        cars.add(new Car("3", 3, 3));
        cars.add(new Car("4", 4, 4));
        cars.add(new Car("5", 5, 5));

        if (count == null) {
            modelMap.addAttribute("cars", cars);
        } else {
            List<Car> countedCar = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                if (count >= 5) {
                    countedCar = cars;
                    break;
                }
                countedCar.add(cars.get(i));
            }
            modelMap.addAttribute("cars", countedCar);
        }
        return "cars";
    }
}






