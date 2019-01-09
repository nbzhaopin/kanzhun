package com.qianfeng.service;


import com.qianfeng.vo.CompanyVo;
import com.qianfeng.vo.PageBeanVo;


public interface CompanyService {
	

	public PageBeanVo<CompanyVo> selectByTJ(int page, int limit, String cname, String pname, String grade, String level);
}
