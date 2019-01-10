package com.qianfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.AnswerMapper;
import com.qianfeng.pojo.Answer;
import com.qianfeng.service.AnswerService;
import com.qianfeng.vo.ResultVo;

@Service
public class AnswerServiceImpl implements AnswerService{

	@Autowired
	private AnswerMapper answerMapper;
	@Override
	public int findCountByAskId(Integer askId) {
		// TODO Auto-generated method stub
		
		return answerMapper.findCountByAskId(askId);
	}
	@Override
	public ResultVo addAnswer(Answer answer) {
		// TODO Auto-generated method stub
		if (answerMapper.insert(answer) > 0) {
			return ResultVo.setOK(null);
		}else {
			return ResultVo.setERROR();
		}
	}

}
