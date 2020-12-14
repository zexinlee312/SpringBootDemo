package com.example.controller;

import com.example.beans.AcmeProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(AcmeProperties.class)
public class TestController {

    private AcmeProperties acmeProperties;

//    public TestController(AcmeProperties acmeProperties) {
//        this.acmeProperties = acmeProperties;
//    }

    @RequestMapping("test")
    public AcmeProperties test() {
        return acmeProperties;
    }

}
