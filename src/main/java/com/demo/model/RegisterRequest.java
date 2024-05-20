package com.demo.model;

import lombok.Data;

/**
 * @author: 今天不加班
 * @date: 2024/5/19 19:52:17
 * @description: 用户注册对象
 */
@Data
public class RegisterRequest {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;
}
