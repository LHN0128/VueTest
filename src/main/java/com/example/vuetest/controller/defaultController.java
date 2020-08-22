package com.example.vuetest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class defaultController {
    @RequestMapping("/")
    public String forwardToWelcome(){
        return "forward:Test1.html";
    }
}
