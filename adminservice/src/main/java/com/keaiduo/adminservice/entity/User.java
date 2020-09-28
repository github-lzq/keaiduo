package com.keaiduo.adminservice.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@Api("用户表")
public class User {
    @ApiModelProperty(value = "用户ID",required = true)
    private int uid;
    @ApiModelProperty(value = "用户名")
    private String username;
    @ApiModelProperty(value = "密码",required = true)
    private String password;
    @ApiModelProperty(value = "邮箱")
    private String email;
    @ApiModelProperty(value = "手机")
    private String mobile;
    @ApiModelProperty(value = "找回密码问题")
    private String question;
    @ApiModelProperty(value = "找回密码答案")
    private String answer;
    @ApiModelProperty(value = "角色0-管理员,1-普通用户")
    private int role;
    @ApiModelProperty(value = "创建时间")
    private Date creatTime;
    @ApiModelProperty(value = "最后一次更新时间")
    private Date updateTime;
}
