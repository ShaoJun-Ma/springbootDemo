package com.msj.springbootdemo.demo03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/ftl")
public class UserController03 {
    @Autowired
    private User03 user03;

    @RequestMapping(value = "/index")
    public String index(ModelMap map){
        map.addAttribute("user",user03);
        return "/index";
    }
}
