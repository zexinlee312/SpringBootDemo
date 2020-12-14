package com.example.pagehelper.mapper;

import com.example.pagehelper.entity.OrderPresentInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderPresentInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderPresentInfo record);

    int insertSelective(OrderPresentInfo record);

    OrderPresentInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderPresentInfo record);

    int updateByPrimaryKey(OrderPresentInfo record);

    List<OrderPresentInfo> getAllOrderPresent();
}