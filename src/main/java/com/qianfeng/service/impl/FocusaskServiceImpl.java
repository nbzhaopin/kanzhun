package com.qianfeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qianfeng.dao.FocusaskMapper;
import com.qianfeng.pojo.Focusask;

import com.qianfeng.service.FocusaskService;
import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

@Service
public class FocusaskServiceImpl implements FocusaskService {
	
	@Autowired
	private FocusaskMapper fmr;
	
	@Override
	public PageBeanVo<Focusask> findById(int page, int limit, Integer id) {
		Page<Object> pageinfo = PageHelper.startPage(page, limit);
		List<Focusask> list = fmr.selectById(id);
		
		return PageBeanVo.setPage((int) pageinfo.getTotal(), list);
		
	}

	@Override
	public ResultVo add(Focusask focusask) {
		if (fmr.insertSelective(focusask) > 0) {
			return ResultVo.setOK(null);
		} else {
			return ResultVo.setERROR();
		}
		
	}

}
