package com.example;

import com.example.beans.Author;
import com.example.beans.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({Book.class, Author.class})
public class ValueConfigSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(ValueConfigSpringApplication.class,args);
    }
}
