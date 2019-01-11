package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Issue;

public interface IssueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Issue record);

    int insertSelective(Issue record);

    Issue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Issue record);

    int updateByPrimaryKey(Issue record);
    
    List<Issue> selectById(Integer id);
}