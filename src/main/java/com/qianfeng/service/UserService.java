package com.qianfeng.service;



import com.qianfeng.pojo.User;
import com.qianfeng.vo.ResultVo;

public interface UserService {

	ResultVo findAll();
	
	ResultVo saveUser(User user);
	
	ResultVo login(String phone, String Password);
	
	User findUserById(Integer userId);
}
