package com.qianfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.ProfessorMapper;
import com.qianfeng.service.ProfessorService;
import com.qianfeng.vo.ResultVo;
@Service
public class ProfessorServiceImpl implements ProfessorService{

	
	@Autowired
	private ProfessorMapper professorMapper;
	@Override
	public ResultVo findAllPosition() {
		// TODO Auto-generated method stub
		return ResultVo.setOK(professorMapper.findAllPosition());
	}

}
