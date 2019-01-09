package com.qianfeng.dao;

import com.qianfeng.pojo.Pcom;

public interface PcomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pcom record);

    int insertSelective(Pcom record);

    Pcom selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pcom record);

    int updateByPrimaryKey(Pcom record);
}