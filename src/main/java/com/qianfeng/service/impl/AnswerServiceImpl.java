package com.qianfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.AnswerMapper;
import com.qianfeng.service.AnswerService;

@Service
public class AnswerServiceImpl implements AnswerService{

	@Autowired
	private AnswerMapper answerMapper;
	@Override
	public int findCountByAskId(Integer askId) {
		// TODO Auto-generated method stub
		
		return answerMapper.findCountByAskId(askId);
	}

}
