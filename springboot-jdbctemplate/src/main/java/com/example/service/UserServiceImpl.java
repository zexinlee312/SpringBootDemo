package com.example.service;

import com.example.beans.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private JdbcTemplate jdbcTemplate;

    public UserServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int create(String name, Integer age) {
        return jdbcTemplate.update("insert into USER(NAME, AGE) values(?, ?)", name, age);
    }

    @Override
    public List<User> getByName(String name) {
        return null;
    }

    @Override
    public int deleteByName(String name) {
        return 0;
    }

    @Override
    public int getAllUsers() {
        return 0;
    }

    @Override
    public int deleteAllUsers() {
        return 0;
    }
}
