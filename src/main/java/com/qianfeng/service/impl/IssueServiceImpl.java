package com.qianfeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qianfeng.dao.IssueMapper;
import com.qianfeng.pojo.Issue;
import com.qianfeng.service.IssueService;
import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

@Service
public class IssueServiceImpl implements IssueService {
	
	@Autowired
	private IssueMapper imr;
	
	@Override
	public PageBeanVo<Issue> findById(int page, int limit,Integer id) {
		Page<Object> pageinfo = PageHelper.startPage(page, limit);
		List<Issue> list = imr.selectById(id);
		
		return PageBeanVo.setPage((int) pageinfo.getTotal(), list);
	}

	@Override
	public ResultVo add(Issue issue) {
		// TODO Auto-generated method stub
		if (imr.insertSelective(issue) > 0) {
			return ResultVo.setOK(null);
		} else {
			return ResultVo.setERROR();
		}
		
	}

}
