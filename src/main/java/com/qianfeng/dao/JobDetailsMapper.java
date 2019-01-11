package com.qianfeng.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.qianfeng.pojo.EmployInfo;
import com.qianfeng.pojo.JobDetails;

public interface JobDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JobDetails record);

    int insertSelective(JobDetails record);

    JobDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobDetails record);

    int updateByPrimaryKey(JobDetails record);

	/**
	 * 
	 */
    @Select("select id,job,companyName,pay,name,identity,replySpeed,jobDescribe,request from jobdetails")
	@ResultType(JobDetails.class)
	List<JobDetailsMapper> findJobDetailsAll();
}