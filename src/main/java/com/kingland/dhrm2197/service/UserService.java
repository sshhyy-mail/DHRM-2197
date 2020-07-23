package com.kingland.dhrm2197.service;

import com.kingland.dhrm2197.entity.User;

public interface UserService {

    Integer register(String username, String password);

    Integer roleChange2Admin(Integer uid);
}
