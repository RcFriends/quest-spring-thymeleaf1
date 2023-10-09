package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @GetMapping("/doctor")
    public String doctor(Model model,
            @RequestParam(value = "name", defaultValue = "John Smith") String name,
            @RequestParam(value = "number", defaultValue = "0") int number) {

        String doctorName = name;
        int doctorNumber = number;

        model.addAttribute("doctorname", doctorName);
        model.addAttribute("doctornumber", doctorNumber);

        return "doctor";
    }

}
