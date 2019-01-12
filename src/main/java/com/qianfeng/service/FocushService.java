package com.qianfeng.service;

import com.qianfeng.pojo.Focush;

import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

public interface FocushService {
	
	public PageBeanVo<Focush> findById(int page, int limit,Integer id);
	
	public ResultVo add(Focush focush);
}
