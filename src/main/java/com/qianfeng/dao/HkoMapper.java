package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Hko;


public interface HkoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hko record);

    int insertSelective(Hko record);

    Hko selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hko record);

    int updateByPrimaryKey(Hko record);
    
    List<Hko> selectById(Integer id);
}