package com.qianfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.UinfoMapper;
import com.qianfeng.pojo.Uinfo;
import com.qianfeng.service.UinfoService;
import com.qianfeng.vo.ResultVo;

@Service
public class UinfoServiceImpl implements UinfoService{

	@Autowired
	private UinfoMapper uinfoMapper;

	@Override
	public ResultVo addUinfo(Uinfo uinfo) {
		// TODO Auto-generated method stub
		if (uinfoMapper.insertSelective(uinfo) > 0) {
			return ResultVo.setOK(null);
		}else {
			return ResultVo.setERROR();
		}
	}
	
	
}
