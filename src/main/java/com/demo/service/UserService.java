package com.demo.service;

import com.demo.mapper.UserMapper;
import com.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author: 今天不加班
 * @date: 2024/5/19 19:38:14
 * @description: 用户业务接口层
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * 根据用户名查询用户
     * @param username 用户名
     * @return
     */
    public User findByUsername(String username){
        return userMapper.findByUsername(username);
    }

    /**
     * 保存用户
     * @param user
     */
    public void saveUser(User user){
        //重新设置密码
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("USER");
        user.setEnabled(true);
        userMapper.save(user);
    }

}
