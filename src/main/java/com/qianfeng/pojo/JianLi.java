package com.qianfeng.pojo;

public class JianLi {
    private Integer id;

    private String name;

    private String area;

    private String profession;

    private String birthday;

    private String email;

    private String status;

    private String wantjob;

    private String wanthangye;

    private String wantarea;

    private String wantpay;

    private String workexperience;

    private String eudcationexperience;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getWantjob() {
        return wantjob;
    }

    public void setWantjob(String wantjob) {
        this.wantjob = wantjob == null ? null : wantjob.trim();
    }

    public String getWanthangye() {
        return wanthangye;
    }

    public void setWanthangye(String wanthangye) {
        this.wanthangye = wanthangye == null ? null : wanthangye.trim();
    }

    public String getWantarea() {
        return wantarea;
    }

    public void setWantarea(String wantarea) {
        this.wantarea = wantarea == null ? null : wantarea.trim();
    }

    public String getWantpay() {
        return wantpay;
    }

    public void setWantpay(String wantpay) {
        this.wantpay = wantpay == null ? null : wantpay.trim();
    }

    public String getWorkexperience() {
        return workexperience;
    }

    public void setWorkexperience(String workexperience) {
        this.workexperience = workexperience == null ? null : workexperience.trim();
    }

    public String getEudcationexperience() {
        return eudcationexperience;
    }

    public void setEudcationexperience(String eudcationexperience) {
        this.eudcationexperience = eudcationexperience == null ? null : eudcationexperience.trim();
    }
}