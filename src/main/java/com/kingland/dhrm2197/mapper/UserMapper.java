package com.kingland.dhrm2197.mapper;

import com.kingland.dhrm2197.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User login(String username, String password);

    Integer register(String username, String password);

    User getUser(String username);

    List<User> getUserList();

    Integer roleChange2Admin(Integer uid);

}
