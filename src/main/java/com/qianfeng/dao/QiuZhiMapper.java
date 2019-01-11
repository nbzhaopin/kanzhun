package com.qianfeng.dao;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.qianfeng.pojo.QiuZhi;

public interface QiuZhiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QiuZhi record);

    int insertSelective(QiuZhi record);

    QiuZhi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QiuZhi record);

    int updateByPrimaryKey(QiuZhi record);

	/**
	 * @param id2
	 */
    @Select("select url from qiuzhi where id=#{id2}")
    @ResultType(String.class)
	String findUrlByid(int id2);
}