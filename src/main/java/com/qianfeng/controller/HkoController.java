package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;


import com.qianfeng.pojo.Hko;

import com.qianfeng.service.HkoService;
import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@Api(value="首页面试经",produces="首页面试经")
@RestController
public class HkoController {
	
	@Autowired
	private HkoService hmr;
	
	@ApiOperation(value="首页面试经展示")
	@PostMapping("hkcshowAll.do")
	public PageBeanVo<Hko> showAll(int page, int limit,Integer id) {
		return hmr.findById(page, limit, id);
	}
	
	@ApiOperation(value="首页面试经添加")
	@PostMapping("hkcshowadd.do")
	public ResultVo add(Hko hko) {
		return hmr.add(hko);
	}
}
