package com.qianfeng.service;

import com.qianfeng.pojo.Focusc;
import com.qianfeng.pojo.Hko;
import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

public interface FocuscService {
	
	public PageBeanVo<Focusc> findById(int page, int limit,Integer id);
	
	public ResultVo add(Focusc focusc);
}
