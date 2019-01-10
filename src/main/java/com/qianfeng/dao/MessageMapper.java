package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Message;
import com.qianfeng.vo.MessageVo;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
    
    List<MessageVo> selectAllById(Integer id);
}