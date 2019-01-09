package com.qianfeng.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qianfeng.dao.CompanyMapper;
import com.qianfeng.service.CompanyService;
import com.qianfeng.vo.CompanyVo;
import com.qianfeng.vo.PageBeanVo;
@Service
public class CompanyServiceImpl implements CompanyService {
	
	
	@Autowired
	private CompanyMapper com;

	@Override
	public PageBeanVo<CompanyVo> selectByTJ(int page, int limit, String cname, String pname, String grade,
			String level) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		map.put("cname", cname);
		map.put("pname", pname);
		map.put("grade", grade);
		map.put("level", level);
		
		Page<Object> pageinfo = PageHelper.startPage(page, limit);
		List<CompanyVo> list = com.selectByDT(map);
		
		return PageBeanVo.setPage((int) pageinfo.getTotal(), list);
	}
}
