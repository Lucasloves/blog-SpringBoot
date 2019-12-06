package com.hxh.blog.controller;

/*
 * 用户相关控制器 用来获取前端发来的信息
 * 匹配指定接口进行返回数据
 * */

import com.hxh.blog.service.UserService;
import com.hxh.blog.util.ResponseWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(tags = "用户相关接口")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("注册用户账号密码接口")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseWrapper register(String username, String password) {
        return userService.insertUser(username, password);
    }

    @ApiOperation("登录判断用户接口")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseWrapper login(String username, String password) {
        return userService.login(username, password);
    }

    @ApiOperation("获取全部用户接口")
    @RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
    public ResponseWrapper getAllUser() {
        return userService.getAllUserData();
    }

    @ApiOperation("测试接口")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test(String name) {
        System.out.println(name);
    }

}
