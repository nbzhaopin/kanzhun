package com.qianfeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qianfeng.dao.FocuscMapper;
import com.qianfeng.pojo.Focusc;
import com.qianfeng.pojo.Hko;
import com.qianfeng.service.FocuscService;
import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

@Service
public class FocuscServiceImpl implements FocuscService {
	
	@Autowired
	private FocuscMapper fmr;
	
	@Override
	public PageBeanVo<Focusc> findById(int page, int limit, Integer id) {
		Page<Object> pageinfo = PageHelper.startPage(page, limit);
		List<Focusc> list = fmr.selectById(id);
		
		return PageBeanVo.setPage((int) pageinfo.getTotal(), list);
		
	}

	@Override
	public ResultVo add(Focusc focusc) {
		if (fmr.insertSelective(focusc) > 0) {
			return ResultVo.setOK(null);
		} else {
			return ResultVo.setERROR();
		}
		
	}

}
