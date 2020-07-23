package com.kingland.dhrm2197;

import com.kingland.dhrm2197.entity.User;
import com.kingland.dhrm2197.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@SpringBootTest
class Dhrm2197ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        // insert new user
//        Integer admin = userMapper.register("admin", new BCryptPasswordEncoder().encode("123"));
//        System.out.println(admin.toString());

        // update user role
//        Integer integer = userMapper.roleChange2Admin(2);
//        System.out.println(integer);
    }

}
