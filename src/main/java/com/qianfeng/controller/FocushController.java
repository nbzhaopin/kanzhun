package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.pojo.Focush;

import com.qianfeng.service.FocushService;

import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@Api(value="我的收藏/关注",produces="我的收藏/关注-面试经")
@RestController
public class FocushController {
	

	@Autowired
	private FocushService hmr;
	
	@ApiOperation(value="我的收藏/关注-面试经展示，id是用户id")
	@PostMapping("fhcshowAll.do")
	public PageBeanVo<Focush> showAll(int page, int limit,Integer id) {
		return hmr.findById(page, limit, id);
	}
	
	@ApiOperation(value="我的收藏/关注-面试经添加")
	@PostMapping("fkcshowadd.do")
	public ResultVo add(Focush focush) {
		return hmr.add(focush);
	}
}
