package com.qianfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.CommentMapper;
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

}
