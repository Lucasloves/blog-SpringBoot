package com.hxh.blog.mapper;

import com.hxh.blog.pojo.User;

import java.util.List;

/*
 * mybatis数据库接口
 * mapper
 * */

public interface UserMapper {

    void insertUser(User user);

    User queryUserByUsername(String username);

    List<User> getAllUser();

}
