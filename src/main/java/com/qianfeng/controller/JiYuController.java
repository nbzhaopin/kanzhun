/**
 * 
 */
package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.pojo.Myfrinds;
import com.qianfeng.service.JiYuService;
import com.qianfeng.vo.ResultVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/** 
* @ClassName: JiYuController 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author wei 
* @date 2019年1月8日 下午10:07:55 
*  
*/
@Api(value="机遇",tags="机遇")
@RestController
@CrossOrigin
public class JiYuController {
	@Autowired
	JiYuService jiyuService;
	

	@ApiOperation(value="我的好友信息 无参数")
	@GetMapping("/findFriends.do")
	public ResultVo findFriends() {
		return jiyuService.findFriends();
	}
	
	@ApiOperation(value="推荐好友信息 无参数")
	@GetMapping("/findTuiJianFriends.do")
	public ResultVo findTuiJianFriends() {
		return jiyuService.findTuiJianFriends();
	}
	
	@ApiOperation(value="添加好友  参数 (name,profession,relation)")
	@PutMapping("/addFriends.do")
	public ResultVo add(Myfrinds friends) {
		friends.setRelation("好友");
		return jiyuService.add(friends);
		
	}
	@ApiOperation(value="人脉探索  参数 (relation)")
	@GetMapping("/findFriendsByRelation.do")
	public ResultVo findFriendsByRelation(String relation) {
		return jiyuService.findFriendsByRelation(relation);
	}
	
	@ApiOperation(value="求职招聘  参数 无")
	@GetMapping("/findEmployInfoAll.do")
	public ResultVo findEmployInfoAll() {
		return jiyuService.findEmployInfoAll();
	}
	
	@ApiOperation(value="求职招聘  参数 无")
	@GetMapping("/findJobDetailsAll.do")
	public ResultVo findJobDetailsAll() {
		return jiyuService.findJobDetailsAll();
	}
	
	@ApiOperation(value="地区  参数 无")
	@GetMapping("/findAreaByid.do")
	public ResultVo findAreaByid(String id) {
		int id2 = Integer.parseInt(id);
		return jiyuService.findAreaByid(id2);
	}
	@ApiOperation(value="职位  参数 无")
	@GetMapping("/findJobgangweiByid.do")
	public ResultVo findJobgangweiByid(String id) {
		int id2 = Integer.parseInt(id);
		return jiyuService.findJobgangweiByid(id2);
	}
	
	
	
	@PostMapping("/findUrlByid.do")
	public ResultVo findUrlByid(String id) {
		int id2 = Integer.parseInt(id);
		return jiyuService.findUrlByid(id2);
	}
	
	@PostMapping("/findJianliByid.do")
	public ResultVo findJianliByid(String id) {
		int id2 = Integer.parseInt(id);
		return jiyuService.findJianliByid(id2);
	}
	
	@PostMapping("/findhabitByid.do")
	public ResultVo findhabitByid(String id) {
		int id2 = Integer.parseInt(id);
		return jiyuService.findhabitByid(id2);
	}
	
}
