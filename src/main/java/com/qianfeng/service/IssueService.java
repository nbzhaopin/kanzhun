package com.qianfeng.service;

import com.qianfeng.pojo.Issue;
import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;


public interface IssueService {
	
	public PageBeanVo<Issue> findById(int page, int limit,Integer id);
	
	public ResultVo add(Issue issue);
}
