package com.qianfeng.dao;

import com.qianfeng.pojo.Hko;

public interface HkoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hko record);

    int insertSelective(Hko record);

    Hko selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hko record);

    int updateByPrimaryKey(Hko record);
}