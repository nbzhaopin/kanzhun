package com.qianfeng.dao;

import com.qianfeng.pojo.Uinfo;

public interface UinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Uinfo record);

    int insertSelective(Uinfo record);

    Uinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Uinfo record);

    int updateByPrimaryKey(Uinfo record);
}