package com.example.pagehelper.service;

import com.example.pagehelper.entity.OrderPresentInfo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface OrderPresentInfoService {
    List<OrderPresentInfo> getAllOrderPresent();

    PageInfo<OrderPresentInfo> getAllOrderPresentForPage(int pageNo, int pageSize);
}
