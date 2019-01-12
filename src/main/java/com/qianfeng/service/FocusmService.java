package com.qianfeng.service;

import com.qianfeng.pojo.Focusm;

import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

public interface FocusmService {
	
	public PageBeanVo<Focusm> findById(int page, int limit,Integer id);
	
	public ResultVo add(Focusm focusm);
}
