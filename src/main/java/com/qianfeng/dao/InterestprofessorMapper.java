package com.qianfeng.dao;

import com.qianfeng.pojo.Interestprofessor;

public interface InterestprofessorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Interestprofessor record);

    int insertSelective(Interestprofessor record);

    Interestprofessor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Interestprofessor record);

    int updateByPrimaryKey(Interestprofessor record);
}