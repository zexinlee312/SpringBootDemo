package com.example;

import com.example.beans.User;
import com.example.dao.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisXMLSpringApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Autowired
    CacheManager cacheManager;
    @Test
    public void test() {
        System.out.println("cache type:"+ cacheManager.getClass());
//        userMapper.insert("lee",22);
        User user1 = userMapper.findByName("lee");
        System.out.println("第一次查询"+user1.getAge());
        User user2 = userMapper.findByName("lee");
        System.out.println("第二次查询"+user1.getAge());
    }
}
