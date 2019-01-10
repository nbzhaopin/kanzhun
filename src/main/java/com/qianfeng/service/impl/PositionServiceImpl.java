package com.qianfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.PositionMapper;
import com.qianfeng.service.PositionService;
import com.qianfeng.vo.ResultVo;
@Service
public class PositionServiceImpl implements PositionService{

	@Autowired
	private PositionMapper positionMapper;
	@Override
	public ResultVo allPosition() {
		// TODO Auto-generated method stub
		return ResultVo.setOK(positionMapper.findAllPosition());
	}

}
