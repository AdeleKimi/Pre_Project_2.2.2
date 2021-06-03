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
    public String printSomeCar(Model model, @RequestParam(defaultValue = "0") Integer count) {
        if (count == 0) {
            List<Car> messages = CarService.getSomeCar(Integer.MAX_VALUE);
            model.addAttribute("messages", messages);
            return "cars";
        }

        List<Car> messages = CarService.getSomeCar(count);
        model.addAttribute("messages", messages);


        return "cars";
    }


}
