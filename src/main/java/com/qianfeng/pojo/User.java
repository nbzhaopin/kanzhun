package com.qianfeng.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="登录用户名",description="此类只包含登录首页的电话以及密码")
public class User {
	@ApiModelProperty(value="为自增字段，不用赋予值")
    private Integer id;
	@ApiModelProperty(value="用户电话",required=true)
    private String phone;

	@ApiModelProperty(value="为用户密码",required=true)
    private String password;

	@ApiModelProperty(value="默认为0 未删除状态，不用赋予值")
    private Integer flag;

    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}