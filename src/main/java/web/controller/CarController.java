package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarsDAO;

@Controller
public class CarController {
    private final CarsDAO carsDAO;

    @Autowired
    public CarController(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count != null && count > 0) {
            model.addAttribute("cars", carsDAO.showCar(count));
        } else {
            model.addAttribute("cars", carsDAO.index());
        }
        return "cars";
    }
}
