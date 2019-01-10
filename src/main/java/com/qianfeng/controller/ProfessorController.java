package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.service.ProfessorService;
import com.qianfeng.vo.ResultVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(value="行业",tags= {"行业"})
@RestController
public class ProfessorController {

	@Autowired
	private ProfessorService professorService;
	
	@GetMapping("professorlist.do")
	@ApiOperation(value="获取全部的行业信息",notes="全部的行业信息展示，可放在登录页面第三页")
	public ResultVo findAllProfessor() {
		return professorService.findAllPosition();
	}
}
