package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.pojo.Issue;
import com.qianfeng.service.IssueService;
import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController

@CrossOrigin
@Api(produces = "这是Java编写的接口文档",value = "首页-公司")
public class IssueController {
	
	@Autowired
	private IssueService ise;
	
	@ApiOperation(notes = "实现传递参数，响应指定数量的数据",value = "看公司-提问展示，id是公司id")
	@PostMapping("icrshowAll.do")
	public PageBeanVo<Issue> showAll(int page, int limit,Integer id) {
		return ise.findById(page, limit, id);
	}
	
	@ApiOperation(notes = "实现传递参数，响应指定数量的数据",value = "看公司-提问添加")
	@PostMapping("icradd.do")
	public ResultVo add(Issue issue) {
		return ise.add(issue);
	}
}
