package com.kingland.dhrm2197.mapper;

import com.kingland.dhrm2197.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User login(String username, String password);

    List<User> getUserList();
}
