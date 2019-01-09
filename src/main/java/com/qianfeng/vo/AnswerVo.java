package com.qianfeng.vo;

import com.qianfeng.pojo.User;

public class AnswerVo {

	
	 	private Integer id;

	    private String content;

	    private User user;

	    private Integer askId;

	    private Integer check;

	    private String img;

	    private Byte anonymit;
	    
	    private Integer likes;

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

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
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
			this.img = img;
		}

		public Byte getAnonymit() {
			return anonymit;
		}

		public void setAnonymit(Byte anonymit) {
			this.anonymit = anonymit;
		}

		public Integer getLikes() {
			return likes;
		}

		public void setLikes(Integer likes) {
			this.likes = likes;
		}
	
	
	
}
