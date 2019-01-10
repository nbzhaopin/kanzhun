package com.qianfeng.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.qianfeng.pojo.JobGangWei;
import com.qianfeng.pojo.Myfrinds;

public interface JobGangWeiMapper {
    int deleteByPrimaryKey(Integer jid);

    int insert(JobGangWei record);

    int insertSelective(JobGangWei record);

    JobGangWei selectByPrimaryKey(Integer jid);

    int updateByPrimaryKeySelective(JobGangWei record);

    int updateByPrimaryKey(JobGangWei record);

	/**
	 * @param id2
	 */
    @Select("select jid,name from jobgangwei where did={#id2} ")
	@ResultType(JobGangWei.class)
	List<JobGangWei> findJobgangweiByid(int id2);
}