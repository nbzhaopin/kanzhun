package com.qianfeng.dao;

import com.qianfeng.pojo.Interestposition;

public interface InterestpositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Interestposition record);

    int insertSelective(Interestposition record);

    Interestposition selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Interestposition record);

    int updateByPrimaryKey(Interestposition record);
}