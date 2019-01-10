package com.qianfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.CommentMapper;
import com.qianfeng.pojo.Comment;
import com.qianfeng.service.CommentService;
import com.qianfeng.vo.ResultVo;
@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentMapper commentMapper;
	@Override
	public ResultVo findCommentByAskId(Integer id) {
		// TODO Auto-generated method stub
		return ResultVo.setOK(commentMapper.findCommentByAskId(id));
	}
	@Override
	public ResultVo insertComment(Comment comment) {
		// TODO Auto-generated method stub
		if(commentMapper.insertSelective(comment)>0) {
			return ResultVo.setOK(null);
		}else {
			return ResultVo.setERROR();
		}
	}

}
