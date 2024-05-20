package com.demo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: 今天不加班
 * @date: 2024/5/19 19:33:27
 * @description: 用户
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String username;
    private String password;
    private String email;
    private String role;
    private Boolean enabled;

}
