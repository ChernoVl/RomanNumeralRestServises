package com.romannumeral.roman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping
    public String displayHomePage() {
        return "index.html";
    }

}
