package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Focush;

public interface FocushMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Focush record);

    int insertSelective(Focush record);

    Focush selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Focush record);

    int updateByPrimaryKey(Focush record);
    
    List<Focush> selectById(Integer id);
}