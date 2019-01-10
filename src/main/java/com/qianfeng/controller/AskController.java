package com.qianfeng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.pojo.Ask;
import com.qianfeng.service.AnswerService;
import com.qianfeng.service.AskService;
import com.qianfeng.service.ConcernService;
import com.qianfeng.vo.AskVo;
import com.qianfeng.vo.AskandAnswers;
import com.qianfeng.vo.ResultVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@CrossOrigin
@Api(value="首页问答的问题",produces="首页问答的问题",tags= {"首页问答"})
@RestController
public class AskController {

	@Autowired
	private AskService askService;
	@Autowired
	private ConcernService concernService;
	@Autowired
	private AnswerService answerService;
	
	@ApiOperation(value="获取四大类问题的具体列表")
	@GetMapping("asklist.do")
	public ResultVo findall() {
		List<AskVo> list = askService.findAll();
		return ResultVo.setOK(list);
	}
	
	@ApiOperation(value="增加问题信息",notes="注意传入具体的类型state,1 精选 2 干货 3 狗血 4唠嗑")
	@GetMapping("addask.do")
	public ResultVo addAsk(Ask ask) {
		return askService.addAsk(ask);
	}
	
	@ApiOperation(value="删除问题信息")
	@GetMapping("delask.do")
	public ResultVo delAsk(Integer id) {
		return askService.deleteAskById(id);
	}
	
	@ApiOperation(value="修改问题信息")
	@GetMapping("updateask.do")
	public ResultVo updateAsk(Ask ask) {
		return askService.updateAsk(ask);
	}
	
	@ApiOperation(value="获取问题的具体信息 用户回答以及回答评论")
	@GetMapping("askdetail.do")
	public ResultVo findAskDetailById(Integer askId) {
		AskandAnswers answers = new AskandAnswers();
		answers.setFocus(concernService.findCountByAskId(askId));
		answers.setAnswercount(answerService.findCountByAskId(askId));
		answers.setAnswers(askService.findAnswerByAskId(askId));
		return ResultVo.setOK(answers);
		
		
	}
}
