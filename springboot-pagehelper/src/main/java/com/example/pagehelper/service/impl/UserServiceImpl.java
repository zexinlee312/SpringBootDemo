package com.example.pagehelper.service.impl;

import com.example.pagehelper.entity.OrderPresentInfo;
import com.example.pagehelper.entity.User;
import com.example.pagehelper.mapper.UserMapper;
import com.example.pagehelper.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUser();
    }

    @Override
    public PageInfo<User> getAllUsersForPage(int pageNo, int pageSize) {
        //pageNo->默认第几页
        //pageSize->每页显示的数量
        PageHelper.startPage(pageNo,pageSize);
        List<User> allUserList = userMapper.getAllUser();
        //通过pageInfo返回分页结果
        PageInfo<User> pageInfo = new PageInfo<>(allUserList);
        return pageInfo;
    }
}
