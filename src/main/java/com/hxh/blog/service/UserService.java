package com.hxh.blog.service;

import com.hxh.blog.util.ResponseWrapper;

/*
 * 用户业务逻辑接口
 * service
 * */

public interface UserService {

    ResponseWrapper insertUser(String username, String password);

    ResponseWrapper login(String username, String password);

    ResponseWrapper getAllUserData();

}
