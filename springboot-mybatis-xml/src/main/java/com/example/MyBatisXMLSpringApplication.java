package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 本测试样例首先测试了基于XML的MyBatis访问数据库，然后引入了缓存（通过@EnableCaching引入合适的缓存管理器）
 * 最后将缓存替换为Ehcache
 */
@EnableCaching
@MapperScan("com.example.dao")
@SpringBootApplication
public class MyBatisXMLSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBatisXMLSpringApplication.class,args);
    }
}
