package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Ask;

public interface AskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ask record);

    int insertSelective(Ask record);

    Ask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ask record);

    int updateByPrimaryKey(Ask record);
    
    List<Ask> findAll();
}