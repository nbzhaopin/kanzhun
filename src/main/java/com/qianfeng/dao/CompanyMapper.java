package com.qianfeng.dao;

import java.util.List;
import java.util.Map;

import com.qianfeng.pojo.Company;
import com.qianfeng.vo.CompanyVo;

public interface CompanyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
    
    List<CompanyVo> selectByDT(Map<String, Object> map);
}