package com.example;

import com.example.beans.AcmeProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AcmeProperties.class)
public class ConsBindSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsBindSpringApplication.class,args);
    }
}
