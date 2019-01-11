package com.qianfeng.dao;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.qianfeng.pojo.JianLi;
import com.qianfeng.pojo.ProfessionHabit;

public interface ProfessionHabitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProfessionHabit record);

    int insertSelective(ProfessionHabit record);

    ProfessionHabit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProfessionHabit record);

    int updateByPrimaryKey(ProfessionHabit record);

	/**
	 * @param id2
	 */
    @Select("select id,status,wantprofession,wantaspect,wantworkarea,wantpay,flag from professionhabit where id=#{id2} ")
	@ResultType(JianLi.class)
	ProfessionHabit findhabitByid(int id2);
}