package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.service.CompanyService;
import com.qianfeng.vo.CompanyVo;
import com.qianfeng.vo.PageBeanVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/com")
@CrossOrigin
@Api(produces = "这是Java编写的接口文档",value = "接口文档")
public class CompanyController {
	
	@Autowired
	private CompanyService cse;
	
	@ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"数量","名次"},value = "获取名次接口")
	@RequestMapping("/showAll.do")
	public PageBeanVo<CompanyVo> showAll(int page, int limit, String cname, String pname, String grade, String level) {
		
		return cse.selectByTJ(page, limit, cname, pname, grade, level);
	}
}
