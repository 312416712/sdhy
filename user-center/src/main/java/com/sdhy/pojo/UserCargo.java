package com.sdhy.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserCargo implements Serializable {
    //编号
    private Integer id;
    //密码
    private String Password;
    //性别
    private Integer sex;
    //手机号
    private String mobile;
    //用户头像
    private String logo;
    //登录状态
    private Integer status;
    //创建时间
    private Date registerTime;
    //登录时间
    private Date lastLoginTime;

    public UserCargo() {
    }

    public UserCargo(Integer id, String password, Integer sex, String mobile, String logo, Integer status, Date registerTime, Date lastLoginTime) {
        this.id = id;
        Password = password;
        this.sex = sex;
        this.mobile = mobile;
        this.logo = logo;
        this.status = status;
        this.registerTime = registerTime;
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}
