package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Comment;
import com.qianfeng.vo.CommentVo;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
    
    List<CommentVo> findCommentByAskId(Integer askId);
}