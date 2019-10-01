package com.example.CarManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.List;

@Controller
public class AppController{

    @Autowired
    private CarService service;

    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Car> listcars = service.listAll();
        model.addAttribute("listcars", listcars);
        return "index";
    }
    

}