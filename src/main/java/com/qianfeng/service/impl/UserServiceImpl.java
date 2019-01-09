package com.qianfeng.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.UserMapper;
import com.qianfeng.pojo.User;
import com.qianfeng.service.UserService;
import com.qianfeng.util.EncryptUtil;
import com.qianfeng.vo.ResultVo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public ResultVo findAll() {
		// TODO Auto-generated method stub
		return ResultVo.setOK(userMapper.findAll());
	}
	@Override
	public ResultVo saveUser(User user) {
		// TODO Auto-generated method stub
		user.setPassword(EncryptUtil.md5Enc(user.getPassword()));
		if(userMapper.insertSelective(user)>0) {
			return ResultVo.setOK("添加成功");
		}else {
			return ResultVo.setERROR("登录失败");
		}
	}
	@Override
	public ResultVo login(String phone, String password) {
		// TODO Auto-generated method stub
		User user = userMapper.findUserByphone(phone);
		if (user != null) {
			if (user.getPassword().equals(EncryptUtil.md5Enc(password))) {
				return ResultVo.setOK(user);
			}else {
				return ResultVo.setERROR("密码错误");
			}
		}else {
			return ResultVo.setERROR("未找到该用户");
		}
	}

}
