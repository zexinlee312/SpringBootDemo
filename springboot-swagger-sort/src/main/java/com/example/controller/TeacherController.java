package com.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"教师管理","教学管理"})
@RestController
@RequestMapping("teacher")
public class TeacherController {
    @ApiOperation("获取教师列表")
    @GetMapping("/")
    public String getTeacher() {
        return "hello!teachers!";
    }


}
