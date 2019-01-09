package com.qianfeng.pojo;

public class Answer {
    private Integer id;

    private String content;

    private Integer userId;

    private Integer askId;

    private Integer check;

    private String img;

    private Byte anonymit;
    
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