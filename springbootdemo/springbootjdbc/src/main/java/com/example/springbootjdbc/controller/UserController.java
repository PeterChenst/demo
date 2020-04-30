package com.example.springbootjdbc.controller;

import com.example.springbootjdbc.pojo.Users;
import com.example.springbootjdbc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.sql.DataSource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UsersService usersService;

    //添加用户
    @PostMapping("/addUser")
    public String showInfo(Users users){
        try {
               this.usersService.addUser(users);
        } catch(Exception e){
            e.printStackTrace();
            return "error";
        }

        return "redirect:/ok";
    }
}
