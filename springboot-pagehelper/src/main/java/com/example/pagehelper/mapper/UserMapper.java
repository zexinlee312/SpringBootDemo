package com.example.pagehelper.mapper;

import com.example.pagehelper.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> getAllUser();
}
