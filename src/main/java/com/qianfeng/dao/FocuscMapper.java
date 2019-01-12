package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Focusc;

public interface FocuscMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Focusc record);

    int insertSelective(Focusc record);

    Focusc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Focusc record);

    int updateByPrimaryKey(Focusc record);
    
    List<Focusc> selectById(Integer id);
}