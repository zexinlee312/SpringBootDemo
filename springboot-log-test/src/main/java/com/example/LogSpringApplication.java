package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(LogSpringApplication.class,args);
        Logger logger = LoggerFactory.getLogger(LoggerFactory.class);
        logger.info("这是油管日志的测试");
    }
}
