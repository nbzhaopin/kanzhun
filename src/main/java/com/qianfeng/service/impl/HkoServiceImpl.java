package com.qianfeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qianfeng.dao.HkoMapper;
import com.qianfeng.pojo.Hko;

import com.qianfeng.service.HkoService;
import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

@Service
public class HkoServiceImpl implements HkoService {
	
	@Autowired
	private HkoMapper hmr;
	
	@Override
	public PageBeanVo<Hko> findById(int page, int limit, Integer id) {
		Page<Object> pageinfo = PageHelper.startPage(page, limit);
		List<Hko> list = hmr.selectById(id);
		
		return PageBeanVo.setPage((int) pageinfo.getTotal(), list);
		
	}

	@Override
	public ResultVo add(Hko hko) {
		if (hmr.insertSelective(hko) > 0) {
			return ResultVo.setOK(null);
		} else {
			return ResultVo.setERROR();
		}
		
		
	}

}
