package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * 编写Controller调用业务
 */
@RestController
@RequestMapping("aop")
public class MyController {
    @RequestMapping("howard")
    public String curryPlay() {
        System.out.println("Howard上场了！");
        return "success";
    }

    @RequestMapping("harden")
    public String hardenPlay(@RequestParam("p") Integer point) {
        System.out.println("Harden上场了！");
        return "Harden got" + point +"points";
    }
    @RequestMapping("method")
    public String methodShow(@RequestParam("arg") Integer arg) {
        System.out.println("Harden上场了！");
        return "show arg:" + arg;
    }
}
