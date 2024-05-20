package com.demo.mapper;

import com.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * @author: 今天不加班
 * @date: 2024/5/19 19:35:02
 * @description: 用户接口层
 */
@Mapper
public interface UserMapper {

    //@Select("select * from users where username = #{username}")
    User findByUsername(String username);

    //@Insert("INSERT INTO users(username, password, email, role, enabled) VALUES(#{username}, #{password}, #{email}, #{role}, #{enabled})")
    //@Options(useGeneratedKeys = true, keyProperty = "id")
    void save(User user);
}
