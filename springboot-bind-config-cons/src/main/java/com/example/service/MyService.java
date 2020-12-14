package com.example.service;

import com.example.beans.AnotherComponent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyService {
    @Bean
    @ConfigurationProperties("acme")
    public AnotherComponent getAnotherComponent(){
        return new AnotherComponent();
    }

}
