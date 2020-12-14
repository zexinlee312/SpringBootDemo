package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class SwaggerSortSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerSortSpringApplication.class,args);
    }
}
