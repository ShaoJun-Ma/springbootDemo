package com.msj.springbootdemo.demo05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;

@Controller
@RequestMapping("/demo05")
public class UserController05 {

    @RequestMapping("/user")
    public String user(ModelMap map){
        User05 user = new User05();
        user.setUsername("小张");
        user.setAge(32);
        user.setBirthday(new Date());
        user.setDesc("<a>今天天气真好</a>");
        map.addAttribute("user",user);

        User05 user1 = new User05();
        user1.setUsername("msj");
        user1.setBirthday(new Date());
        user1.setAge(18);

        User05 user2 = new User05();
        user2.setUsername("chen");
        user2.setBirthday(new Date());
        user2.setAge(20);

        ArrayList<User05> userList = new ArrayList<User05>();
        userList.add(user1);
        userList.add(user2);
        map.addAttribute("userList",userList);
        return "thymeleaf/user";
    }


    @RequestMapping("/success")
    @ResponseBody
    public Object success(String username){
        return username;
    }
}
