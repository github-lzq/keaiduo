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
    
    private String username;
    private String password;
    private String email;
    private String mobile;
    private String question;
    private String answer;
    private int role;
    private Date creatTime;
    private Date updateTime;
}
