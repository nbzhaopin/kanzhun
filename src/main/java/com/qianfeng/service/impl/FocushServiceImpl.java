package com.qianfeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qianfeng.dao.FocushMapper;
import com.qianfeng.pojo.Focush;
import com.qianfeng.pojo.Hko;
import com.qianfeng.service.FocushService;
import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

@Service
public class FocushServiceImpl implements FocushService {
	
	@Autowired
	private FocushMapper fmr;
	
	@Override
	public PageBeanVo<Focush> findById(int page, int limit, Integer id) {
		Page<Object> pageinfo = PageHelper.startPage(page, limit);
		List<Focush> list = fmr.selectById(id);
		
		return PageBeanVo.setPage((int) pageinfo.getTotal(), list);
		
	}

	@Override
	public ResultVo add(Focush focush) {
		if (fmr.insertSelective(focush) > 0) {
			return ResultVo.setOK(null);
		} else {
			return ResultVo.setERROR();
		}
		
	}

}
