package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.pojo.Focusask;

import com.qianfeng.service.FocusaskService;

import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@Api(value="我的收藏/关注",produces="我的收藏/关注-问答")
@RestController
public class FocusaskController {
	

	@Autowired
	private FocusaskService fse;
	
	@ApiOperation(value="我的收藏/关注-问答展示，id是用户id")
	@PostMapping("fkhowAll.do")
	public PageBeanVo<Focusask> showAll(int page, int limit,Integer id) {
		return fse.findById(page, limit, id);
	}
	
	@ApiOperation(value="我的收藏/关注-问答添加")
	@PostMapping("fkhowadd.do")
	public ResultVo add(Focusask focusask) {
		return fse.add(focusask);
	}
}
