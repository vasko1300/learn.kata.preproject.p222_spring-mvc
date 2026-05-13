package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    private final CarServiceImpl carService;

    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String cars(ModelMap model) {
        model.addAttribute("cars", carService.getCars());
        return "cars";
    }

    @GetMapping(value = "/cars", params = "count")
    public String cars(
            ModelMap model,
            @RequestParam Integer count
    ) {
        count = count >= 5 ? Integer.MAX_VALUE : count;
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}