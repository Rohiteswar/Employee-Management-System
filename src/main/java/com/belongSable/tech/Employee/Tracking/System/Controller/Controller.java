package com.belongSable.tech.Employee.Tracking.System.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    //@RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    static String HelloWorld(){
        String Name="Rohit";
        return "Welcome to Employee Tracking System Done by belongSable "+Name;
    }
}
