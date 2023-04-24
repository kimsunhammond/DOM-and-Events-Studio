package org.launchcode.class9example.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class ThymeleafController {

    @GetMapping
    public String home(Model model) {
        model.addAttribute("kiwi", "Test!");
        return "home";
    }



}
