package com.example.pagehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.pagehelper.mapper")
public class PageHelperSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(PageHelperSpringApplication.class,args);
    }
}
