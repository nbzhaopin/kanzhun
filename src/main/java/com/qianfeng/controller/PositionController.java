package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.service.PositionService;
import com.qianfeng.vo.ResultVo;

import io.swagger.annotations.Api;
@Api(value="职业",tags= {"职业"})
@RestController
public class PositionController {

	@Autowired
	private PositionService positionService;
	
	@GetMapping("positionlist.do")
	public ResultVo findAllPosition() {
		return positionService.allPosition();
	}
}
