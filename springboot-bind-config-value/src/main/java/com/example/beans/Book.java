package com.example.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("book")
public class Book {
    @Value("${book.name}")
    private String name;
    @NestedConfigurationProperty
    private Author author;
    @Value("${book.price}")
    private Double price;


}
