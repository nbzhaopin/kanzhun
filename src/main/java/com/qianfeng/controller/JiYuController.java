/**
 * 
 */
package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.pojo.Myfrinds;
import com.qianfeng.service.JiYuService;
import com.qianfeng.vo.ResultVo;

/** 
* @ClassName: JiYuController 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author wei 
* @date 2019年1月8日 下午10:07:55 
*  
*/
@RestController
public class JiYuController {
	@Autowired
	JiYuService jiyuService;
	

	@GetMapping("/findFriends.do")
	public ResultVo findFriends() {
		return jiyuService.findFriends();
	}
	
	@GetMapping("/findTuiJianFriends.do")
	public ResultVo findTuiJianFriends() {
		return jiyuService.findTuiJianFriends();
	}
	
	@PutMapping("/addFriends.do")
	public ResultVo add(Myfrinds friends) {
		return jiyuService.add(friends);
		
	}
	
	@GetMapping("/findFriendsByRelation.do")
	public ResultVo findFriendsByRelation(String relation) {
		return jiyuService.findFriendsByRelation(relation);
	}
	
	
	@GetMapping("/findEmployInfoAll.do")
	public ResultVo findEmployInfoAll() {
		return jiyuService.findEmployInfoAll();
	}
	
	
	@GetMapping("/findJobDetailsAll.do")
	public ResultVo findJobDetailsAll() {
		return jiyuService.findJobDetailsAll();
	}
	
	@GetMapping("/findAreaByid.do")
	public ResultVo findAreaByid(String id) {
		int id2 = Integer.parseInt(id);
		return jiyuService.findAreaByid(id2);
	}
	
	@GetMapping("/findJobgangweiByid.do")
	public ResultVo findJobgangweiByid(String id) {
		int id2 = Integer.parseInt(id);
		return jiyuService.findJobgangweiByid(id2);
	}
}
