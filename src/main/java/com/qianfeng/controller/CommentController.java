package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.service.CommentService;
import com.qianfeng.vo.ResultVo;

import io.swagger.annotations.Api;

@Api(value="dafklsf")
@RestController
@CrossOrigin
public class CommentController {

	@Autowired
	private CommentService conmmentService;
	
	@GetMapping("findComments.do")
	public ResultVo findAllComment(Integer id) {
		return conmmentService.findCommentByAskId(id);
	}
}
