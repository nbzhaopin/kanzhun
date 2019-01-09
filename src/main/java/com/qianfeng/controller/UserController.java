package com.qianfeng.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.pojo.User;
import com.qianfeng.service.UserService;
import com.qianfeng.vo.ResultVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "用户接口文档")
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@ApiOperation(value = "测试获取所有用户信息")
	@GetMapping("/userlist.do")
	@CrossOrigin
	public ResultVo findAll() {
		return userService.findAll();
	}
	
	@ApiOperation(value="添加用户注册信息到数据库")
	@GetMapping("/register.do")
	@CrossOrigin
	public ResultVo addUser(@ApiParam(name="user",value="表单字段名符合user类的属性")User user) {
		return userService.saveUser(user);
	}
	
	@ApiOperation(value="用户登录信息")
	@GetMapping("/login.do")
	@CrossOrigin
	public ResultVo login(@ApiParam(name="phone",value="用户手机号参数name为phone")String phone, @ApiParam(name="password",value="用户密码参数name为password")String password, @ApiParam(value="不用管")HttpSession session) {
		User user = (User)userService.login(phone, password).getData();
		session.setAttribute("user", user);
		return userService.login(phone, password);
	}
	
	@ApiOperation(value="获取当前登录用户信息")
	@GetMapping("/getUserInfo.do")
	@CrossOrigin
	public ResultVo getUser(@ApiParam(value="不用管")HttpSession session) {
		User user = (User)session.getAttribute("user");
		return ResultVo.setOK(user);
	}
	
}
