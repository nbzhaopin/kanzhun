package com.qianfeng.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.qianfeng.pojo.Myfrinds;

public interface MyfrindsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Myfrinds record);

    int insertSelective(Myfrinds record);

    Myfrinds selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Myfrinds record);

    int updateByPrimaryKey(Myfrinds record);
    
    @Select("select id,name,profession,relation from myfriends ")
	@ResultType(Myfrinds.class)
    List<Myfrinds> findbyFlag(int flag);

	/**
	 * @param id
	 * @return
	 */
    @Update("update myfriend set flag=1 where id={#id}")
    @ResultType(int.class)
	int updateflagById(Integer id);

	/**
	 * @param relation
	 */
    @Select("select id,name,profession,relation from myfriends where relation={#relation}")
    @ResultType(Myfrinds.class)
	List<Myfrinds> findFriendsByRelation(String relation);
}