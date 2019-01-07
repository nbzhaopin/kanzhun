package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.pojo.User;
import com.qianfeng.service.UserService;
import com.qianfeng.vo.ResultVo;

@RestController
public class UserController {

	//kdjsd
	@Autowired
	private UserService userService;
	
	@GetMapping("/userlist.do")
	public ResultVo findAll() {
		return userService.findAll();
	}
	
	@GetMapping("/register.do")
	public ResultVo addUser(User user) {
		return userService.saveUser(user);
	}
}
