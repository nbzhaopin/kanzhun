package com.qianfeng.service;

import java.util.List;

import com.qianfeng.pojo.Ask;
import com.qianfeng.vo.AskVo;
import com.qianfeng.vo.CommentVo;
import com.qianfeng.vo.ResultVo;

public interface AskService {

	List<AskVo> findAll();
	ResultVo addAsk(Ask ask);
	ResultVo updateAsk(Ask ask);
	ResultVo deleteAskById(Integer id);
	ResultVo askdetailById();
	List<CommentVo> findAnswerByAskId(Integer id);
	
	
}
