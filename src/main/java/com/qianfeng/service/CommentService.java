package com.qianfeng.service;

import com.qianfeng.pojo.Comment;
import com.qianfeng.vo.ResultVo;

public interface CommentService {

	ResultVo findCommentByAskId(Integer id);
	
	ResultVo insertComment(Comment comment);
}
