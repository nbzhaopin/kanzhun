package com.qianfeng.service;

import com.qianfeng.pojo.Focusask;

import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

public interface FocusaskService {
	
	public PageBeanVo<Focusask> findById(int page, int limit,Integer id);
	
	public ResultVo add(Focusask focusask);
}
