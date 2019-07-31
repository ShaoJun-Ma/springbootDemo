package com.msj.springbootdemo.demo01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RestController = @Controller + @ResponseBody
public class HelloController {

    @RequestMapping("/hello")
    public Object hello(){
        return "hello springboot!";
    }
}
