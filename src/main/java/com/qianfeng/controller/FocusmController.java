package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.pojo.Focusm;

import com.qianfeng.service.FocusmService;

import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@Api(value="我的收藏/关注",produces="我的收藏/关注-点评")
@RestController
public class FocusmController {
	

	@Autowired
	private FocusmService hmr;
	
	@ApiOperation(value="我的收藏/关注-点评展示，id是用户id")
	@PostMapping("fmcshowAll.do")
	public PageBeanVo<Focusm> showAll(int page, int limit,Integer id) {
		return hmr.findById(page, limit, id);
	}
	
	@ApiOperation(value="我的收藏/关注-点评添加")
	@PostMapping("fmchowadd.do")
	public ResultVo add(Focusm focusm) {
		return hmr.add(focusm);
	}
}
