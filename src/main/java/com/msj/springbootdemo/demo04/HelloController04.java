package com.msj.springbootdemo.demo04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

//springboot整合thymeleaf
@Controller
@RequestMapping("th")
public class HelloController04 {
    @RequestMapping("/hello")
    public String hello(ModelMap map){
        map.addAttribute("msg","hello thymeleaf");
        return "thymeleaf/hello";
    }
}
