package com.qianfeng.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="用户答案",description="问答页面中对于问题的回答")
public class Answer {
	@ApiModelProperty(value="自增字段")
    private Integer id;

	@ApiModelProperty(value="回答的问题内容",required=true)
    private String content;

	@ApiModelProperty(value="传入用户对应的ID",required=true)
    private Integer userId;

	@ApiModelProperty(value="传入问题的对应id",required=true)
    private Integer askId;

	@ApiModelProperty(value="查看量，添加回答时不存在，默认是0")
    private Integer check;

	@ApiModelProperty(value="不用管，需要注意上传图片时name对应的值")
    private String img;

	@ApiModelProperty(value="是否匿名，1 yes  2 no，根据是否选择导入相应的值",required=true)
    private Byte anonymit;
    
	@ApiModelProperty(value="点赞数，默认为0")
    private Integer likes;

    public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAskId() {
        return askId;
    }

    public void setAskId(Integer askId) {
        this.askId = askId;
    }

    public Integer getCheck() {
        return check;
    }

    public void setCheck(Integer check) {
        this.check = check;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Byte getAnonymit() {
        return anonymit;
    }

    public void setAnonymit(Byte anonymit) {
        this.anonymit = anonymit;
    }
}