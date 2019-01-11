package com.qianfeng.pojo;

public class ProfessionHabit {
    private Integer id;

    private String status;

    private String wantprofession;

    private String wantaspect;

    private String wantworkarea;

    private String wantpay;

    private String flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getWantprofession() {
        return wantprofession;
    }

    public void setWantprofession(String wantprofession) {
        this.wantprofession = wantprofession == null ? null : wantprofession.trim();
    }

    public String getWantaspect() {
        return wantaspect;
    }

    public void setWantaspect(String wantaspect) {
        this.wantaspect = wantaspect == null ? null : wantaspect.trim();
    }

    public String getWantworkarea() {
        return wantworkarea;
    }

    public void setWantworkarea(String wantworkarea) {
        this.wantworkarea = wantworkarea == null ? null : wantworkarea.trim();
    }

    public String getWantpay() {
        return wantpay;
    }

    public void setWantpay(String wantpay) {
        this.wantpay = wantpay == null ? null : wantpay.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }
}