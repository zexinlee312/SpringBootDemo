package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class ThymeleafController {
    @RequestMapping("success")
    public String test1(ModelMap map) {
        map.put("hello","nihaoma");
        return "success";
    }
}
