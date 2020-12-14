package com.example.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@Data
@ConfigurationProperties("author")
public class Author {
    @Value("${book.author.author-name}")
    String authorName;
    @Value("${book.author.sex}")
    char sex;
}
