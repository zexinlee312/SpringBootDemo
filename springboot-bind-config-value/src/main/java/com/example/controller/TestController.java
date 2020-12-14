package com.example.controller;

import com.example.beans.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private Book book;
    @GetMapping("getbook")
    public String getBook() {
        System.out.println(book);
        return "success";
    }
}
