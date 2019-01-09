package com.qianfeng.pojo;

public class Hko {
    private Integer id;

    private String 面试结果;

    private String time;

    private Integer poid;

    private Integer cid;

    private Integer uid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String get面试结果() {
        return 面试结果;
    }

    public void set面试结果(String 面试结果) {
        this.面试结果 = 面试结果 == null ? null : 面试结果.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Integer getPoid() {
        return poid;
    }

    public void setPoid(Integer poid) {
        this.poid = poid;
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
}