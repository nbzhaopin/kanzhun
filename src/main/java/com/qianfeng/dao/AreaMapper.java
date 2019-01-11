package com.qianfeng.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.qianfeng.pojo.Area;


public interface AreaMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);

	/**
	 * @param id2
	 */
    @Select("select aid,name from area where pid=#{id2}")
   	@ResultType(Area.class)
	List<Area> findAreaByid(int id2);
}