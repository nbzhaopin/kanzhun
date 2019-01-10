package com.qianfeng.pojo;

public class Job {
    private Integer id;

    private String jobdirection;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobdirection() {
        return jobdirection;
    }

    public void setJobdirection(String jobdirection) {
        this.jobdirection = jobdirection == null ? null : jobdirection.trim();
    }
}