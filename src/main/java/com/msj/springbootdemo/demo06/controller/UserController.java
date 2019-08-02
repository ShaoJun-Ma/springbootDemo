package com.msj.springbootdemo.demo06.controller;

import com.msj.springbootdemo.demo06.pojo.User;
import com.msj.springbootdemo.demo06.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    private UserService userService;
    //查询
    @RequestMapping("/list")
    public List<User> userList(){
        return userService.findAll();
    }
    //增加
    @RequestMapping("/add")
    public int add(User user){
        return userService.add(user);
    }

    //删除
    @RequestMapping("/delete")
    public int delete(){
        return userService.delete(18);
    }
    //更新
    @RequestMapping("/update")
    public int update(User user){
        return userService.update(user);
    }
}
