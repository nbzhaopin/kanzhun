package com.qianfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.ConcernMapper;
import com.qianfeng.service.ConcernService;

@Service
public class ConcernServiceImpl implements ConcernService{

	@Autowired
	private ConcernMapper concernMapper;
	@Override
	public int findCountByAskId(Integer id) {
		// TODO Auto-generated method stub
		return concernMapper.findCountByAskId(id);
	}

}
