package com.example.demo.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Home {
    @RequestMapping("/")
    public String goHome(Model model){
        return "home";
    }
}
