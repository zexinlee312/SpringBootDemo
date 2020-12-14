package com.example.controller;

import com.example.beans.AnotherComponent;
import com.example.beans.AcmeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private AcmeProperties acmeProperties;

    @RequestMapping("yaml")
    public AcmeProperties yaml(){
        System.out.println(acmeProperties);
        return acmeProperties;
    }

    @Autowired
    private AnotherComponent anotherComponent;


    @RequestMapping("another")
    public String another(){
        System.out.println(anotherComponent);
        return "hello springboot";
    }
}
