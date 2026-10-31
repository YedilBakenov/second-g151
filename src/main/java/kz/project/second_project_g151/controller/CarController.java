package kz.project.second_project_g151.controller;

import kz.project.second_project_g151.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CarController {

    @GetMapping(value = "/")
    public String getMainPage(Model model){
        model.addAttribute("cars", Car.getCars());
        return "index";
    }

    @GetMapping(value = "/get-car/{id}")
    public String getCar(Model model,
                         @PathVariable int id){
        model.addAttribute("car", Car.getCarById(id));

        return "details";
    }
}
