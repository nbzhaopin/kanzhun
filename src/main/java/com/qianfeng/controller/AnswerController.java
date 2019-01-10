package com.qianfeng.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.qianfeng.pojo.Answer;
import com.qianfeng.service.AnswerService;
import com.qianfeng.vo.ResultVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(value="问答页面回答",tags= {"问答页面针对问题的回答"})
@RestController
public class AnswerController {

	@Autowired
	private AnswerService answerService;
	
	@ApiOperation(value="用户回答精选问题、唠嗑问题等",notes="注意图片的属性名：name与参数名保持一致upfile,情况紧急，先上传一张就行了")
	@PostMapping("addAnswer.do")
	public ResultVo addAnswer(@RequestParam MultipartFile upfile, Answer answer) {
		
		String fName = upfile.getOriginalFilename();
		String path = "D:/upload";
		File file = new File(path);
		if (!file.exists()) {
			file.mkdir();
		}
		File f = new File(path, fName);
		try {
			upfile.transferTo(f);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		answer.setImg(f.getAbsolutePath());
		
		
		return answerService.addAnswer(answer);
	}
}
