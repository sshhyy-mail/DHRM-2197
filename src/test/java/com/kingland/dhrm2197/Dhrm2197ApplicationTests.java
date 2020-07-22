package com.kingland.dhrm2197;

import com.kingland.dhrm2197.entity.User;
import com.kingland.dhrm2197.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Dhrm2197ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {

        User test = userMapper.login("test", "123");
        System.out.println(test.toString());
        List<User> userList = userMapper.getUserList();
        for(User u : userList){
            System.out.println(u.toString());
        }

    }

}
