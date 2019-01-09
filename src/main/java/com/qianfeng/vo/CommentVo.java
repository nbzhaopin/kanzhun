package com.qianfeng.vo;

import com.qianfeng.pojo.User;

public class CommentVo {

	private Integer id;
	private AnswerVo answerVo;
	private String content;
	private User replyUser;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public AnswerVo getAnswerVo() {
		return answerVo;
	}
	public void setAnswerVo(AnswerVo answerVo) {
		this.answerVo = answerVo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getReplyUser() {
		return replyUser;
	}
	public void setReplyUser(User replyUser) {
		this.replyUser = replyUser;
	}
	
	
}
