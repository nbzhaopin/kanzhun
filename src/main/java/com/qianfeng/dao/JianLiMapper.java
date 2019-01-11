package com.qianfeng.dao;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.qianfeng.pojo.JianLi;
import com.qianfeng.pojo.JobGangWei;

public interface JianLiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JianLi record);

    int insertSelective(JianLi record);

    JianLi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JianLi record);

    int updateByPrimaryKey(JianLi record);

	/**
	 * @param id2
	 */
    @Select("select id,name,area,profession,birthday,email,status,wantjob,wanthangye,wantarea,wantpay,workexperience,eudcationexperience from jianli where id=#{id2} ")
	@ResultType(JianLi.class)
	JianLi findJianliByid(int id2);
}