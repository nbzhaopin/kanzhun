package com.qianfeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.qianfeng.dao.FocusmMapper;
import com.qianfeng.pojo.Focusm;
import com.qianfeng.pojo.Hko;
import com.qianfeng.service.FocusmService;
import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;
@Service
public class FocusmServiceImpl implements FocusmService {
	
	@Autowired
	private FocusmMapper fmr;
	
	@Override
	public PageBeanVo<Focusm> findById(int page, int limit, Integer id) {
		Page<Object> pageinfo = PageHelper.startPage(page, limit);
		List<Focusm> list = fmr.selectById(id);
		
		return PageBeanVo.setPage((int) pageinfo.getTotal(), list);
		
	}

	@Override
	public ResultVo add(Focusm focusm) {
		if (fmr.insertSelective(focusm) > 0) {
			return ResultVo.setOK(null);
		} else {
			return ResultVo.setERROR();
		}
		
	}

}
