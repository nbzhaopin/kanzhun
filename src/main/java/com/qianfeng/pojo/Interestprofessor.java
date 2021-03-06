package com.qianfeng.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="用户感兴趣的行业")
public class Interestprofessor {
	@ApiModelProperty(value="自增字段你懂得")
    private Integer id;
	@ApiModelProperty(value="传入该用户id")
    private Integer uid;
	@ApiModelProperty(value="传入对应的行业id")
    private Integer prid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPrid() {
        return prid;
    }

    public void setPrid(Integer prid) {
        this.prid = prid;
    }
}