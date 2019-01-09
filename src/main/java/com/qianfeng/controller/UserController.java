package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.pojo.User;
import com.qianfeng.service.UserService;
import com.qianfeng.vo.ResultVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "用户接口文档")
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@ApiOperation(value = "测试获取所有用户信息")
	@GetMapping("/userlist.do")
	public ResultVo findAll() {
		return userService.findAll();
	}
	
	@ApiOperation(value="添加用户注册信息到数据库")
	@GetMapping("/register.do")
	public ResultVo addUser(User user) {
		return userService.saveUser(user);
	}
}
