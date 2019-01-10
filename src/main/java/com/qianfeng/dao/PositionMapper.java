package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Position;

public interface PositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
    
    List<Position> findAllPosition();
}