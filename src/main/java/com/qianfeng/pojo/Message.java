package com.qianfeng.pojo;

public class Message {
	private Integer id;

    private String content;

    private Integer cid;

    private Integer uid;

    private Integer poid;

    private String metime;

    private String metype;

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

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPoid() {
        return poid;
    }

    public void setPoid(Integer poid) {
        this.poid = poid;
    }

    public String getMetime() {
        return metime;
    }

    public void setMetime(String metime) {
        this.metime = metime == null ? null : metime.trim();
    }

    public String getMetype() {
        return metype;
    }

    public void setMetype(String metype) {
        this.metype = metype == null ? null : metype.trim();
    }
}