package com.example.pagehelper.service;

import com.example.pagehelper.entity.User;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {
    List<User> getAllUsers();

    PageInfo<User> getAllUsersForPage(int pageNo, int pageSize);
}
