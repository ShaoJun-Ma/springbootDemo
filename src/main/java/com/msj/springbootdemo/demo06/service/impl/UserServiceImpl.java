package com.msj.springbootdemo.demo06.service.impl;

import com.msj.springbootdemo.demo06.mapper.UserMapper;
import com.msj.springbootdemo.demo06.pojo.User;
import com.msj.springbootdemo.demo06.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }

    @Override
    public int add(User user) {
        user.setId(20);
        user.setName("小白");
        user.setAge(18);
        user.setCid(1602);
        return userMapper.insert(user);
    }

    @Override
    public int delete(int id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(User user) {
        user.setId(19);
        user.setName("小白");
        user.setAge(18);
        user.setCid(1602);
        return userMapper.updateByPrimaryKey(user);
    }
}
