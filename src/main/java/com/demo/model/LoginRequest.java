package com.demo.model;

import lombok.Data;

/**
 * @author: 今天不加班
 * @date: 2024/5/19 19:54:46
 * @description: 登录请求对象
 */
@Data
public class LoginRequest {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;
}
