package com.qianfeng.service;


import com.qianfeng.pojo.Company;
import com.qianfeng.vo.CompanyVo;
import com.qianfeng.vo.PageBeanVo;


public interface CompanyService {
	

	public PageBeanVo<Company> selectByTJ(int page, int limit, String ciname, String pname, String grade, String level);
}
