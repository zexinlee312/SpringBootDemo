package com.example.controller;

import com.example.beans.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.*;

@Api("用户管理")
@RestController
@RequestMapping("/users")
public class UserController {
    // 创建线程安全的Map，模拟users信息的存储
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    /**
     * 处理"/users/"的GET请求，用来获取用户列表
     * @return
     */
    @ApiOperation("用户列表")
    @GetMapping("/")
    public List<User> getUserList() {
        List<User> list = new ArrayList<User>(users.values());
        return list;
    }


    /**
     * 处理post请求，参数以json传输
     * @param user
     * @return
     */
    @ApiOperation(value = "提交用户",notes = "根据用户创建user")
    @PostMapping("/")
    public String postUser(@Valid @RequestBody User user) {
        System.out.println(user);
        return "success";
    }

    /**
     * 处理带参数的get请求
     * @param id
     * @return
     */
    @ApiOperation("根据id获取用户")
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        User user = users.get(id);
        return user;
    }

    /**
     * 处理put请求，对原有的user进行修改
     */
    @ApiOperation("修改用户")
    @PutMapping("/{id}")
    public String putUserById(@PathVariable Long id) {
        User user = users.get(id);
        user.setName("zexin");
        user.setAge(30);
        users.put(id,user);
        return "success";
    }

    /**
     * 删除请求
     * @param id
     * @return
     */
    @ApiOperation("删除用户")
    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable Long id) {
        users.remove(id);
        return "You've successfully removed it!";
    }

    /**
     * post处理带参数的url请求
     * @param id
     * @param name
     * @param age
     * @return
     */
    @ApiIgnore
    @PostMapping("/add")
    public String postUserByUrl(@PathParam("id") Long id, @PathParam("name") String name,@PathParam("age") int age) {
        User user = new User();
        user.setId(id);
        user.setAge(age);
        user.setName(name);
        users.put(user.getId(),user);
        return "success";
    }
}
