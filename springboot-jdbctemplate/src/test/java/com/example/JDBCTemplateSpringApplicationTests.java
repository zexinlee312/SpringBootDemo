package com.example;

import com.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//单元测试需要与主启动类位于同一目录下
@RunWith(SpringRunner.class)
@SpringBootTest
public class JDBCTemplateSpringApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.create("Lee",22);
    }
}
