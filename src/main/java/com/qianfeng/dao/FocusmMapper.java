package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Focusm;

public interface FocusmMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Focusm record);

    int insertSelective(Focusm record);

    Focusm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Focusm record);

    int updateByPrimaryKey(Focusm record);
    
    List<Focusm >selectById(Integer id);
}