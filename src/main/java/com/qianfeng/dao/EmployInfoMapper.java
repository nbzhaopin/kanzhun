package com.qianfeng.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.qianfeng.pojo.EmployInfo;
import com.qianfeng.pojo.Myfrinds;


public interface EmployInfoMapper {
	
	@Select("select id,job,companyName,place,education,jobAge,pay from employinfo")
	@ResultType(EmployInfo.class)
    List<EmployInfo> findEmployInfoAll();

	int deleteByPrimaryKey(Integer id);

    int insert(EmployInfo record);

    int insertSelective(EmployInfo record);

    EmployInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployInfo record);

    int updateByPrimaryKey(EmployInfo record);
    
}