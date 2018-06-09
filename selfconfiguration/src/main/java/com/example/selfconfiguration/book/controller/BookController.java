package com.example.selfconfiguration.book.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @Value("${book.author}")
    private String author;

    @Value("${book.name}")
    private String name;

    @RequestMapping("/bookInfo")
    @ResponseBody
    public String show() {
        return author + ": " + name;
    }
}
