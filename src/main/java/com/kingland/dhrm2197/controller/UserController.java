package com.kingland.dhrm2197.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/login")
    public String userLogin(@RequestParam("username") String username, @RequestParam("password") String password){
        System.out.println("login" + username);
        System.out.println("login" + password);
        return "login";
    }

    @ResponseBody
    @RequestMapping("/register")
    public String userRegister(@RequestParam("username") String username, @RequestParam("password") String password){
        System.out.println("register" + username);
        System.out.println("register" + password);
        return "register";
    }

}
