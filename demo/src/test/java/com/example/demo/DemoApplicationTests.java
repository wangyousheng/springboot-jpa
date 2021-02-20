package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        User user = new User();
        user.setName("王友胜");
        userService.addUser(user);
    }

}
