package com.qianfeng.vo;

public class MessageVo {
	
	 private Integer id;//评论id

	 private String content;//评论内容

	 private String ciname;//城市名   外

	 private String metime;//在职时间
	    
	 private String grade;//公司评分  外
	    
	 private String icon;//用户头像 外
	    
	 private String nickname;//用户昵称 外
	 
	 private String poname;//职位 外

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
		this.content = content;
	}

	public String getCiname() {
		return ciname;
	}

	public void setCiname(String ciname) {
		this.ciname = ciname;
	}

	public String getMetime() {
		return metime;
	}

	public void setMetime(String metime) {
		this.metime = metime;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPoname() {
		return poname;
	}

	public void setPoname(String poname) {
		this.poname = poname;
	}
	 
}
