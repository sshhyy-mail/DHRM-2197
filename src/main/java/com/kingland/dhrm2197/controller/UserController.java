package com.kingland.dhrm2197.controller;

import com.kingland.dhrm2197.entity.User;
import com.kingland.dhrm2197.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/register")
    public String userRegister(@RequestParam("username") String username, @RequestParam("password") String password){
        Integer register = userService.register(username, password);
        if(register != null){
            return register.toString();
        }
        return "failed";
    }

}
