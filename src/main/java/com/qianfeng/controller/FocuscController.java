package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.pojo.Focusc;

import com.qianfeng.service.FocuscService;

import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@Api(value="我的收藏/关注",produces="我的收藏/关注-公司")
@RestController
public class FocuscController {
	

	@Autowired
	private FocuscService hmr;
	
	@ApiOperation(value="我的收藏/关注-公司展示，id是用户id")
	@PostMapping("fccshowAll.do")
	public PageBeanVo<Focusc> showAll(int page, int limit,Integer id) {
		return hmr.findById(page, limit, id);
	}
	
	@ApiOperation(value="我的收藏/关注-公司添加")
	@PostMapping("fccshowadd.do")
	public ResultVo add(Focusc focusc) {
		return hmr.add(focusc);
	}
}
