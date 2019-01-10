package com.qianfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.InterestprofessorMapper;
import com.qianfeng.pojo.Interestprofessor;
import com.qianfeng.service.InterestProfessorService;
import com.qianfeng.vo.ResultVo;
@Service
public class InterestProfessorServiceImpl implements InterestProfessorService{

	@Autowired
	private InterestprofessorMapper interestprofessorMapper;
	@Override
	public ResultVo addInterPor(Interestprofessor interestprofessor) {
		// TODO Auto-generated method stub
		if(interestprofessorMapper.insertSelective(interestprofessor)>0) {
			return ResultVo.setOK(null);
		}else {
			return ResultVo.setERROR();
		}
	}

}
