package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String printSomeCar(Model model, @RequestParam(defaultValue = "0") String count) {
        int countOfCar = Integer.valueOf(count);

        if (countOfCar >= 2) {
            List<Car> messages = CarService.getSomeCar(countOfCar);
            model.addAttribute("messages", messages);
            return "cars";
        }
        if (countOfCar == 0) {
            List<Car> messages = CarService.getSomeCar(Integer.MAX_VALUE);
            model.addAttribute("messages", messages);
        }

        return "cars";
    }


}
