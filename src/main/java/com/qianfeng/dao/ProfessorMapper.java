package com.qianfeng.dao;

import com.qianfeng.pojo.Professor;

public interface ProfessorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Professor record);

    int insertSelective(Professor record);

    Professor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Professor record);

    int updateByPrimaryKey(Professor record);
}