package com.example.pagehelper.controller;

import com.example.pagehelper.entity.User;
import com.example.pagehelper.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    UserService userService;
    /**
     * 跳转到应用列表页面
     * @param pageNo 要显示第几页内容
     * @param pageSize 一页显示多少条
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public PageInfo<User> list(@RequestParam(value="pageNo",defaultValue="1")int pageNo, @RequestParam(value="pageSize",defaultValue="10")int pageSize) {
        PageInfo<User> page = userService.getAllUsersForPage(pageNo,pageSize);
        return  page;
    }
}
