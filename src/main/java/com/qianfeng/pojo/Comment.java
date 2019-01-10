package com.qianfeng.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="用户评论其他用户的问题答案")
public class Comment {
	@ApiModelProperty(value="不用管自增")
    private Integer id;
	@ApiModelProperty(value="该回答的id",required=true)
    private Integer answerId;
	@ApiModelProperty(value="用户评论内容",required=true)
    private String content;
	@ApiModelProperty(value="目前该用户的userId,得传",required=true) 
    private Integer userId;

    public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}