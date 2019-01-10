package com.qianfeng.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.pojo.Message;
import com.qianfeng.service.MessageService;
import com.qianfeng.vo.ResultVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/mcr")
@CrossOrigin
@Api(produces = "这是Java编写的接口文档",value = "首页-公司")
public class MessageController {
	
	private MessageService mse;
	
	@ApiOperation(notes = "实现传递参数，响应指定数量的数据",value = "看公司-点评展示")
	@RequestMapping("/showAll")
	public ResultVo showAll(Integer id) {
		return mse.findById(id);
	}
	
	@ApiOperation(notes = "实现传递参数，响应指定数量的数据",value = "看公司-点评添加")
	@RequestMapping("/showAll")
	public ResultVo add(Message record, String grade) {
		return mse.addById(record, grade);
		
	}
	
}
