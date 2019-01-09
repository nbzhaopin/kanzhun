package com.qianfeng.vo;

import java.util.List;

public class AskandAnswers {

	private Integer focus;//问题关注用户数量
	private Integer answercount;//问题回答数量
	private List<CommentVo> answers;
	public Integer getFocus() {
		return focus;
	}
	public void setFocus(Integer focus) {
		this.focus = focus;
	}
	public Integer getAnswercount() {
		return answercount;
	}
	public void setAnswercount(Integer answercount) {
		this.answercount = answercount;
	}
	public List<CommentVo> getAnswers() {
		return answers;
	}
	public void setAnswers(List<CommentVo> answers) {
		this.answers = answers;
	}
	
}
