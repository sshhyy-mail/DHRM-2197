package com.kingland.dhrm2197.controller;

import com.alibaba.fastjson.JSON;
import com.kingland.dhrm2197.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/register", method= RequestMethod.POST)
    public String userRegister(@RequestParam("username") String username, @RequestParam("password") String password){
        Integer register = userService.register(username, password);
        if(register != null)
            return JSON.toJSONString("Successful");
        else
            return JSON.toJSONString("Failed");
    }

}
