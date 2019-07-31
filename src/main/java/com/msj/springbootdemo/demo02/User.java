package com.msj.springbootdemo.demo02;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//引入资源文件
@Configuration
//属性前缀
@ConfigurationProperties(prefix = "com")
//资源文件的位置
@PropertySource("classpath:/application.properties")
public class User {
    private String username;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
