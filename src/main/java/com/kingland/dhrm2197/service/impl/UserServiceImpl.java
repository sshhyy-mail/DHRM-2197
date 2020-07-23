package com.kingland.dhrm2197.service.impl;

import com.kingland.dhrm2197.entity.User;
import com.kingland.dhrm2197.mapper.UserMapper;
import com.kingland.dhrm2197.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public Integer register(String username, String password) {
        return userMapper.register(username, passwordEncoder.encode(password));
    }

    @Override
    public Integer roleChange2Admin(Integer uid) {
        return userMapper.roleChange2Admin(uid);
    }

}
