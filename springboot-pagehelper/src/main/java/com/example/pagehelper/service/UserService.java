package com.example.pagehelper.service;

import com.example.pagehelper.entity.OrderPresentInfo;
import com.example.pagehelper.entity.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    PageInfo<User> getAllUsersForPage(int pageNo, int pageSize);
}
