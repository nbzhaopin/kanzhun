package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Focusask;

public interface FocusaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Focusask record);

    int insertSelective(Focusask record);

    Focusask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Focusask record);

    int updateByPrimaryKey(Focusask record);
    
    List<Focusask> selectById(Integer id);
}