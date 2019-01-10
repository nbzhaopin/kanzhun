package com.qianfeng.pojo;

public class JobDetails {
    private Integer id;

    private String job;

    private String companyname;

    private Integer pay;

    private String name;

    private String identity;

    private Double replyspeed;

    private String jobdescribe;

    private String request;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public Double getReplyspeed() {
        return replyspeed;
    }

    public void setReplyspeed(Double replyspeed) {
        this.replyspeed = replyspeed;
    }

    public String getJobdescribe() {
        return jobdescribe;
    }

    public void setJobdescribe(String jobdescribe) {
        this.jobdescribe = jobdescribe == null ? null : jobdescribe.trim();
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request == null ? null : request.trim();
    }
}