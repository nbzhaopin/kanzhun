package com.qianfeng.pojo;

public class Position {
    private Integer id;

    private String poname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPoname() {
        return poname;
    }

    public void setPoname(String poname) {
        this.poname = poname == null ? null : poname.trim();
    }
}