package com.qianfeng.service;

import com.qianfeng.pojo.Hko;

import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

public interface HkoService {
	
	public PageBeanVo<Hko> findById(int page, int limit,Integer id);
	
	public ResultVo add(Hko hko);
}
