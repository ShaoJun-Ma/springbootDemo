package com.msj.springbootdemo.demo06.service;

import com.msj.springbootdemo.demo06.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    int add(User user);
    int delete(int id);
    int update(User user);
}
