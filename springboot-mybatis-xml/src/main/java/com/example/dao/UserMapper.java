package com.example.dao;

import com.example.beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@CacheConfig(cacheNames = "users")
public interface UserMapper {

    @Cacheable
    User findByName(@Param("name") String name);

    int insert(@Param("name") String name, @Param("age") Integer age);

}