package com.example.controller;

import com.example.beans.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"学生管理","教学管理"})
@RestController
@RequestMapping("student")
public class StudentController {
    @ApiOperation("学生列表")
    @GetMapping("/")
    public String getStudent() {
        return "U'v got all students!";
    }

    @ApiOperation("添加学生")
    @PostMapping("add")
    public String addStudent(@RequestBody User user) {
        return "U've added a student!";
    }

    @ApiOperation("获取学生对应的老师")
    @GetMapping("get/{id}")
    public String getTeacher(@PathVariable int id) {
        return "U've got" + id + "'s teacher!";
    }
}
