package com.qianfeng.service;

import com.qianfeng.pojo.Answer;
import com.qianfeng.vo.ResultVo;

public interface AnswerService {

	int findCountByAskId(Integer askId);
	
	ResultVo addAnswer(Answer answer);
}
