package com.msj.springbootdemo.demo02;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private User user;

    @RequestMapping("/user")
    public ServerResponse user(){
//        User user = new User();
//        user.setUsername("msj");
//        user.setAge(18);

        User u = new User();
        BeanUtils.copyProperties(user,u);
        return ServerResponse.createSuccess(u);
    }
}
