package com.qianfeng.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth0.jwt.interfaces.Claim;
import com.qianfeng.pojo.User;
import com.qianfeng.service.UserService;
import com.qianfeng.util.JwtToken;
import com.qianfeng.vo.ResultVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
@Api(value = "用户接口文档",tags= {"登录页面"})
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
	@PostMapping("/loginandtoken.do")
	@CrossOrigin
	public ResultVo login2(String phone,String password) {
		ResultVo resultVo = userService.login(phone, password);
		String token = null;
		if (resultVo.getCode() == 1) {
			User user = (User)resultVo.getData();
			try {
				token = JwtToken.createToken(user.getId());
				return ResultVo.setOK(token);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ResultVo.setOK(token);
		
	}
	
	@ApiOperation(value="验证token信息")
	@PostMapping("/verifytoken.do")
	@CrossOrigin
	public ResultVo verifytoken(String token) {
		
		try {
			Map<String, Claim> map = JwtToken.verifyToken(token);
			Integer userId = JwtToken.getAppUID(token);
			User user = userService.findUserById(userId);
			return ResultVo.setOK(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultVo.setERROR("用户信息已过期");
		}
		
		
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
