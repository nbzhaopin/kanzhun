package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.pojo.Comment;
import com.qianfeng.service.CommentService;
import com.qianfeng.vo.ResultVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value="首页问答中答案的用户评论",tags= {"首页问答中答案的用户评论"})
@RestController
@CrossOrigin
public class CommentController {

	@Autowired
	private CommentService conmmentService;
	
	@GetMapping("findComments.do")
	public ResultVo findAllComment(Integer id) {
		return conmmentService.findCommentByAskId(id);
	}
	
	@GetMapping("saveComment.do")
	@ApiOperation(value="添加答案的用户评论")
	public ResultVo saveComment(@ApiParam(name="comment",value="注意一下参数的属性名")Comment comment) {
		return conmmentService.insertComment(comment);
	}
	
}
