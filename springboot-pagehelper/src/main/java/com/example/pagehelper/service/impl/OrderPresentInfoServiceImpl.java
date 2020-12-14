package com.example.pagehelper.service.impl;

import com.example.pagehelper.entity.OrderPresentInfo;
import com.example.pagehelper.mapper.OrderPresentInfoMapper;
import com.example.pagehelper.service.OrderPresentInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderPresentInfoServiceImpl implements OrderPresentInfoService {


    @Autowired
    private OrderPresentInfoMapper orderPresentMapper;

    @Override
    public List<OrderPresentInfo> getAllOrderPresent() {
        return orderPresentMapper.getAllOrderPresent();
    }

    //基于pagehelper实现分页
    @Override
    public PageInfo<OrderPresentInfo> getAllOrderPresentForPage(int pageNo, int pageSize) {
        //pageNo->默认第几页
        //pageSize->每页显示的数量
        PageHelper.startPage(pageNo,pageSize);
        List<OrderPresentInfo> allOrderPresentList = orderPresentMapper.getAllOrderPresent();
        //通过pageInfo返回分页结果
        PageInfo<OrderPresentInfo> pageInfo = new PageInfo<>(allOrderPresentList);
        return pageInfo;
    }
}