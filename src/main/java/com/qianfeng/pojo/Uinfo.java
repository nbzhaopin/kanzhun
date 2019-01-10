package com.qianfeng.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="用户的具体信息")
public class Uinfo {
	@ApiModelProperty(value="自增id你懂得")
    private Integer id;
	@ApiModelProperty(value="昵称",required=true)
    private String nickname;
	@ApiModelProperty(value="性别",required=true)
    private Integer sex;
	@ApiModelProperty(value="自增id你懂得")
    private Integer identity;
	@ApiModelProperty(value="自增id你懂得")
    private String icon;
	@ApiModelProperty(value="自增id你懂得")
    private String address;
	@ApiModelProperty(value="自增id你懂得")
    private String presentation;
	@ApiModelProperty(value="自增id你懂得")
    private Integer uid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation == null ? null : presentation.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}